import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class Parse {

    public static void main(String[] args) throws IOException {

        String id = search();
        if (id != "False") {
            String url = "https://ru.wikipedia.org/w/api.php?action=query&pageids=" + id + "&format=xml&prop=extracts&explaintext=&exintro=";
            Document document = Jsoup.connect(url).get();
            Elements result = document.getElementsByTag("extract");
            String answer = result.toString();
            answer = answer.replaceAll("<extract xml:space=\"preserve\">", "").replaceAll("</extract>", "").replaceAll("( слушать)", "");
            int index = answer.indexOf(")");
            if (index != -1) {
                String start = answer.substring(0, 150);
                String end = answer.substring(50, answer.length()).replaceAll("\\. ", "\\.");
                end = answer.substring(50, answer.length()).replaceAll("\\.", ".\n");
                answer = start + end;
            } else if (index == -1) {
                answer = answer.replaceAll("\\. ", ".").replaceAll("\\.", ".\n");
            }
            System.out.println(answer.trim());
        }
    }

    private static String search() throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("О чем поведать вам?");
        String find = scanner.nextLine();
        System.out.println("Preparing the result...\n");
        String url = "https://ru.wikipedia.org/w/api.php?action=query&format=xml&list=search&srsearch=" + find;
        Document document = Jsoup.connect(url).get();
        Elements element = document.getElementsByTag("search");
        String id = element.toString();
        int index = id.indexOf("pageid");
        if (index != -1){
            id = id.substring(index, index+17);
            id = id.replaceAll("[^0-9]", "");
            return id;
        }else{
            System.out.println("Неверно выполнен запрос, либо не существует статьи на данную тему");
            return "False";
        }
    }
}

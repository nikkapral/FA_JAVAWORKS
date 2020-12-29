import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Sizes> allSizes = new ArrayList<>();
        allSizes.add(new Sizes("XXS",38));
        allSizes.add(new Sizes("XS",39));
        allSizes.add(new Sizes("S",40));
        allSizes.add(new Sizes("M",41));
        allSizes.add(new Sizes("L",42));


        List<Clothes> wear = new ArrayList<>();
        wear.add(new Clothes("Hoody"));
        wear.add(new Clothes("T-shirt"));


    }
}


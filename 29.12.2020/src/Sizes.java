public class Sizes {
    private String size;
    private int eurosize;

    public Sizes(String size, int eurosize) {
        this.size = size;
        this.eurosize = eurosize;
    }
    public String getSize(){
        return size;
    }

    public int getEurosize(){
        return eurosize;
    }

    public String getDescriprion(){
        switch (size){
            case "XXS":
                return ("XXS - очень маленький размер - " + eurosize);
            case "XS":
                return ("XS - маленький размер - " + eurosize);
            case "S":
                return ("S - средний размер - " + eurosize);
            case "M":
                return ("M - большой размер - " + eurosize);
            case "L":
                return ("L - очень большой размер - " + eurosize);
            default:
                return null;


        }


    }

}
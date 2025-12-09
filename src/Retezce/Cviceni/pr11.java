package Retezce.Cviceni;

public class pr11 {
    public static void main(String[] args) {
        String palindrom = "oko";
        String obraceny = new StringBuilder(palindrom).reverse().toString();

        if(palindrom.equals(obraceny)){
            System.out.println("Je to palindrom");
        }else System.out.println("není palindrom");


    }
}

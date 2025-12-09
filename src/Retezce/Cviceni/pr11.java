package Retezce.Cviceni;

public class pr11 {
    public static void main(String[] args) {
        String palindrom = "Jelenovi pivo nelej";

        palindrom = palindrom.replace(" ","");
        palindrom = palindrom.toLowerCase();

        String obraceny = new StringBuilder(palindrom).reverse().toString();

        if(palindrom.equals(obraceny)){
            System.out.println("Je to palindrom");
        }else System.out.println("není palindrom");


    }
}

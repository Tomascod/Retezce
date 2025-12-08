package Retezce.Cviceni;

public class pr6 {
    public static void main(String[] args) {
        int cislo = 12345;
        String cislicko = Integer.toString(cislo);

        for (int i = cislicko.length()-1; i >= 0 ; i--) {
            System.out.print(cislicko.charAt(i));
        }
    }
}

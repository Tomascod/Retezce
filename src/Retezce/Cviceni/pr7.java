package Retezce.Cviceni;

public class pr7 {
    public static void main(String[] args) {
        String retezec = "maxipesfíkus";

        for (int i = 0; i <= retezec.length()-1; i++) {
            if ((i+1)%2==0) {
                System.out.print(retezec.toLowerCase().charAt(i));
            } else System.out.print(retezec.toUpperCase().charAt(i));
        }
    }
}


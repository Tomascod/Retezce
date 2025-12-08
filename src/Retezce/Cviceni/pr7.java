package Retezce.Cviceni;

public class pr7 {
    public static void main(String[] args) {
        String retezec = "Maxipes";

        Character.toUpperCase(retezec.charAt(0));

        for (int i = 0; i <= retezec.length()-1; i++) {
            if (i%2==0) {
                System.out.print(Character.toLowerCase(retezec.charAt(i)));
            } else if (i%2>0) {
                System.out.print(Character.toUpperCase(retezec.charAt(i)));
            }
        }
    }
}


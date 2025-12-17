package Retezce.Cviceni;

public class pr12 {
    public static void main(String[] args) {
        String text = "Ahoj";
        char[] abeceda = {
                'A','B','C','D','E','F','G','H','I','J',
                'K','L','M','N','O','P','Q','R','S','T',
                'U','V','W','X','Y','Z'
        };

        String[] morseovka = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        String slovoPredelane = "";

        for (int i = 0; i <= text.length()-1; i++) {
            for (int j = 0; j <= abeceda.length-1; j++) {
                if ( text.toUpperCase().charAt(i)==abeceda[j]) {
                    slovoPredelane += morseovka[j];
                }
            }
        }
        System.out.println(slovoPredelane);
    }
}

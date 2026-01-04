package Procvicovaninatest;

public class pr7 {
    public static void main(String[] args) {
        String text = "tOmasKroKodlo";

        for (int i = 0; i <= text.length()-1 ; i++) {
            if ((i+1)%2>=1){
                System.out.print(Character.toUpperCase(text.charAt(i)));

            }else {
                System.out.print(Character.toLowerCase(text.charAt(i)));
            }
        }
    }
}

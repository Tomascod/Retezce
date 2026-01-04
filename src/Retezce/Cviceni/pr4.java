package Retezce.Cviceni;

public class pr4 {
    public static void main(String[] args) {
    String text = "Halloween";
    Boolean ano = false;

        for (int i = 1; i <= text.length()-1; i++) {
            if (text.charAt(i-1)==text.charAt(i)){
                ano = true;
            }
        }
        if (ano){
            System.out.println("ano");
        }else System.out.println("ne");
    }
}

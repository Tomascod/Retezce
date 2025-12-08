package Retezce.Cviceni;

public class pr2 {
    public static void main(String[] args) {
        String text = "pssko";
        boolean ano = false;
        for (int i = 0; i <= text.length()-1; i++) {
            if(Character.isUpperCase(text.charAt(i))){
                 ano = true;
                 break;
            }else ano = false;
        }
        if (ano) System.out.println(text);
        else System.out.println(text.toUpperCase());
    }
}

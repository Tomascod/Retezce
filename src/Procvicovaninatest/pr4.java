package Procvicovaninatest;

public class pr4 {
    public static void main(String[] args) {
    String text = "Halloween";
    boolean idk = false;
        for (int i = 1; i <= text.length()-1 ; i++) {
            if (text.charAt(i)==text.charAt(i-1)){
                idk = true;
            }
        }
        if (idk){
            System.out.println("nachází se zdvojená písmena");
        }else System.out.println("nenachází se zdvojená");
}
}

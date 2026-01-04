package Procvicovaninatest;

public class cv2 {
    public static void main(String[] args) {
    String text = "ahoj";
    boolean idk = true;
        for (int i = 0; i <= text.length()-1 ; i++) {
            if(Character.isUpperCase(text.charAt(i))){
                idk = false;
            }
        }
        if (idk) {
            System.out.println(text.toUpperCase());
        }else System.out.println(text);
}
}

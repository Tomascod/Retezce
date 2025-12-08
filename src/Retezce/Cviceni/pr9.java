package Retezce.Cviceni;

public class pr9 {
    public static void main(String[] args) {
        String rodnCislo = "080916/4268";
        String mesic = rodnCislo.substring(2,4);

        if ((mesic.startsWith("5")||(mesic.startsWith("6")))){
            System.out.println("Žena");
        }else System.out.println("Muž");



    }
}

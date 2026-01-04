package Procvicovaninatest;

public class pr9 {
    public static void main(String[] args) {
        String rodnCislo = "080916/4268";
        if ((rodnCislo.substring(2, 4).startsWith("5"))||(rodnCislo.substring(2, 4).startsWith("6"))){
            System.out.println("Žena");
        }else System.out.println("Muž");
    }
}

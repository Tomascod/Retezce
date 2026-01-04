package Procvicovaninatest;

public class pr11 {
    public static void main(String[] args) {
        String text = "jelenovi pivo nele";
        String spojeno = text.replace(" ","");
        String obracene = new StringBuilder(spojeno).reverse().toString();

    if (spojeno.equals(obracene)) {
        System.out.println("je");
    }else System.out.println("není");

    }
}

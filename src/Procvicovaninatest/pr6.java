package Procvicovaninatest;

public class pr6 {
    public static void main(String[] args) {
        int cislo = 12345;
        String pozadu = new StringBuilder(Integer.toString(cislo)).reverse().toString();
        System.out.println(pozadu);
    }
}

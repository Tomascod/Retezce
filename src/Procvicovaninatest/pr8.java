package Procvicovaninatest;

public class pr8 {
    public static void main(String[] args) {
        String jmeno = "toMáš KoDýdek";
        String[] rozdeleni = jmeno.split(" ");

        System.out.println(rozdeleni[0].substring(0,1).toUpperCase()+ rozdeleni[0].substring(1).toLowerCase()+" "+rozdeleni[1].toUpperCase());

    }
}

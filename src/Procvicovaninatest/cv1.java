package Procvicovaninatest;

public class cv1 {
    public static void main(String[] args) {
        String[] jmena = {"Petr","Alois","Ivan"};
        String uzivJmeno = "Ivan";
        boolean idk = false;

        for(String ano: jmena) {
            if (ano.equalsIgnoreCase(uzivJmeno)) {
            idk = true;
}
    }if (idk){
            System.out.println("Uživatelské jméno je "+uzivJmeno);
        }else System.out.println("Uživatelské jméno nenalezeno");
    }}

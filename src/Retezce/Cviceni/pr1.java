package Retezce.Cviceni;

public class pr1 {
    public static void main(String[] args) {
        String[] jmena = {"Tomáš","Petr","Eva","Natálie","Ben"};
        String uzivJmeno = "tomáš";
        boolean ano = false;

        for (int i = 0; i <= jmena.length-1 ; i++) {
            if (uzivJmeno.toLowerCase().equals(jmena[i].toLowerCase())){
                 ano = true;
            }
        }
        if (ano){
            System.out.println("Uživatelské jméno je "+uzivJmeno);
        }else System.out.println("Uživatelské jméno nenalezeno");
    }
}

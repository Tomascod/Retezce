package Retezce.Cviceni;

public class pr8 {
    public static void main(String[] args) {
        String jmeno = "tOMÁŠ kOdÝDeK";
        String[] rozdeleni = jmeno.split(" ");

        String krestni =  rozdeleni[0].substring(0,1).toUpperCase() + rozdeleni[0].substring(1).toLowerCase();
        String prijmeni = rozdeleni[1].toUpperCase();
        System.out.println(krestni+" "+prijmeni);
     }
}

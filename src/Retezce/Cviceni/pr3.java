package Retezce.Cviceni;

public class pr3 {
    public static void main(String[] args) {
        String[] pole = {"slovo","pes","kočka","nevím","idk","žralok","delfín","želva"};
        for (int i = 0; i <=pole.length-1; i++) {
            if (i==0||i == pole.length-1){
                String nove = pole[i].toUpperCase();
                System.out.println(nove);
            }else System.out.println(pole[i]);
        }
    }
}

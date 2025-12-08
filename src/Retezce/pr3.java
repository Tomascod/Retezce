package Retezce;

public class pr3 {
    public static void main(String[] args) {
        String[] pole = {"pes","kočka","nevím","idk","žralok"};
        for (int i = 0; i <=pole.length-1; i++) {
            if (i==0||i== pole.length-1){
                String nove = pole[i].toUpperCase();
                System.out.println(nove);
            }else System.out.println(pole[i]);
        }

    }
}

package Procvicovaninatest;

public class cv3 {
    public static void main(String[] args) {
    String[] pole = {"idk","ano","ne","petr","žralok","slon","mucholapka"};

        for (int i = 0; i <= pole.length-1 ; i++) {
            if (i==0||i==pole.length-1) {
                System.out.println(pole[i].toUpperCase());
            }else System.out.println(pole[i]);

        }
}
}

package Retezce;

public class Retezce_indexy {
    public static void main(String[] args) {
        String a = "";
        System.out.println(a);
        String as = new String("neckhurts");
        String ad = "\t necks";
        System.out.println(ad.trim());
        System.out.println(ad.replace("e","i").trim());
        System.out.println(as.indexOf("hurts"));
        System.out.println(as.substring(4));
        System.out.println(as.substring(4,9));
        System.out.println();
        System.out.println(String.valueOf(true));
        String[] casti = "a b c d".split(" ");
        for (String cast:casti){
            System.out.println(cast);
        }
        String cast1 = "neck";
        String cast2 = "hurts";
        System.out.println(String.join("", cast1 , cast2));

        //indexOf a lastIndexOf vrací index znaku ve stringu
        //pokud ten znak není ve stringu tak vrací hodnotu -1
        //metoda substring() vrací část řetězce a jsou dvě varianty, jedna jenom s beginIndex a odtud to napíše až do konce a pak je druhá, kde jsou dva parametry, ten druhý je endsIndex a tam to končí (musíme dát hodnotu o 1 větši)
        //metody startsWith() a endsWith() hledá, čím string začíná/končí
        //metoda trim() odstraňuje mezery na začátku a konci Stringu (nejen mezery), ale ne uvnitř Stringu
        //metoda replace() nahradí část řetězce jiným obsahem oldChar a newChar -> nahradíme staré písmeno novým (například)
        //metoda valueOf() převede libovolný datový typ na řetězec -> bude příklad a volá se String.valueOf(proměnná)
        //spojování a rozdělování řetězců -> split() a join() do splitu musime zadat znak, podle ktereho to budeme delit a join musime opet dat String.join(co bude mezi castema, cast, cast)

    }

}

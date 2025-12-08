package Retezce.poznamky;

public class Retezce_poznamky_do_podrobna {
        public static void main(String[] args) {
            String text = "  Ahoj světe!  ";

            // indexOf / lastIndexOf
            System.out.println(text.indexOf("o"));      // 3
            System.out.println(text.lastIndexOf("e"));  // 10
            System.out.println(text.indexOf("x"));      // -1 (není tam)

            // substring
            System.out.println(text.substring(2));      // "Ahoj světe!  "
            System.out.println(text.substring(2, 6));   // "Ahoj"

            // startsWith / endsWith
            System.out.println(text.startsWith("  A")); // true
            System.out.println(text.endsWith("!  "));   // true

            // trim
            System.out.println(text.trim());            // "Ahoj světe!"

            // replace
            System.out.println(text.replace("Ahoj", "Nazdar")); // "  Nazdar světe!  "

            // valueOf
            int cislo = 123;
            String cisloString = String.valueOf(cislo);
            System.out.println(cisloString + " je teď String");

            // split / join
            String[] slova = text.trim().split(" ");
            for (String s : slova) {
                System.out.println(s);
            }
            String spojene = String.join("-", slova);
            System.out.println(spojene); // "Ahoj-světe!"

            // contains
            System.out.println(text.contains("světe")); // true

            // charAt
            char znak = text.charAt(2);
            System.out.println(znak); // 'A'

            // Character class
            System.out.println(Character.isLetter(znak));     // true
            System.out.println(Character.isDigit('5'));       // true
            System.out.println(Character.isUpperCase('A'));   // true
            System.out.println(Character.isLowerCase('a'));   // true

            // toString na char
            char c = 'Z';
            String cString = Character.toString(c);
            System.out.println(cString); // "Z"
        }
    }

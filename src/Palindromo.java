import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        String palabra = pedirFrase(scanner);
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion(scanner);
            ejecutarOpcion(opcion, palabra);
        } while (opcion != 5);
        scanner.close();
    }

    public static String pedirFrase(Scanner lector) {
        System.out.println("Escriba la frase con la que quiera trabajar:");
        return lector.nextLine();
    }

    public static void mostrarMenu() {
        System.out.println("1. Verificar si una frase es Palíndromo");
        System.out.println("2. Contar vocales");
        System.out.println("3. Encriptar una frase");
        System.out.println("4. Desencriptar una frase");
        System.out.println("5. Salir");
    }

    public static int leerOpcion(Scanner in) {
        System.out.println("Escoja el numero correspondiente a la opcion deseada:");
        return in.nextInt();
    }

    public static void ejecutarOpcion(int opcion, String palabra) {
        switch (opcion) {
            case 1 -> verificarYMostrarPalindromo(palabra);
            case 2 -> contarVocales(palabra);
            //case 3 -> System.out.println("");
            //case 4 -> System.out.println("");
            case 5 -> System.out.println("Nos vemos");
            default -> System.out.println("Opcion no valida elija un numero del 1 al 5.");
        }
    }

    public static void verificarYMostrarPalindromo(String palabra) {
        if (verificarPalindromo(palabra)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
    }

    public static boolean verificarPalindromo(String palabra) {
        String fraseLimpia = palabra.toLowerCase().replaceAll("\\s+", "");
        String invertida = new StringBuilder(fraseLimpia).reverse().toString();
        return fraseLimpia.equals(invertida);
    }
    public static void contarVocales(String palabra){
        for (int i = 0; i < palabra.length(); i++) {

        }
    }
}
import java.util.Scanner;

public class Palindromo {
        public static void main(String[] args) {
            menu();
        }

    public static void menu() {
        Scanner respuesta = new Scanner(System.in);
        int opcion;
        Scanner frase = new Scanner(System.in);
        java.lang.String palabra = pedirFrase(frase);

        do {
            mostrarMenu();
            opcion = leerOpcion(respuesta, palabra);
        } while (opcion != 5);
        respuesta.close();

    }

    public static String pedirFrase(Scanner Lector){
            System.out.println("Escriba la frase con la que quiera trabajar");
            String frase = Lector.nextLine();
            return frase;

    }
    public static void mostrarMenu(){
            System.out.println("1. Verificar si una frase es Palindromo");
            System.out.println("2. Contar vocales en una frase");
            System.out.println("3. Encriptar una frase");
            System.out.println("4. Desencriptar una frase");
            System.out.println("5. Salir");
    }
    public static int leerOpcion(Scanner in, String palabra) {
        System.out.println("Escoja el número correspondiente a la opción deseada:");
        return in.nextInt();
        }
    public static void ejecutarOpcion(int respuesta, Scanner in) {
            switch (respuesta) {
                //case 1 -> verificarPalindromo();
                //case 2 -> contarVocales();
                //case 3 -> encriptarFrase();
                //case 4 -> desencriptarFrase();
                case 5 -> System.out.println("Nos vemos.");
                default -> System.out.println("Opcion no valida");
            }
    }

    //public static Boolean verificarPalindromo(){

    //}

    //public static int contarVocales(){

    //}

    //public static String encriptarFrase(){

    //}

    //public static String desencriptarFrase(){

    //}

}


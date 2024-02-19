import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("manzana", "apple");
        diccionario.put("amor", "love");
        diccionario.put("conciencia", "awareness");
        diccionario.put("perdón", "forgiveness");
        diccionario.put("amistad", "friendship");
        diccionario.put("bonita", "pretty");
        diccionario.put("maravilloso", "wonderful");
        diccionario.put("primavera", "spring");
        diccionario.put("verano", "summer");
        diccionario.put("otoño", "fall");
        diccionario.put("invierno", "winter");
        diccionario.put("rosa", "pink");
        diccionario.put("azul", "blue");
        diccionario.put("amarillo", "yellow");
        diccionario.put("verde", "green");
        diccionario.put("rojo", "red");
        diccionario.put("morado", "purple");
        diccionario.put("felicidad", "happiness");

        // Solicitar palabra al usuario
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese una palabra en español (o 'cerrar sesion' para salir): ");
            String palabraEspañol = scanner.nextLine();

            if (palabraEspañol.equalsIgnoreCase("cerrar sesion")) {
                System.out.println("Sesión terminada");
                break;  // Salir del bucle
            } else if (diccionario.containsKey(palabraEspañol)) {
                // Imprimir la traducción
                String palabraIngles = diccionario.get(palabraEspañol);
                System.out.println("La traducción al inglés es: " + palabraIngles);
            } else {
                // Imprimir mensaje si la palabra no se encuentra en el diccionario.
                System.out.println("La palabra no se encuentra en el diccionario.");

                // Permitir al usuario ingresar una nueva traducción
                System.out.print("Ingrese la traducción al inglés: ");
                String palabraInglesNueva = scanner.nextLine();

                // Agregar la nueva palabra al diccionario
                diccionario.put(palabraEspañol, palabraInglesNueva);
                System.out.println("Palabra añadida al diccionario.");
            }
        }

        // Cerrar el scanner fuera del bucle
        scanner.close();
    }
}



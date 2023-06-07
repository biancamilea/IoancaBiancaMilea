import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese la ruta y nombre del archivo de texto: ");
      String filePath = br.readLine();

      File file = new File(filePath);

      if (file.exists()) {
        System.out.println("El archivo existe.");
        int wordCount = contarPalabras(file);
        System.out.println("El número de palabras en el archivo es: " + wordCount);
      } else {
        System.out.println("El archivo no existe.");
      }
    } catch (IOException e) {
      System.out.println("Error al leer desde el teclado: " + e.getMessage());
    }
  }

  private static int contarPalabras(File file) {
    int wordCount = 0;

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] words = line.split("\\s+");
        wordCount += words.length;
      }
    } catch (IOException e) {
      System.out.println("Error al leer el archivo: " + e.getMessage());
    }

    return wordCount;
  }
}

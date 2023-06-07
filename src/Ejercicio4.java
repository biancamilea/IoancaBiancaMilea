import java.io.*;
import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
      mostrarMenu();
      opcion = scanner.nextInt();
      switch (opcion) {
        case 1:
          crearArchivoBinario();
          break;
        case 2:
          mostrarArchivoBinario();
          break;
        case 3:
          System.out.println("¡Hasta luego!");
          break;
        default:
          System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
          break;
      }
    } while (opcion != 3);

    scanner.close();
  }

  private static void mostrarMenu() {
    System.out.println("----- Menú -----");
    System.out.println("1. Crear archivo binario");
    System.out.println("2. Mostrar contenido del archivo binario");
    System.out.println("3. Salir del programa");
    System.out.print("Selecciona una opción: ");
  }

  private static void crearArchivoBinario() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce tu nombre: ");
    String nombre = scanner.nextLine();

    System.out.print("Introduce tu edad: ");
    int edad = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Introduce tu ciudad de nacimiento: ");
    String ciudad = scanner.nextLine();

    try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("archivo.bin"))) {
      outputStream.writeUTF(nombre);
      outputStream.writeInt(edad);
      outputStream.writeUTF(ciudad);
      System.out.println("Archivo binario creado exitosamente.");
    } catch (IOException e) {
      System.out.println("Error al crear el archivo binario.");
    }
  }

  private static void mostrarArchivoBinario() {
    try (DataInputStream inputStream = new DataInputStream(new FileInputStream("archivo.bin"))) {
      String nombre = inputStream.readUTF();
      int edad = inputStream.readInt();
      String ciudad = inputStream.readUTF();

      System.out.println("Nombre: " + nombre);
      System.out.println("Edad: " + edad);
      System.out.println("Ciudad de nacimiento: " + ciudad);
    } catch (IOException e) {
      System.out.println("Error al mostrar el contenido del archivo binario.");
    }
  }
}

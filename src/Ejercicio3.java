public class Ejercicio3 {
  public static void main(String[] args) {
    double[] numeros = {6.2, 3.4, 8.3, 1.6, 9.9};

    ArrayReales array = new ArrayReales(numeros);

    System.out.println("Valor mínimo: " + array.minimo());
    System.out.println("Valor máximo: " + array.maximo());
    System.out.println("Suma total: " + array.sumatorio());
  }
}

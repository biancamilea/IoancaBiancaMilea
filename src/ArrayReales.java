import java.util.Arrays;

public class ArrayReales implements Estadisticas {
  private double[] arreglo;

  public ArrayReales(double[] arreglo) {

    this.arreglo = arreglo;
  }

  @Override
  public double minimo() {
    return Arrays.stream(arreglo).min().orElse(0);
  }

  @Override
  public double maximo() {
    return Arrays.stream(arreglo).max().orElse(0);
  }

  @Override
  public double sumatorio() {
    return Arrays.stream(arreglo).sum();
  }
}
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Ejercicio5 {
  public static void main(String[] args) {
    List<String> listaUno = new ArrayList<>();
    listaUno.add("Lunes");
    listaUno.add("Martes");
    listaUno.add("Miércoles");
    listaUno.add("Jueves");
    listaUno.add("Viernes");
    listaUno.add("Sábado");
    listaUno.add("Domingo");

    listaUno.add(4, "Juernes");

    List<String> listaDos = new ArrayList<>(listaUno);

    listaUno.addAll(listaDos);

    System.out.println("Elemento en la posición 3: " + listaUno.get(2));
    System.out.println("Elemento en la posición 4: " + listaUno.get(3));

    System.out.println("Primer elemento: " + listaUno.get(0));
    System.out.println("Último elemento: " + listaUno.get(listaUno.size() - 1));

    boolean eliminado = listaUno.remove("Juernes");
    if (eliminado) {
      System.out.println("Se eliminó el elemento 'Juernes' de la lista");
    } else {
      System.out.println("El elemento 'Juernes' no se encontraba en la lista");
    }

    Iterator<String> iterator = listaUno.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    boolean existeLunes = false;
    for (String dia : listaUno) {
      if (dia.equalsIgnoreCase("lunes")) {
        existeLunes = true;
        break;
      }
    }
    if (existeLunes) {
      System.out.println("La lista contiene el elemento 'Lunes' (mayúsculas o minúsculas)");
    } else {
      System.out.println("La lista no contiene el elemento 'Lunes' (mayúsculas o minúsculas)");
    }

    listaUno.stream().sorted().forEach(System.out::println);

    listaUno.clear();
    System.out.println("La lista ha sido borrada y ahora está vacía.");
  }
}

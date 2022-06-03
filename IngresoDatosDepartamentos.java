import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IngresoDatosDepartamentos {
    Scanner sc = new Scanner(System.in);

    List <String> lista = new ArrayList<>();

    public void departamentos (){
        System.out.println("Ingrsa nombre del Departamento");
        String departamento = sc.nextLine();
        System.out.println("Ingresa la Cantidad de municipios");
        String cantidad = sc.nextLine();
        System.out.println("Ingresa el nombre de la cabecera");
        String cabecera = sc.nextLine();

        lista.add( "Departamento: "+ departamento);
        lista.add("Cantidad de Municipios: " + cantidad);
        lista.add("Cabesera Departamental " + cabecera);
        lista.add("");

        return ;
    }

}

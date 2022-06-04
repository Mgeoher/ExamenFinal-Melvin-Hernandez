import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IngresoDatosDepartamentos extends RegistrarDatos{
    List  lista = new ArrayList<>();
    protected String departamento;
    protected String municipios;
    protected String cabecera;


    Scanner sc = new Scanner(System.in);



    public void departamentos () {
        System.out.println("Ingresa nombre del Departamento");
        departamento = sc.nextLine();
        System.out.println("Ingresa la Cantidad de municipios");
        municipios = sc.nextLine();
        System.out.println("Ingresa el nombre de la cabecera");
        cabecera = sc.nextLine();

        lista.add("");
        lista.add(departamento);
        lista.add(municipios);
        lista.add(cabecera);
        lista.add("");

        this.registrarDatos(departamento,municipios,cabecera);
    }


    public void mostrarLista (){

        for (int i = 0; i <= lista.size() - 1; i++) {

            System.out.println(lista.get(i));

        }
    }
    public  void busqueda (){
        System.out.println("Ingrese el nombre del departamento para la busqueda");
        String busqueda = sc.nextLine();



        int indice = lista.indexOf(busqueda);
        if (indice != -1) {
            System.out.println("La búsqueda de " + busqueda + " está en el índice " + indice + " del historial de datos ");
        } else {
            System.out.println("El elemento " + busqueda + " no existe");
        }
    }
}

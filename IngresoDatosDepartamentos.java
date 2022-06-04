import java.util.Scanner;

public class IngresoDatosDepartamentos extends RegistroMustraDatos {

    //protected String departamento;
    //protected String municipios;
    //protected String cabecera;


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

        this.registrarDatosVectores();



    }
}

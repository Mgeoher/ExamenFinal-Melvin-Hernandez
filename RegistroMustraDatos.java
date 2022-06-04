import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class RegistroMustraDatos {
    List  lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    protected String departamento;
    protected String municipios;
    protected String cabecera;

    String[] departamentos ;
    String[] municipio ;
    protected int indice;

    public RegistroMustraDatos() {
        this.departamentos = new String[5];
        this.municipio = new  String[5];
        this.indice = 0;
    }

    public void registrarDatosVectores() { // registra los datos con vectores

        this.departamentos[indice] = departamento ;
        this.municipio[indice] = "Numero de municipios: " + municipios + " --> " + "Cabecera Departamental: " +  cabecera;

        this.indice = this.indice + 1;


    }
    public void mostrarDatosVectores() { // muestra el historial con vectores

        for(int i = 0; i<this.departamentos.length; i++){
            if(this.departamentos[i]!=null){
                System.out.println(departamentos[i]);
            }
        }
        for(int i = 0; i<this.municipio.length; i++){
            if(this.municipio[i]!=null){
                System.out.println(municipio[i]);
            }
        }


    }
    public void mostrarLista (){ // muestra el historial en lista
        for (int i = 0; i <= lista.size() - 1; i++) {
            System.out.println(lista.get(i));
        }
    }
    public void busquedaLista(){ // es la busuqeda de los datos en la lista
        System.out.println("Ingrese el nombre del departamento para la busqueda");
        String busqueda = sc.nextLine();
        int indice = lista.indexOf(busqueda);
        if (indice != -1) {
            System.out.println("La búsqueda de " + busqueda + " está en el índice " + indice + " del historial de datos ");
        } else {
            System.out.println("El elemento " + busqueda + " no existe");
        }
    }


    public static int busquedaVector(String [] arreglo, String buscar) {
        for (int i = 0; i < arreglo.length; i++) {
            if (buscar.equals (arreglo[i])) {
                return i;
            }
        }
        return -1;
    }
    public void buscarVector(){
        System.out.println("Ingresa el nombre del departamneto a buscar");
        String buscar = sc.nextLine();

        int posicion = busquedaVector(departamentos, buscar);
        if (posicion != -1) {
            System.out.println("El elemento " + buscar + " existe en la posición: " + posicion + " y la cabecera departamental es " + cabecera );
        } else {
            System.out.println("El elemento  " + buscar + "  NO existe en el arreglo");
        }
    }


    }



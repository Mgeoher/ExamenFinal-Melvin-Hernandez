import java.util.Scanner;

public class Menu  extends IngresoDatosDepartamentos {
    Scanner sc = new Scanner(System.in);
    public boolean salir = false;
    public boolean regresar = true;

    public void menu() {
        do {
            System.out.println("Escribe una opcion");
            System.out.println("1-Ingresar Datos "+"2-Historial de Datos "+"3-Limpiar Historial "+"0-Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    this.departamentos();
                    break;
                case 2:
                    this.mostrarLista();
                    do {
                        System.out.println("se encuentra el dato? "+ "1-si regresar " + "2- no " );
                        int op1 = sc.nextInt();
                        switch (op1){
                            case 1: regresar = false;
                            break;
                            case 2:this.busqueda();
                            break;
                            default: System.out.println("Solo numeros 1 y 2");
                        }

                    }while (regresar);

                            break;
                case 3:
                    System.out.println("Historial Limpiado");
                    lista.clear();
                    break;
                        case 0:
                            System.out.println("Vuelva pronto");
                            salir = true;
                            break;
                        default:
                            System.out.println("Intente de nuevo");
                    }
            } while (!salir) ;
        }
    }


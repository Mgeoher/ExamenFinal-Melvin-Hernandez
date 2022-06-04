import java.util.Scanner;

public class Menu  extends IngresoDatosDepartamentos {
    Scanner sc = new Scanner(System.in);
    public boolean salir = false;
    public boolean regresar = true;

    public void menu() {
        do {
            System.out.println("Escribe una opcion");
            System.out.println("1-Ingresar Datos "+"2-Historial de Datos "+"3-Buequeeda de datos "+"0-Salir");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    this.departamentos();
                    break;
                case 2:
                    this.mostrarLista();

                            break;
                case 3:
                    this.busqueda();
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


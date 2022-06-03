import java.util.Scanner;

public class Menu  extends IngresoDatosDepartamentos{
    Scanner sc = new Scanner(System.in);
    public boolean salir = false;

    public void menu () {
        do {
            System.out.println("Escribe una opcion");
            int opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    this.departamentos();
                    break;
                case 2:
                    lista.size();
                    lista.get(0);
                    for (int i = 0; i <= lista.size() - 1; i++) {
                        System.out.println(lista.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Vuelva pronto");
                    salir = true;
                    break;
            }
        }while (!salir);
    }
}

import java.util.Scanner;

public class Hombre {
    private String nombre;

    public Hombre(String nombre) {
        this.nombre = nombre;
    }

    public void jugarConRobot(Robot robot){
        Scanner teclado = new Scanner(System.in);
        int opc;

        do{
            System.out.println("----MENU DE INTERACCIONES----");
            System.out.println("1-Avanzar una cantidad de pasos.");
            System.out.println("2-Retroceder una cantidad de pasos.");
            System.out.println("3-Ver la energia actual del robot.");
            System.out.println("4-Dormir al robot. (FINALIZAR SESION)");
            System.out.println("5-Despertar al robot. ");
            System.out.println("6-Recargar la bateria del robot.");
            System.out.println("SELECCIONE UNA OPCIÓN: ");
            opc= teclado.nextInt();

            switch(opc){
                case 1->{
                    System.out.println("¿Cuantos pasos desea avanzar?: ");
                    int pasosAvanzar= teclado.nextInt();
                    robot.avanzar(pasosAvanzar);
                }
                case 2->{
                    System.out.println("¿Cuantos pasos desea retroceder?: ");
                    int pasosRetroceder = teclado.nextInt();
                    robot.retroceder(pasosRetroceder);
                }
                case 3->{
                    System.out.println("La energía actual del robot es "+ robot.energiaActual()+"unidades." );
                }
                case 4->{
                    robot.dormir();
                }
                case 5->{
                    robot.despertar();
                }
                case 6->{
                    robot.recargar();
                }
                default->{
                    System.out.println("Opcion invalida. Intente de nuevo.");
                }
            }
        }while(!robot.estaDormido());


     System.out.println(nombre+" ha finalizado la sesion con el robot.");


    }
}

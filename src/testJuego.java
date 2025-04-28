public class testJuego{
    public static void main(String[] args) {
       Robot robot = new Robot();

        Hombre hombre1 = new Hombre("Alejandro");
        hombre1.jugarConRobot(robot);

        if(robot.estaDormido()){
            System.out.println("\n Un segundo hombre llega para interactuar....");
            Hombre hombre2 = new Hombre("Jose");
            robot.despertar();
            hombre2.jugarConRobot(robot);

        }
    }
}
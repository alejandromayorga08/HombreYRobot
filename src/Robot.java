public class Robot {
    private Bateria bateria;
    private boolean dormido;

    public Robot() {
        this.bateria = new Bateria(1000);
        this.dormido = false;
    }

    public void avanzar(int pasos){
        if(dormido){
            System.out.println("El robot esta dormido.No puede avanzar");
            return;
        }
        if(bateria.getCarga()==0){
            System.out.println("La bateria esta vacia.El robot no puede avanzar");
            return;
        }
        int energiaConsumida=(pasos/100)*10;
        int nuevaCarga = bateria.getCarga()-energiaConsumida;
        if(nuevaCarga<0) nuevaCarga = 0;
        bateria.setCarga(nuevaCarga);
        System.out.println("El robot avanzo "+pasos+"pasos.");
    }

    public void retroceder(int pasos){
        if(dormido){
            System.out.println("El robot esta dormido.No puede avanzar");
            return;
        }
        if(bateria.getCarga()==0){
            System.out.println("La bateria esta vacia.El robot no puede avanzar");
            return;
        }
        int energiaConsumida=(pasos/100)*10;
        int nuevaCarga = bateria.getCarga()-energiaConsumida;
        if(nuevaCarga<0) nuevaCarga = 0;
        bateria.setCarga(nuevaCarga);
        System.out.println("El robot retrocedió "+ pasos +"pasos.");

    }

    public void dormir(){
        dormido = true;
        System.out.println("El robot ahora esta dormido.");
    }

    public void despertar(){
        dormido = false;
        System.out.println("El robot ahora esta despierto.");
    }

    public void recargar(){
        bateria.setCarga(1000);
        System.out.println("La batería ha sido recargada a 1000 unidades.");
    }

    public boolean bateriaLlena(){
        return bateria.getCarga() ==1000;
    }

    public boolean bateriaVacia(){
        return bateria.getCarga() ==0;
    }

    public int energiaActual(){
        return bateria.getCarga();
    }

    public boolean estaDormido(){
        return dormido;
    }
}

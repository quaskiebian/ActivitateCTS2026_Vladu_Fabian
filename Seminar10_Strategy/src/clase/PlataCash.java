package clase;

public class PlataCash implements ModalitateDePlata{
    private double sumaDisponibila;

    public PlataCash(double sumaDisponibila) {
        this.sumaDisponibila = sumaDisponibila;
    }

    @Override
    public void plateste(String numeClient, double suma) {
        sumaDisponibila=sumaDisponibila-suma;
        System.out.println("Clientul "+numeClient+ " a platit suma de "+suma+" cash.Mai are disponibili: "+sumaDisponibila+ "lei ");

    }
}
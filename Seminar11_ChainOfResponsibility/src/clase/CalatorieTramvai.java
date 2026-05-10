package clase;

public class CalatorieTramvai extends CalatorieHandler{
    @Override
    public String recomandaMijlocDeTransport(double distanta) {
        if(distanta<10){
            return "Tramvai";
        }
        return super.succesor.recomandaMijlocDeTransport(distanta);
    }
}
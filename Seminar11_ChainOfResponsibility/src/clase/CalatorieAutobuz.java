package clase;

public class CalatorieAutobuz extends CalatorieHandler{
    @Override
    public String recomandaMijlocDeTransport(double distanta) {
        if(distanta<5){
            return "Autobuz";
        }
        return super.succesor.recomandaMijlocDeTransport(distanta);
    }

}
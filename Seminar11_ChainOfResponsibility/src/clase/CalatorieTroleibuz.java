package clase;

public class CalatorieTroleibuz extends CalatorieHandler{
    @Override
    public String recomandaMijlocDeTransport(double distanta) {
        if(distanta<3){
            return "Troleibuz";
        }else {
            return super.succesor.recomandaMijlocDeTransport(distanta);
        }
    }
}
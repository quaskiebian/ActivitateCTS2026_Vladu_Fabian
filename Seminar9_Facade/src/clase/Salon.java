package clase;

public class Salon {
    private boolean paturiLibere []=new boolean[50];
    private static Salon instanta=null;

    private Salon() {
        this.paturiLibere[1]=true;
        this.paturiLibere[2]=true;
        this.paturiLibere[3]=true;
        this.paturiLibere[4]=true;
    }

    public int catePaturiSuntLibere(){
        for(int i=0;i<paturiLibere.length;i++){
            if(paturiLibere[i]==true){
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int i){
        this.paturiLibere[i]=false;
    }

    public static synchronized Salon getInstance(){
        if(instanta==null){
            instanta=new Salon();
        }
        return instanta;
    }
}
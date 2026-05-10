package facade;

import clase.Medic;
import clase.Pacient;
import clase.Salon;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient){
        if(pacient.getGravitate()>=4){
            if(medic.areBiletDeTrimitere(pacient)){
                int nrPat= salon.catePaturiSuntLibere();
                if(salon.catePaturiSuntLibere()!=-1){
                    System.out.println("Pacientul "+pacient.getNume()+" poate fi internat"+ " in patul "+nrPat);
                    salon.ocupaPat(nrPat);
                } else{
                    System.out.println("Nu avem pat disponibil");
                }
            } else{
                System.out.println("Nu ai bilet de trimitere deci nu te putem interna");
            }
        } else{
            System.out.println("Gravitate mica: ia niste pastile");
        }
    }
}
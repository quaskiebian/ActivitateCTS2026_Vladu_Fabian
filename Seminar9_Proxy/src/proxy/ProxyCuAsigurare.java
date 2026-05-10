package proxy;

import clase.Pacient;

public class ProxyCuAsigurare implements ISpital{
    private ISpital spital;

    public ProxyCuAsigurare(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            spital.interneazaPacient(pacient);
        }else{
            System.out.println("Pacientul nu are asigurare, deci nu poate fi internat");
        }
    }
}
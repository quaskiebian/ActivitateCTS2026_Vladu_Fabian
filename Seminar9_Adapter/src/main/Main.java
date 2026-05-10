package main;

import aplicatie_farmacie.AdaptorMedicamentSpital;
import aplicatie_farmacie.MedicamentFarmacie;
import aplicatie_spital.MedicamentSpital;

public class Main {
    public static void realizeazaAchizitie(MedicamentFarmacie medicament){
        medicament.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentSpital paracetamol=new MedicamentSpital();
        MedicamentFarmacie nurofen=new MedicamentFarmacie();

        paracetamol.achizitioneazaMedicament();
        nurofen.cumparaMedicament();

        realizeazaAchizitie(nurofen);

        AdaptorMedicamentSpital paracetamolAdaptat=new AdaptorMedicamentSpital(paracetamol);
        realizeazaAchizitie(paracetamolAdaptat);

    }
}
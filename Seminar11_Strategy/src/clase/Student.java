package clase;

public class Student {
    private String nume;
    private ModSustinereExamen modSustinereExamen;

    public Student(String nume) {
        this.nume = nume;
        this.modSustinereExamen = new ProbaGrila();
    }

    public void setStrategie(ModSustinereExamen modSustinereExamen){
        this.modSustinereExamen=modSustinereExamen;
    }

    public void  examinare(){
        System.out.println("Pentru studentul: "+this.nume);
        modSustinereExamen.sustinereExamen();
    }
}
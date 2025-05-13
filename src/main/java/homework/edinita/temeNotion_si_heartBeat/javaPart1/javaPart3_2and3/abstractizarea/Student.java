package homework.edinita.temeNotion_si_heartBeat.javaPart1.javaPart3_2and3.abstractizarea;

public class Student extends Persoane{
    private final String adresa;
    private final String facultate;
    private final String specializare;


    protected Student(String nume, String prenume, int age, String adresa, String facultate, String specializare) {
        super(nume, prenume, age);
        this.adresa = adresa;
        this.facultate = facultate;
        this.specializare = specializare;
    }

    @Override
    public void nume() {
        System.out.println("Numele studentului este => " + getNume());
    }

    @Override
    public String prenume() {
        return getNume() + "  " + getPrenume();
    }

    @Override
    public boolean isAgeMoreThan30() {
        return getAge() > 30;
    }


    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "adresa='" + adresa + '\'' +
                ", facultate='" + facultate + '\'' +
                ", specializare='" + specializare + '\'' +
                '}';
    }
}

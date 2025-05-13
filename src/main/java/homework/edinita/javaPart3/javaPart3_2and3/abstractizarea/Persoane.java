package homework.edinita.javaPart3.javaPart3_2and3.abstractizarea;

public abstract class Persoane {

    private final String nume;
    private final String prenume;
    private final  int age;

    protected Persoane(String nume, String prenume, int age) {
        this.nume = nume;
        this.prenume = prenume;
        this.age = age;
    }

    public abstract void nume();
    public abstract String prenume();
    public abstract boolean isAgeMoreThan30();


    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Persoane{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

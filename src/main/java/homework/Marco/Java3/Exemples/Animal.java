package homework.Marco.Java3.Exemples;

public class Animal {

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.age = 7;
    }

    private String type;
    private String continent;
    private int age;
    private boolean isCarnivore;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void setCarnivore(boolean carnivore) {
        isCarnivore = carnivore;
    }
}

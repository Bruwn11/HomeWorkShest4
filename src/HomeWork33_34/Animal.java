package HomeWork33_34;

public class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Звук животного");
    }
    public void eat() {
        System.out.println("Животное ест");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

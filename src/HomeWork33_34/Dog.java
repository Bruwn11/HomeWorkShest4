package HomeWork33_34;

public class Dog extends Animal {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("гав-гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест кость");
    }
}

package HomeWork33_34;

public class Cat extends Animal {
    private String name;

    public Cat() {
    }

    public Cat(String name) {
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
        System.out.println("мяу-мяу");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест рыбу");
    }
}

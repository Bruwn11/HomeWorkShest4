package HomeWork33_34;

public class Dog extends Animal implements Pet{
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
        System.out.print("Собака по кличке " + name + ", приветствует прохожего: " + "гав-гав");
    }

    @Override
    public void move() {
        System.out.print("Собака " + name + " бегает и прыгает на лапах");
    }

    @Override
    public void eat() {
        System.out.print("Собака по кличке " + name + " ест кость");
    }

    @Override
    public void play() {
        System.out.println("Собака " + name + " играет в мячик");
    }

    @Override
    public void beFriendly() {
        System.out.println("Собака " + name + " виляет хвостом");
    }
}

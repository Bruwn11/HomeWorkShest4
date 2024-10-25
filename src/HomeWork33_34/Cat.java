package HomeWork33_34;

public class Cat extends Animal implements Pet{
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
        System.out.print("Кот по кличке " + name + ", приветствует хозяина: " + "мяу-мяу");
    }
    @Override
    public void move() {
        System.out.print("Кот " + name + " ходит и прыгает на лапах");
    }

    @Override
    public void eat() {
        System.out.print("Кот по кличке " + name + " ест рыбу");
    }

    @Override
    public void play() {
        System.out.println("Кот " + name + " играет со своим хвостом");
    }

    @Override
    public void beFriendly() {
        System.out.println("Кот " + name + " мурлыкает");
    }
}

package HomeWork33_34;

public class Cat extends Animal implements Pet{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.print("Кот по кличке " + getName() + ", приветствует хозяина: " + "мяу-мяу");
    }
    @Override
    public void move() {
        System.out.print("Кот " + getName() + " ходит и прыгает на лапах");
    }

    @Override
    public void eat() {
        System.out.print("Кот по кличке " + getName() + " ест рыбу");
    }

    @Override
    public void play() {
        System.out.println("Кот " + getName() + " играет со своим хвостом");
    }

    @Override
    public void beFriendly() {
        System.out.println("Кот " + getName() + " мурлыкает");
    }
}

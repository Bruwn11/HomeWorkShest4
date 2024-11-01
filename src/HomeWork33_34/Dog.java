package HomeWork33_34;

public class Dog extends Animal implements Pet {

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.print("Собака по кличке " + getName() + ", приветствует прохожего: " + "гав-гав");
    }

    @Override
    public void move() {
        System.out.print("Собака " + getName() + " бегает и прыгает на лапах");
    }

    @Override
    public void eat() {
        System.out.print("Собака по кличке " + getName() + " ест кость");
    }

    @Override
    public void play() {
        System.out.println("Собака " + getName() + " играет в мячик");
    }

    @Override
    public void beFriendly() {
        System.out.println("Собака " + getName() + " виляет хвостом");
    }
}

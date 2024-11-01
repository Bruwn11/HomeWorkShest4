package HomeWork33_34;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Шарик"), new Cat("Степан"), new Bird("Виктор", true)};
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Pet) {
                ((Pet) animals[i]).play();
                ((Pet) animals[i]).beFriendly();
            }
        }
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
            System.out.print(". ");
            animals[i].move();
            System.out.print(". ");
            animals[i].eat();
            System.out.println();
        }
    }
}

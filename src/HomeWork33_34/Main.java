package HomeWork33_34;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Шарик"), new Cat("Степан"), new Bird("Виктор")};
        for(int i = 0; i<animals.length; i++){
            if(animals[i] instanceof Pet){
                ((Pet) animals[i]).play();
                ((Pet) animals[i]).beFriendly();
            }
        }

        Dog[] dogs = {new Dog("Шарик"), new Dog("Рыжий"), new Dog("Урал")};
        for(int i = 0; i<dogs.length; i++){
            dogs[i].makeSound();
            System.out.print(". ");
            dogs[i].move();
            System.out.print(". ");
            dogs[i].eat();
            System.out.println();
        }
        Cat[] cats = {new Cat("Барсик"), new Cat("Пушистый"), new Cat("Степан")};
        for(int i = 0; i<cats.length; i++){
            cats[i].makeSound();
            System.out.print(". ");
            cats[i].move();
            System.out.print(". ");
            cats[i].eat();
            System.out.println();
        }
        Bird[] birds = {new Bird("Виктор","notCanFly"), new Bird("Младший","canFly"), new Bird("Ворон","canFly")};
        for(int i = 0; i<birds.length; i++){
            birds[i].makeSound();
            System.out.print(". ");
            birds[i].move();
            System.out.print(". ");
            birds[i].eat();
            System.out.println();
        }
    }
}

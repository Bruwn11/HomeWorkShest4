package HomeWork33_34;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Bird()};
        for(int i = 0; i<animals.length; i++){
            animals[i].makeSound();
            animals[i].eat();
        }
        Dog[] dogs = {new Dog("Шарик"), new Dog("Рыжий"), new Dog("Урал")};
        for(int i = 0; i<dogs.length; i++){
            System.out.print("Собака по кличке " + dogs[i].getName() + ", приветствует прохожего: ");
            dogs[i].makeSound();
        }
        Cat[] cats = {new Cat("Барсик"), new Cat("Пушистый"), new Cat("Степан")};
        for(int i = 0; i<cats.length; i++){
            System.out.print("Кот по кличке " + cats[i].getName() + ", приветствует хозяина: ");
            cats[i].makeSound();
        }
        Bird[] birds = {new Bird("Виктор"), new Bird("Младший"), new Bird("Ворон")};
        for(int i = 0; i<birds.length; i++){
            System.out.print("Птица по кличке " + birds[i].getName() + ", поёт: ");
            birds[i].makeSound();
        }
    }
}

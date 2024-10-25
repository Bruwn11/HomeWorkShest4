package HomeWork33_34;

public class Bird extends Animal{
    private String name;

    public Bird() {
    }

    public Bird(String name) {
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
        System.out.println("чирик-чирик");
    }
    @Override
    public void eat() {
        System.out.println("Птица ест семена");
    }
}

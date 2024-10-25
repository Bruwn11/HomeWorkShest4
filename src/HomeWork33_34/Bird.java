package HomeWork33_34;

public class Bird extends Animal {
    private String name;
    private String canFly;

    public Bird() {
    }

    public Bird(String name) {
        this.name = name;
    }

    public Bird(String name, String canFly) {
        this.name = name;
        this.canFly = canFly;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getCanFly() {
        return canFly;
    }

    public void setCanFly(String canFly) {
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.print("Птица по кличке " + name + ", поёт: чирик-чирик");
    }

    @Override
    public void move() {
        if (canFly.equals("canFly")) {
            System.out.print("Птица по кличке " + name + " летает");
        } else {
            System.out.print("Птица по кличке " + name + " бегает и прыгает на лапах");
        }
    }


    @Override
    public void eat() {
        System.out.print("Птица по кличке " + name + " ест семена");
    }
}

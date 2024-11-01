package HomeWork33_34;

public class Bird extends Animal {
    private Boolean canFly;

    public Bird() {
    }


    public Bird(String name, Boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    public Boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.print("Птица по кличке " + getName() + ", поёт: чирик-чирик");
    }

    @Override
    public void move() {
        if (canFly) {
            System.out.print("Птица по кличке " + getName() + " летает");
        } else {
            System.out.print("Птица по кличке " + getName() + " бегает и прыгает на лапах");
        }
    }


    @Override
    public void eat() {
        System.out.print("Птица по кличке " + getName() + " ест семена");
    }
}

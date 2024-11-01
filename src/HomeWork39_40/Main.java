package HomeWork39_40;

public class Main {
    public static void main(String[] args) {
        House house1 = new House.Builder()
                .floor(2)
                .room(5)
                .isGarage(true)
                .builderHouse();
        System.out.println(house1.toString());
    }
}

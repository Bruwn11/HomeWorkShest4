package HomeWork39_40;

public class House {
    private Integer floor;
    private Integer room;
    private Boolean isGarage;
    public House(Builder builder){
        this.floor = builder.floor;
        this.room = builder.room;
        this.isGarage = builder.isGarage;
    }
    public static class Builder{
        private Integer floor;
        private Integer room;
        private Boolean isGarage;
        public Builder(){}
        public Builder floor(Integer floor){
            this.floor = floor;
            return this;
        }
        public Builder room(Integer room){
            this.room = room;
            return this;
        }
        public Builder isGarage(Boolean isGarage){
            this.isGarage = isGarage;
            return this;
        }
        public House builderHouse(){
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "floor=" + floor +
                ", room=" + room +
                ", isGarage=" + isGarage +
                '}';
    }
}

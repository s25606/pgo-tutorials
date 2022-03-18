public class Car {
    String color;
    String make;
    int engineCapacity;

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getMake() {
        return make;
    }

    void setMake(String make) {
        this.make = make;
    }

    int getEngineCapacity() {
        return engineCapacity;
    }

    void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Car(String color, String make, int engineCapacity) {
        this.color = color;
        this.make = make;
        this.engineCapacity = engineCapacity;
    }
    boolean ifHighRevving(){
        if (this.engineCapacity >= 21){
            return true;
        }else{
            return false;
        }
    }
}

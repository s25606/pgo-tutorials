public class Telephone {
    String brand;
    double resolution;
    String number;

    public Telephone(String brand, double resolution, String number) {
        this.brand = brand;
        this.resolution = resolution;
        this.number = number;
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    double getResolution() {
        return resolution;
    }

    void setResolution(int resolution) {
        this.resolution = resolution;
    }

    String getNumber() {
        return number;
    }

    void setNumber(String number) {
        this.number = number;
    }

    void sendSMS(String text, String number){
        System.out.println("I am sending a message " + text+ " to number " + number);
    }

}

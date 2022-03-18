public class Main {
    public static void main(String[] args){
        Telephone tele = new Telephone("Apple", 12, "111 11 111 1");
        tele.sendSMS("hello!", "1 2030 2 1 1");
        Car car1 = new Car("red", "steel", 21);
        System.out.println(car1.ifHighRevving());
    }
}

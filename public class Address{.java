public class Address{
    String street;
    String city;
    String state;
    String postalCode;
    String country;

    public Address(String street, String city, String state, String postalCode, String country){
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }
    public void Validate(){

    }
    public static void main(String[] args){
        Person Michael = new Person("Michael", "Rogers", 27);
        System.out.println(Michael.IntroduceYourself());
    }
}
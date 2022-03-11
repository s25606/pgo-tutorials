public class Person{
    String name;
    String surname;
    int age;
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String IntroduceYourself(){
        return "I am " + name + " " + surname;
    }
    public static void main(String[] args){
        Person Michael = new Person("Michael", "Rogers", 27);
        System.out.println(Michael.IntroduceYourself());
    }
}
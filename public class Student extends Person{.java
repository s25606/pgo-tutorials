public class Student extends Person{
    String studentNumber;
    int averageMark;
    public Student(int averageMark, String studentNumber){
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }
    public boolean IsEligibleToEnroll(){
        return true;
    }
    public void GetSeminarsTaken(){
        
    }
}
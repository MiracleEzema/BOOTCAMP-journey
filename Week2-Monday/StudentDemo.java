//import Week2-Monday.Student;
public class StudentDemo {
    public static void main (String[] args){
        Student s1 = new Student();
        s1.name = "Ada obi";
        s1.score = 72;

        Student s2 = new Student();
        s2.name = "Emeka Eze";
        s2.score = 48;
       
        Student s3 = new Student();

        Student s4 = new Student("Blessing Eze", 54);

        Student B = s1;
        B.score = 90;
        Student x = new Student("Tunde", 40);
        Student y = x;
        y.score = 80;

        
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        x.display();
    }
}
  
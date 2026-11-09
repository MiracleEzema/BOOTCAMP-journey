public class Lecturer {
    String staffID;
    String name;
    String department;
public Lecturer(String staffID, String name, String department){
        this.staffID = staffID;
        this.name = name;
        this.department = department;
    }
    public void display(){
        System.out.println("StaffID: " + staffID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
    public void teach(Course course){
        System.out.println(name + " teaches " + course.courseCode + ": " + course.courseTitle);
    } 

}

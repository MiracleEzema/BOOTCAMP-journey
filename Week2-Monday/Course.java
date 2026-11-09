public class Course {
    String courseCode;
    String courseTitle;
    int creditUnits;
    public Course(String courseCode, String courseTitle, int creditUnits){
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditUnits = creditUnits; 
    }
    public void display(){
        System.out.println("CourseCode: " + courseCode);
        System.out.println("CourseTitle: " + courseTitle);
        System.out.println("CreditUnits: " + creditUnits);
    }
}

public class Students {
    String studentID;
    String name;
    String department;
    int level;
    public Students(String studentID, String name, String department, int level){
        this.studentID = studentID;
        this.name = name;
        this.department = department;
        this.level = level;
    }
    public Students(String studentID, String name){
        this.studentID = "Undeclared";
        this.name = "Undeclared";
    }
    public void display(){
        System.out.println("StudentID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Deparments: " + department);
        System.out.println("Level: " + level);
    }
    

}



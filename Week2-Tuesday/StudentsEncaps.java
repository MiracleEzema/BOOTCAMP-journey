public class StudentsEncaps {
    private String studentID;
    private String name;
    private String department;
    private int level;
    public  StudentsEncaps(String studentID, String name, String department, int level){
        this.studentID = studentID;
        setName(name);
        setDepartment(department);
        setLevel(level);
    }
    public StudentsEncaps(String studentID, String name){
        this(studentID, name, "Undeclared", 1);
    }
    public String getStudentID(){ return studentID; }

    public void setName(String name){
        if(name == null || name.trim().isEmpty()){
            System.out.println("Name cannot be empty. Keeping old values: " +this.name);
        }else{
            this.name = name.trim();
        }
    }
    public  String getDepartment(){ return department; }
    public void setDepartment(String deparment){
        if (department == null || department.trim().isEmpty()){
            System.out.println("Department cannot be empty. Keeping old value: " + this.department);
        }else{
            this.department = department.trim();
        }
    }
    public void setLevel(int Level){
        if (level != 1 && level != 2){
            System.out.println("Level must 1 or 2. Keeping old value: " + this.level);
        }else{
            this.level = Level;
        }
    }
    @Override 
    public String toString(){
        return studentID + " - " + name + " - " + department + " - Level " + level;
    }
    public void display(){
        System.out.println(toString());
    }
}

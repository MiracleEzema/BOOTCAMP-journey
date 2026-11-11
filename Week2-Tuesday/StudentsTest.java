public class StudentsTest {
    public static void main(String[] args){
        StudentsEncaps s1 = new StudentsEncaps("CS/10", "Angela Eze", "Computer Science", 1);
        StudentsEncaps s2 = new StudentsEncaps("SLT/001", "Chinedu Eze");
        System.out.println(s1);
        System.out.print(s2); 

        System.out.println("\nTrying invalid values: ");
        s1.setName("");
        s1.setDepartment("  ");
        s1.setLevel(5);
        System.out.println("After invalid tries: " + s1);
        s1.setLevel(2);
        System.out.println("After valid update: " + s1);
    }
}

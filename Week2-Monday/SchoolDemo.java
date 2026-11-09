public class SchoolDemo {
    public static void main (String[] args){
        Students s1 = new Students("CS/10", "Angela Eze", "Computer Science", 1);
        Students s2 = new Students("SLT/001", "Chinedu Eze", "Science LabTech", 1);
        Course c1 = new Course("COM 126", "Introduction to Computing", 3);
        Course c2 = new Course("GNS 124", "Citizenship Education", 4);
        Lecturer l1 = new Lecturer("L001", "Mr. Okafor", "Computer Science");
        
            s1.display();
            s2.display();
            c1.display();
            c2.display();
            l1.display();

            l1.teach(c1);
            l1.teach(c2);
    }
}

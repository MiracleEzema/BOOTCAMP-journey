public class Student{
    String name;
    int score;
    void display(){
        System.out.println(name + " scored " + score + " (Grade " + getGrade() + ")");
    }
        char getGrade(){
                if (score >= 70) return 'A';
                else if (score >= 60) return 'B';
                else if (score >= 50) return 'C';
                else if (score >= 45) return 'D';
                else if (score >= 40) return 'E';
                else return 'F';
        }
     
        public Student(String name, int score){
            this.name = name;
            this.score = score;
        }
        public Student(){
            this.name = "Unknown";
            this.score = 0;
        }
         // display() and getGrade() same
} 


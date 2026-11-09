import java.util.Scanner;
public class StudentResultManager{
    static String[] names = new String[10];
    static int[] scores = new int [10];
    static int count = 0;
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            showMenu();
            System.out.print("Choice (1-5): ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
            addStudent(sc); break;
            case 2: viewAll();
                break;
                case 3: searchStudent(sc);
                break;
                case 4: showStatistics(); break;
                case 5: System.out.println("Goodbye!"); break;
                default:
                    System.out.println("Invalid choice! Pick 1-5.");
            }
        }while (choice != 5);
         sc.close();
    }
    public static void showMenu(){
        System.out.println("\n--- Student Result Manager ---");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Students");
        System.out.println("4. Show statistics");
        System.out.println("5. Exit");
    }
    public static void addStudent(Scanner sc){
        if (count >= 10){
            System.out.println("Class is full! Max 10 students."); 
            return;
        } System.out.print("Name: ");
        String name = sc.nextLine();
        int score;
        do{
            System.out.print("Score(0-100): ");
            score = sc.nextInt();
            sc.nextLine();
            if(score < 0 || score > 100) System.out.println("Error! Must be 0-100.");
        } while (score < 0 || score > 100);  
        scores[count] = score; count++;
        System.out.println("Added: " + name);
    }
    public static void viewAll(){
        if (count == 0){
            System.out.println("No Students yet!");
            return;
        }System.out.println("\nName\tScore\tGrade");
        for(int i = 0; i < count; i++){
            System.out.println(names[i] + "\t" + scores[i] + "\t" + getGrade(scores[i]));
        }
    }
    public static void searchStudent(Scanner sc){
        if (count == 0){
            System.out.println("No students yet!");
            return;
        }System.out.print("Search name: ");
        String search = sc.nextLine();
        for (int i = 0; i < count; i++){
            if(names[i].equalsIgnoreCase(search)){
                System.out.println("Found: " + names[i] + " - " + scores[i] + " - Grade " + getGrade(scores[i]));
                return;
            }
        }
        System.out.println("Student '" + search + "' not found.");
    }
    public static void showStatistics(){
        if (count == 0){
            System.out.println("No students yet!");
            return ;
        }
        int max = scores[0], min = scores[0], sum = 0, passes = 0;
        String topStudent = names[0];
        for(int i = 0; i < count; i++){
            sum += scores[i];
            if(scores[i] > max){
                max = scores[i];
                topStudent = names[i];
            }
            if (scores[i] < min) min = scores[i];
            if (scores[i] >= 40) passes ++;
        }
        System.out.println("\n------- Statistics -----");
        System.out.println("Highest: " + max + " by " + topStudent);
        System.out.println("Lowest: " + min);
        System.out.printf("Average: %.2f\n", sum / (double) count);
        System.out.println("Passes: " + passes + " Fails: " + (count - passes));
    }
    public static char getGrade(int score){
        if (score >= 70) return 'A';
        if (score >= 60) return 'B';
        if (score >= 50) return 'C';
        if (score >= 40) return 'D';
        return 'F';
    }
}
import java.util.Scanner;
public class ScoreAnalyzer {
 public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("How many students? ");
    int n = sc.nextInt();
    int[] scores = new int[n];
    for(int i = 0; i < n; i++){
        int score;
        do{
            System.out.print("Score for student" + (i + 1) + "(0-100): ");
            score = sc.nextInt();
            if (score < 0 || score > 100){
                System.out.println("Error! Score must be 0 to 100. Try again.");
            }
                
        }while (score < 0 || score > 100);
        scores[i] = score; 
    }
    System.out.println("\nNo.\tScore\tGrade");
        System.out.println("----------------");
            for(int i = 0; i < scores.length; i++){
                System.out.println((i + 1) + "\t" + scores[i] + "\t" + getGrade(scores[i]));
            }
            System.out.println("\n----------S");  
            System.out.println("Highest: " + findHighest(scores));
            System.out.println("Lowest: " + findLowest(scores));
            System.out.printf("Average:  + %.2f\n", average(scores));
                    int passes = countPasses(scores);
                System.out.println("Passes: " + passes);
                System.out.println("Fails: " + (scores.length - passes));
                sc.close();
    }

    public static int findHighest(int[] data){
        int max = data[0];
        for(int s : data) if (s > max) max = s;
        return max;
    }

    public static int findLowest(int[] data){
        int min = data[0];
        for(int s : data) if (s < min) min = s;
        return min;
    }

    public static double average(int[] data){
        int sum = 0;
        for(int s : data) sum += s;
        return sum / (double) data.length;
    }

    public static int countPasses(int[] data){
        int count = 0;
        for (int s : data) if (s >= 40) count++;
        return count;
    }

    public static char getGrade(int score){
        if (score >= 70) return 'A';
        if (score >= 60) return 'B';
        if (score >= 50) return 'C';
        if (score >= 40) return 'D';
        return 'F';
    }
}

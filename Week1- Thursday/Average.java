/*PROGRAM C: AVERAGE
WHAT IS A BUG?
Interger division gives the wrong answer.
It prints 7.0 instead of 7.5.
WHY DOES IT HAPPEN?
a and b are both int.(a + b) / 2 = 15 / 2.
When you divide two intergers in java,
it throws away the decimal part and gives 7.
Then it stores 7 in a double,so it becomes 7.0

CORRECTED CODE IS THIS..... */

public class Average {
    public static void main (String[] args){
        int a = 7;
        int b = 4;
        double average = (a+b) / 2.0;
        System.out.println("Average: " + average);

    }
}

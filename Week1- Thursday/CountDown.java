/* PROGRAM B: COUNTDOWN 
What is a bug?
   Infinite loop. count never changes inside a while loop.
Why does it happen?
    The condition is count > 0.Count starts with 10 and decreases it,
    so it stays 10 forever and the loop never stops. 
    It will print 10 forever.
    
    The corrected code*/
public class CountDown {
    public static void main(String[] args){
        int count = 10;
        while (count > 0) {
            System.out.println(count);
                count--;
        }
        System.out.println("Done!");
    }
}

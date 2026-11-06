// Program A -BuggyCounter
/*What is the bug? 
There is a stray semicolon ';' after the for loop: 'for (int i = 1; i <= 5; i++);'
** Why does it happen?** 
The semicolon ends the loop immediately. So the loop runs 5 times doing nothing. The block '{ total += i; }' after it is NOT part of the loop. Also, 'i' only exist inside the loop, so using 'i' outside causes a complete error: "cannot find symbol - i".
**Corrected Code:**  '''java*/
public class BuggyConter{
 public static void main (String[] args){
    int total = 0;
    for(int i = 1; i <= 5; i++ ){
        total += i;
    }  
     System.out.println("Total: " + total);
 }
}
    


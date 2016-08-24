//  task1 : Compute and print the sum of all numbers from 1 to 1 billion
//Hint: For the sum in task-one, use the a long data type

package Exercise1;

public class Task1 extends Thread {
    
    long num;
    long sum;

    public Task1(long num) {
        this.num = num;
    }
    
    
    @Override
    public void run(){
        for (long i = 1; i <= num; i++) {
           sum += i;
        }
        System.out.println("SUM: " + sum );
    }
    
}

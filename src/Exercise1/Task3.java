// task3 : Print all numbers from 10 and up. Pause for 3 seconds between each print.
//Hint3: Use a Boolean value in the loop in task-3 to terminate task3 (let the main thread
//change the value of the boolean value.


package Exercise1;

public class Task3 extends Thread {
    int count;
    boolean isTenUp;

    public Task3(boolean isTenUp, int count) {
        this.isTenUp = isTenUp;
        this.count = count;
    }
    
    
    @Override
    public void run(){
        int temp = 10;
        while(isTenUp && count >= 10){  
            System.out.println("I am number " + temp);
            try {
                Thread.sleep(3000); 
            } catch (InterruptedException ex) {
                System.out.println("oooopppps!");
            }
            temp++;
            if(temp > count){
                isTenUp = false;
            }
        }
    }
}

// task2 : Print the numbers from 1 to 5. Pause for 2 seconds between each print.
//Hint2: Let the main thread sleep for 10 seconds after starting task 3


package Exercise1;

public class Task2 extends Thread{
    int count;

    public Task2(int count) {
        this.count = count;
    }
    
    
    @Override
    public void run(){
        int counter = 1;
        while(counter <= count){
            System.out.println("I am number " + counter);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println("oooopppps!");
            }
            counter++;
        }
    }
}

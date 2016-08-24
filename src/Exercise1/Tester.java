
package Exercise1;

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        Task1 t1 = new Task1(1000000000);
        Task2 t2 = new Task2(5);
//        Task3 t3 = new Task3(false,13);
//        Task3 t3 = new Task3(true,9);
        Task3 t3 = new Task3(true,15);
        
        t1.start();
        Thread.sleep(3000);
        t2. start();
        Thread.sleep(10000);
        t3. start();
        
        t1.join();
        t2.join();
        t3.join();
        
        System.out.println("DONE.");
    }
}

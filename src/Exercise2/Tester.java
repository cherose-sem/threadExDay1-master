
package Exercise2;

/**
 B. EXPLAIN WHAT HAPPENS?HOW COMMON IS THE PROBLEM? 
 * When the two threads reached the method next() at the same time, it generates equal results.
 * This is a common problem in multi-threading when the method is unsynchronized,
 * unlikely when the method was introduced in synchronization that only one thread has the key
 * and the other thread is waiting until it releases the lock. As a result, the first thread gets an even number
 * which the n value was added by 2 and the next thread has been added by 2 more.
 */
public class Tester {
    
    public static void main(String[] args) throws InterruptedException {
        Even e1 = new Even();
        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e1);
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
    }
}

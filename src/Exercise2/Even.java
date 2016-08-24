
package Exercise2;

public class Even implements Runnable{

    private int n = 8;

    public synchronized int next() {
//        if (n%2 == 0) {
            n++;
            n++;
            return n;
//        }
//        return 0;
    }

    @Override
    public  void run() {
            System.out.println("This is thread:" + Thread.currentThread().getName() + " NUM:" + next());
        
    }

}

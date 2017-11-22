package newThread;

/**
 * @创建人 shangjie
 * @创建时间 2017/11/17
 * @描述
 */
public class MyThread03 extends Thread {
    private int count;
    private volatile boolean running = true;
    public int getCount(){
        return count;
    }
    public void run(){
        while(running){
              count = count + 1;
        }
    }
    public void normalStop(){
        running = false;
    }

}

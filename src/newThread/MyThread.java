package newThread;

/**
 * @创建人 shangjie
 * @创建时间 2017/11/20
 * @描述
 */
public class MyThread extends Thread{
    private static int count = 0;
    private static boolean flag = true;//信号量

    @Override
    public synchronized void run() {
        int i ;
        for (i = 1; i <= 100; i++){
            /*
            *判断信号量，若是信号量为false则该共享资源正在被其他线程调用
            * 则使该线程进入休眠状态
             */
            if (!flag){
                try {
                    //让该线程处于等待状态
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            flag = false;//全局变量直接赋值即可
            count = count + 1;
            System.out.println("My name is " + getName() + "count result " + count);
            flag = true;
            notifyAll();
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public MyThread(String name){
        super(name);
    }
}

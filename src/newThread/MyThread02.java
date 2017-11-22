package newThread;

/**
 * @创建人 shangjie
 * @创建时间 2017/11/17
 * @描述
 */
public class MyThread02 implements Runnable{
    public static int count;
    private Thread thread;
    @Override
    public void run(){
        for (int i=0;i <100;i++){
            count = count + 1;
            try {
                thread.sleep(10);
            } catch (InterruptedException e) {
                //线程终断异常
                e.printStackTrace();
            }
            System.out.println("MyThread's is :" + thread.getName() + "count:" + count + "线程的优先级" + thread.getPriority());
        }
    }
    public MyThread02(String name){
        thread = new Thread(this,name);
    }
    public void start(){
        thread.start();
    }
    public void join(){
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

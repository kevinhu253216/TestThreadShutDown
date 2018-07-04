public class TestThreadShutDown {
    public static void main(String[] args){
        Runner r = new Runner();
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<100000; i++){
            if(i%10000==0 & i>0){
                System.out.println("In Thread Main i=" + i);
            }

        }
        System.out.println("Thread main is over!");
        r.shutDown(); //使线程停止
    }
}

class Runner implements Runnable{
    private boolean flag = true;
    public void run(){
        int i=0;
        while(flag == true){
            System.out.println(" " + i++);
        }
        System.out.println(Thread.currentThread().isAlive()); //返回布尔值
    }
    public void shutDown(){
        flag = false;
    }
}


class worker extends Thread {
    public void run() {
        // System.out.println("Hi! I am a thread");
        //run is a prdefined method when  a thread is
        //started looks for run method
        for (int i = 1; i <= 10; i++ ) {
            System.out.println("Thread is Running ..." + new java.util.Date());
            try {
                Thread.sleep(1000);//1000ms =1sec

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}


public class tHrEd  {
    public static void main(String[] args) {
        worker w1=new worker();//w1 is thread object
        w1.start();//start method is used to start the thread which indirectly call run()method
    }
}

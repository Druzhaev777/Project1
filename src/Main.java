public class Main {

    public static void main(String[] args) {



        System.out.println("Main thread started...");
        for(int i=1; i < 6; i++)
            new JThread("JThread " + i).start();
        System.out.println("Main thread finished...");
    }
}
class JThread extends Thread {

    JThread(String name){
        super(name); //вызов конструктора класса Thread
    }

    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted"); //устанавливает у потока статус, что он прерван
        }
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}

class Program {

    public static void main(String[] args) {

        System.out.println("Main thread started...");
        new JThread("JThread").start();
        System.out.println("Main thread finished...");
    }
}
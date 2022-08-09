//i am intellij ide for code
public class threadName extends Thread{
    public   void run(){
        System.out.println(this.getName());
    }
    public static void main(String[] args) {
        threadName t=new threadName();
        t.start();

    }
}

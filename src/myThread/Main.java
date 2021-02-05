package myThread;
public class Main {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
	    for (int i=0; i<999999998/2; i++){
	        System.out.println("新年快乐，孤寡孤寡");
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0; i<999999998/2; i++){
            System.out.println("新年新对象，年年不一样");
        }
    }
}
package Threading;

public class test {
    private static volatile boolean initFlag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread();
        new Thread(
                () ->    {
                    System.out.println("wait");
                    while (!initFlag)
                    {
                        System.out.println("wait2");
                    }
                    System.out.println("end");
                }
        ).start();
        Thread.sleep(2000);
        new Thread(()->test2()).start();
    }
    public static void test2(){
        System.out.println("alter data");
        initFlag = true;
        System.out.println("update successful!");
    }
}

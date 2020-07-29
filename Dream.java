package Test;

public class Dream {

    public static void main(String[] args) throws InterruptedException {
        long time;
        for(int i=0,j=0;i<2;j++) {
            Thread.sleep(1000);
            time=System.currentTimeMillis();

            System.out.println("双色球2020067期中奖号码是01-04-07-22-25-29+10，恭喜中奖的朋友！" + "n:" + j+"时间："+time);
        }

    }
}
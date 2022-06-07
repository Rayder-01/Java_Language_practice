class Counter {
    private int count;
    Counter () {
        count = 0;
    }
    public int getCount() {
        return count;
    }
    public void add1() {
        count++;
    }
    public void add3() {
        this.add1();
        this.add1();
        this.add1();
    }
}

class Counter2 extends Counter {
    public void add2() {
        super.add1();
        super.add1();
    }
}

public class CounterMain3 {
    public static void main(String args[]) {
        Counter c = new Counter();
        System.out.println(c.getCount());
        c.add3();
        System.out.println(c.getCount());
        Counter2 c2 = new Counter2();
        System.out.println(c2.getCount());
        c2.add2();
        System.out.println(c2.getCount());
        c2.add3();
        System.out.println(c2.getCount());
    }
}

/*** ======================================================================================
   
1. this.方法 -> 抓取該 class 的方法，找不到會往父類找
   super.方法 -> 抓取父類的方法

***/
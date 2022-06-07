package 練習.第二章;
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
        //this.add2();
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

public class CounterMain4 {
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
   
1. 直接執行此題，會看到右側錯誤告訴我們第 14 行出錯，因為使用的是 this.add2()，在 Counter
   並沒有 add2() 這個方法，所以找不到此方法

***/

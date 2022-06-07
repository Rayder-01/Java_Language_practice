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
}

class Counter2 extends Counter {
    public void add2() {
        super.add1();
        super.add1();
    }
}

public class CounterMain2 {
    public static void main(String args[]) {
        Counter2 c = new Counter2();
        System.out.println(c.getCount());
        c.add2();
        System.out.println(c.getCount());
        c.add2();
        System.out.println(c.getCount());
    }
}
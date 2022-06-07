package 練習.第二章;

class Drama {
    private int minutes;
    public Drama() {
        minutes = 100;
    }
    public int getMinutes() {
        return minutes;
    }
}

class EngDrama extends Drama {
    public int script, acting, direction;
    public EngDrama() {
        script = 8;
        acting = 7;
        direction = 9;
    }
    public int score() {
        return script + acting + direction;
    }
}

class LongEngDrama extends EngDrama {
    public int score() {
        return script + acting + direction + 10;
    }
}

public class DramaPlay1 {
    public static void main(String args[]) {
        EngDrama ed = new EngDrama();
        System.out.println("minutes: " + ed.getMinutes());
    }
}

/*** ======================================================================================
   
1. 當一個屬性變成 private，代表除了該 class 以外，都不能直接取用它，要透過方法取用，
   通常會是 getter()

***/
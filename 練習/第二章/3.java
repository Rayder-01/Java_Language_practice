package 練習.第二章;

class Drama {
    protected int minutes;
    public Drama() {
        minutes = 100;
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

public class DramaPlay2 {
    public static void main(String args[]) {
        EngDrama ed = new EngDrama();
        System.out.println("minutes: " + ed.minutes);
    }
}

/*** ======================================================================================
   
1. 當一個屬性變成 protected，代表自己跟子類都可以直接使用它

    ed.minutes

***/
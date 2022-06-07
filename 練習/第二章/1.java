package 練習.第二章;

class Drama {
    public int minutes;
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

public class DramaPlay {
    public static void main(String args[]) {
        EngDrama ed = new EngDrama();
        LongEngDrama led = new LongEngDrama();
        System.out.println("EngDrama's score: " + ed.score());
        System.out.println("LongEngDrama's score: " + led.score());
    }
}
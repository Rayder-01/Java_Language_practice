package 練習.第一章;

class Attraction {
    private int minutes;
    Attraction() {
        minutes = 75;
    }
    Attraction(int m) {
        minutes = m;
    }
    int getMinutes() {
        return minutes;
    }
    double getHours() {
        return minutes / 60.0;
    }
    void setMinutes(int m) {
        minutes = m;
    }
    void setHours(double h) {
        minutes = (int)(h * 60);
    }
}

class Attract {
    public static void main(String args[]) {
        Attraction att1 = new Attraction();
        System.out.println(att1.getMinutes());
        System.out.println(att1.getHours());
        Attraction att2 = new Attraction(105);
        System.out.println(att2.getMinutes());
        System.out.println(att2.getHours());
        att2.setMinutes(315);
        System.out.println(att2.getMinutes());
        System.out.println(att2.getHours());
        att2.setHours(2.5);
        System.out.println(att2.getMinutes());
        System.out.println(att2.getHours());
    }
}

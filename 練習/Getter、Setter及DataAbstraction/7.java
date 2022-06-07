package 練習.第一章;

class Attraction {
    private double hours;
    Attraction() {
        hours = 1.25;
    }
    Attraction(double h) {
        hours = h;
    }
    int getMinutes() {
        return (int)(hours * 60);
    }
    double getHours() {
        return hours;
    }
    void setMinutes(int m) {
        hours = m / 60.0;
    }
    void setHours(double h) {
        hours = h;
    }
}

class Attract2 {
    public static void main(String args[]) {
        Attraction att1 = new Attraction();
        System.out.println(att1.getMinutes());
        System.out.println(att1.getHours());
        Attraction att2 = new Attraction(3.75);
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
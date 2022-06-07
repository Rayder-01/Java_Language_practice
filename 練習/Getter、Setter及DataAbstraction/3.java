package 練習.第一章;

class Student {
    private int chi, eng, math;
    public void setChi(int c) {
        chi = c;
    }
    public void setEng(int e) {
        eng = e;
    }
    public void setMath(int m) {
        math = m;
    }
    public int getChi() {
        return chi;
    }
    public int getEng() {
        return eng;
    }
    public int getMath() {
        return math;
    }
}

public class Student01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setChi(90);
        s1.setEng(85);
        s1.setMath(60);
        System.out.println("s1=> chi:" + s1.getChi());
        System.out.println("     eng:" + s1.getEng());
        System.out.println("    math:" + s1.getMath());
        Student s2 = new Student();
        s2.setChi(70);
        s2.setEng(35);
        s2.setMath(47);
        System.out.println("s2=> chi:" + s2.getChi());
        System.out.println("     eng:" + s2.getEng());
        System.out.println("    math:" + s2.getMath());
    }
}
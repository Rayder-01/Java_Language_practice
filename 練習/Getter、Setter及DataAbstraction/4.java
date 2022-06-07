package 練習.第一章;

class Team {
    private String team1, team2, team3;
    public void setT1(String t1) {
        team1 = t1;
    }
    public void setT2(String t2) {
        team2 = t2;
    }
    public void setT3(String t3) {
        team3 = t3;
    }
    public String getT1() {
        return team1;
    }
    public String getT2() {
        return team2;
    }
    public String getT3() {
        return team3;
    }
}

public class Baseball {
    public static void main(String[] args) {
        Team s1 = new Team();
        s1.setT1("Nationals");
        s1.setT2("Dodgers");
        s1.setT3("Yankees");
        System.out.println("s1=> Team1:" + s1.getT1());
        System.out.println("     Team2:" + s1.getT2());
        System.out.println("     Team3:" + s1.getT3());
        Team s2 = new Team();
        s2.setT1("Yankees");
        s2.setT2("Dodgers");
        s2.setT3("Nationals");
        System.out.println("s2=> Team1:" + s2.getT1());
        System.out.println("     Team2:" + s2.getT2());
        System.out.println("     Team3:" + s2.getT3());
    }
}


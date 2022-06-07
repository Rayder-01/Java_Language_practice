class Drama {
    static private String rate = "b";
    private String language = "english";
    public String getRate() {
        return rate;
    }
    public void setRate(String r) {
        rate = r;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String l) {
        language = l;
    }
}

public class DramaPlay {
    public static void main (String argv[]) {
        Drama d1 = new Drama();
        Drama d2 = new Drama();
        d1.setRate("a");
        d1.setLanguage("irish");
        d2.setRate("c");
        d2.setLanguage("chinese");
        System.out.println("d1.getRate():" + d1.getRate().equals("c"));
        System.out.println("d2.getRate():" + d2.getRate().equals("c"));
        System.out.println("d1.getLanguage():" + d1.getLanguage().equals("irish"));
        System.out.println("d2.getLanguage():" + d2.getLanguage().equals("chinese"));
    }
}


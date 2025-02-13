public class Main {
    public static void main(String[] args) {
        Arthropods a1 = new Arthropods("Some Arthropods", 8);

        Scorpion ss1 = new Scorpion("Yellow Scorpion", 6, 1, "Zhorik");
        Scorpion ss2 = new Scorpion("Imperator", 8, 2, "Malish");

        Spider s1 = new Spider("Black widow", 8, 2, true);
        Spider s2 = new Spider("Jumper", 7, 2,false);

        Arthropods aa[] = {a1, s1, s2, ss1, ss2};

        for (int i = 0; i<aa.length; i++){
            aa[i].run();
        }
    }
}
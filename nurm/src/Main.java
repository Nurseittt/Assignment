public class Main {
    public static void main(String[] args) {
        Cars f1 = new Cars("German Cars",945);

        BMV bb1 = new BMV("m5 f90", 945, 4,"Volk");
        BMV bb2 = new BMV("m5 f10",876, 3,"Lev");

        Mersedes mm1 = new Mersedes("CLS 63", 913, 4, false);
        Mersedes mm2 = new Mersedes("EQS",587, 2,true);

        Cars ff[] = {f1, bb1, bb2, mm1, mm2};

        for (int i = 0; i < ff.length; i++) {
            ff[i].run();
        }
    }
}

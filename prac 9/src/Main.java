/* public class Main {
    public static void main(String[] args) {
        StringBuilder nk = new StringBuilder("HII, ");
        nk.append("Teacher");
        System.out.println(nk);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        StringBuilder nk = new StringBuilder();
        nk.append(777);
        nk.append(" Nurseit");
        nk.append(" . ");
        nk.append(false);
        nk.append(" ! ");
        nk.append(" , ");
        nk.append(" ? ");
        nk.append(" : ");

        System.out.println(nk);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        StringBuffer nk = new StringBuffer("caption");
        nk.insert(1, "cc");
        System.out.println(nk);
        nk.insert(3, 77);
        System.out.println(nk);
        nk.insert(0, 06);
        System.out.println(nk);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        StringBuffer nk = new StringBuffer("caption");
        nk.insert(1, "cc")
                .insert(3, 77)
                .insert(0, 06);
        System.out.println(nk);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        StringBuffer nk = new StringBuffer("caption");
        System.out.println(nk.charAt(1));
        nk.setCharAt(1, 'v');
        System.out.println(nk);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        StringBuffer nk = new StringBuffer("9876543210");
        nk.deleteCharAt(5);
        System.out.println(nk);
        nk.delete(0, 5);
        System.out.println(nk);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        StringBuilder nk = new StringBuilder("caption");
        nk.replace(0, 3, "motiva");
        System.out.println(nk);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        StringBuilder nk = new StringBuilder("cook");
        nk.reverse();
        System.out.println(nk);
    }
}*/

public class Main {
    public static void main(String[] args) {
        StringBuilder nk = new StringBuilder("pizza");
        String s1 = nk.substring(2);
        System.out.println(s1);
        String s2 = nk.substring(1, 4);
        System.out.println(s2);
    }
}

public class Main {
    public static void main(String[] args) {
        StringBuffer nk = new StringBuffer("Kosdavletov ");
        nk.append("Nurseit");
        nk.replace(2,4,"AB");
        //nk.reverse();
        nk.delete(2, 4);
        //nk.substring(2);
        System.out.println(nk);
    }
}
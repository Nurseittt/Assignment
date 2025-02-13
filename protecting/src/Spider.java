public class Spider {
    protected int chelic;
    protected String nick;
    public Spider(){
        super();
        this.chelic = 0;
        this.nick = "";
    }
    public Spider(String name, int paws, String chelic, String nick){
        super(chelic, nick);
        this.chelic = chelic;
        this.nick = nick;
    }
    public void run(){
        System.out.println();
    }
}

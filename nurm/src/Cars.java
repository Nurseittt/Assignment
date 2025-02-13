public class Cars {
    protected String name;
    protected int hp;

    public Cars(){
        this.name = "No name";
        this.hp = 0;
    }
    public Cars(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public void run() { System.out.println("Cars "+name+", "+hp+" hp is riding"); }
}

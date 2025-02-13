public class Mersedes extends Cars {
    protected int place;
    protected boolean isElectric;

    public Mersedes(){
        super();
        this.place = 0;
        this.isElectric = true;
    }
    public Mersedes(String name, int hp, int place, boolean isElectric){
        super(name, hp);
        this.place = place;
        this.isElectric = isElectric;
    }
    public void run (){
        System.out.println("Mersedes "+name+", "+hp+" hp and "+place+" places "
                +(isElectric?"electric":"non-electric")+" is riding");
    }
}

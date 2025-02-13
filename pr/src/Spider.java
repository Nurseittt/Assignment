public class Spider extends Arthropods {
    protected int chelicerae;
    protected boolean isDangerous;

    public Spider(){
        super();
        this.chelicerae = 0;
        this.isDangerous = true;
    }
    public Spider(String name, int paws, int chelicerae, boolean isDangerous){
        super(name, paws);
        this.chelicerae = chelicerae;
        this.isDangerous = isDangerous;
    }
    public void run (){
        System.out.println("Spider "+name+", "+paws+" paws with "+chelicerae+" chelicerae "
                +(isDangerous?"danger":"non-dangerous")+" is running");
    }
}

public class Scorpion extends Arthropods{
    protected int claws;
    protected String nickName;
    public Scorpion(){
    }
    protected Scorpion(String name, int paws, int claws, String nickName){
        super(name, paws);
        this.claws = claws;
        this.nickName = nickName;
    }
    public void run(){
        System.out.println("Scorpion "+name+" with nickname "+nickName+", "
                +paws+" paws with "+claws+" claws is eating");
    }
}

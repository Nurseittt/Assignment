public class BMV extends Cars {
    protected int volume;
    protected String nickName;
    public BMV(){
    }
    protected BMV(String name, int hp, int volume, String nickName){
        super(name, hp);
        this.volume = volume;
        this.nickName = nickName;
    }
    public void run(){
        System.out.println("BMW "+name+" with nickname "+nickName+", "
                +hp+" hp spinning tires with "+volume+" volume");
    }
}

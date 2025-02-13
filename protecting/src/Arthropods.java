public class Arthropods {
    protected String name;
    protected int paws;
    public Arthropods(){
        this.name = "No name";
        this.paws = 0;
    }
    public Arthropods(String name, int paws){
        this.name = name;
        this.paws = paws;
    }
    public void run(){
        System.out.println(name);
    }
}

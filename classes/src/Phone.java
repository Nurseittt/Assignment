public class Phone {
    String name;
    String model;
    int price;
    public Phone(){
        this.name = "No name";
        this.model = "No model";
        this.price = 0;
    }
    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
    //public void run() {
        //System.out.println(name+" - "+model+" for "+price+" KZT");
    //}
    public String getData() {
        return name + " - " + model + " for " + price + " KZT";
    }
}

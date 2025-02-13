public class Phone {
    private String name;
    private String model;
    private int price;
    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
    public Phone() {}
    public static String getCategory(){
        if(price>=1000){
            return "TOP";
        }else if(price<1000 && price>=500){
            return "MEDIUM";
        }else if(price<500){
            return "SIMPLE";
        }
    }
}

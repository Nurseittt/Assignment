public class Player {
    int number;
    String name;
    String surname;
    String position;
    public Player(){
        this.number = 0;
        this.name = "No name";
        this.surname = "No surname";
        this.position = "No position";
    }
    public Player(int number, String name, String surname, String position){
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }
    public String tostring(){
        return "Number: "+number+" Full Name: "+name+" "+surname+" Position: "+position;
    }
}

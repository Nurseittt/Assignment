public class Main {
    public static void main(String[] args) {

        UserDataBase database = new UserDataBase();

        User clientUserOne = new ClientUser(8,"n.kosd@gmail.com","NK","Password");
        User moderUser = new Moderator(9,"kosd.n@gmail.com","KN","Password11");
        User administer = new Admin(10,"nur.kosd@gmail.com","NKM","Password1234567");

        System.out.println(clientUserOne.checkPasswordSecurity());
        System.out.println(moderUser.checkPasswordSecurity());
        System.out.println(administer.checkPasswordSecurity());
    }
}
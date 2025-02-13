public class ClientUser extends User {

    public ClientUser(int id, String email, String fullname, String password) {
        super(id, email, fullname, password);
    }

    @Override
    public String checkPasswordSecurity() {
        if(getPassword().length() >= 8){
            return "Надежный пароль";
        } else if (getPassword().length() < 8) {
            return "Пароль слишком легкий";
        }
        return null;
    }
}

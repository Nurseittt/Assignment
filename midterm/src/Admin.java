public class Admin extends User {
    public Admin(int id, String email, String fullname, String password) {
        super(id, email, fullname, password);
    }

    @Override
    public String checkPasswordSecurity() {
        if (getPassword().length() >= 15) {
            return "Надежный пароль";
        } else if (getPassword().length() < 15) {
            return "Пароль слишком легкий";
        }
        return null;
    }
}
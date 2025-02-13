public class Moderator extends User {
    public Moderator(int id, String email, String fullname, String password) {
        super(id, email, fullname, password);
    }

    @Override
    public String checkPasswordSecurity() {
        if (getPassword().length() >= 11) {
            return "Надежный пароль";
        } else if (getPassword().length() < 11) {
            return "Пароль слишком легкий";
        }
        return null;
    }
}
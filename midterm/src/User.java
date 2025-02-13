public abstract class User {
    private int id;
    private String email;
    private String fullname;
    private String password;

    public User() {

    }
    public User(int id, String email, String fullname, String password) {
        this.id = id;
        this.email = email;
        this.fullname = fullname;
        this.password = password;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public abstract String checkPasswordSecurity();
}

public class UserDataBase {
    private User[] users = new User[100];
    private int c = 0;

    public void addUser(User user) {
        if (c < users.length) {
            users[c] = user;
            c++;
        }
    }

    public void printAllUsers() {
        for (int i = 0; i < c; i++) {
            System.out.println(users[i].getFullname() + " - " + users[i].getEmail());
        }
    }
}
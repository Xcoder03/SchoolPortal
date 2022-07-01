package School;

public class Main {
    public static void main(String[] args) {
     Register rgs = new Register();
     StudentDashB sdb = new StudentDashB();
     sdb.signUp(rgs);
     sdb.signIn(rgs.getEmail(),rgs.getPassword(),rgs.getGrade());
    }
}

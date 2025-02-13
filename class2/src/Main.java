public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Guldana";
        s1.surname = "Shyntore";
        s1.gpa = 3.4;
        System.out.println(s1.getStudentData());
    }
}

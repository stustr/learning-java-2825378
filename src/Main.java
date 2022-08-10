public class Main {

    public static void main(String[] args) {
       StudentProfile studentA = new StudentProfile("John", "Smith", 2022, 4.9, "Physics");
       StudentProfile studentB = new StudentProfile("James", "Jones", 2022, 9.0,"Maths");
       
       System.out.println(studentA.expGradYear);
       studentA.incGradYear();
       System.out.println(studentA.expGradYear);
    }
}

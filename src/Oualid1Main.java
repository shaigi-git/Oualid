/**
 * Created by shai on 9/9/16.
 */
public class Oualid1Main {

    public static void main(String[] args) {

        Student s1 = new Student(111000, "Shai");
        s1.registerSubject("math");
        s1.registerSubject("history");
        s1.registerSubject("biology");

        System.out.println(s1);
        s1.registerSubject("physics");
        s1.registerSubject("physics");
        s1.registerSubject("physics");
        s1.registerSubject("physics");
        s1.registerSubject("physicsw");
        s1.registerSubject("physicsw");
        s1.registerSubject("physicsz");
        if (s1.registerSubject("physicsa") == false) {
            System.out.println("*** Error ***");
        }
        System.out.println(s1);
    }
}

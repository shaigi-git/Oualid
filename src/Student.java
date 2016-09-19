/**
 * Created by shai on 9/9/16.
 */
public class Student {

    private static final int MAX_SUBJECTS = 10;
    private int id;
    private String name;
    private Subject subjects[];
    private int nextSubjectIndex;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.subjects = new Subject[MAX_SUBJECTS];
        this.nextSubjectIndex = 0;
    }

    public boolean registerSubject(String subjectName) {
        Subject subject = new Subject(subjectName);
        if (nextSubjectIndex < MAX_SUBJECTS) {
            this.subjects[this.nextSubjectIndex] = subject;
            this.nextSubjectIndex++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String ans = "Student name: " + this.name + " id: " + this.id + " ";
        ans += "Student subjects: ";
        for (Subject s : subjects) {
            if (s != null) {
                ans += s.getName() + " ";
            }
        }
        return ans;
    }

}

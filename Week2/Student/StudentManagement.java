import java.util.HashSet;

public class StudentManagement
{
    private final Student[] students = new Student[100];
    private int studentCount = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        students[studentCount] = newStudent;
        studentCount++;
    }

    public String studentsByGroup() {
        String res = "";

        HashSet<String> existed = new HashSet<>();
        for (int i = 0; i < studentCount; i++) {
            String gr = students[i].getGroup();

            if (existed.contains(gr)) continue;
            res += gr + "\n";

            existed.add(gr);
            for (int j = i; j < studentCount; j++) {
                if (students[j].getGroup().equals(gr)) {
                    res += students[j].getInfo() + "\n";
                }
            }
        }

        return res;
    }

    public void removeStudent(String id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equals(id)) {
                removeStudent(i);
                return;
            }
        }
    }

    public void removeStudent(int index) {
        for (int i = index; i < studentCount - 1; i++) {
            students[i] = students[i + 1];
        }
        studentCount--;
    }
}
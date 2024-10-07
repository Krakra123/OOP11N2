public class Main {
    public static void main(String[] args) {
        StudentManagement manager = new StudentManagement();

        Student a = new Student();
        a.setName("Nguyen Van An");
        a.setId("17020001");
        a.setGroup("K62CC");
        a.setEmail("17020001@vnu.edu.vn");
        manager.addStudent(a);   
        Student b = new Student();
        b.setName("Nguyen Van B");
        b.setId("17020002");
        b.setGroup("K62CC");
        b.setEmail("17020001@vnu.edu.vn");
        manager.addStudent(b);   
        Student c = new Student();
        c.setName("Nguyen Van C");
        c.setId("17020003");
        c.setGroup("K62CB");
        c.setEmail("17020001@vnu.edu.vn");
        manager.addStudent(c);   
        Student d = new Student();
        d.setName("Nguyen Van D");
        d.setId("17020004");
        d.setGroup("K62CB");
        d.setEmail("17020001@vnu.edu.vn");
        manager.addStudent(d);   

        System.out.println(manager.studentsByGroup());
    }
}
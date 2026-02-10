class Student {
    private int id;
    private String name;
    private int marks;

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setMarks(int marks) { this.marks = marks; }

    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else return "C";
    }

    public void display() {
        System.out.println("Student: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class Student {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setName("Rahul");
        s.setMarks(85);
        s.display();
    }
}

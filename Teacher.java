public class Teacher {
    String Name, Department, Course, Designation;

    public Teacher(String Name, String Department, String Course, String Designation) {

        this.Name = Name;
        this.Department = Department;
        this.Course = Course;
        this.Designation = Designation;

    }

    public static void main(String[] args) {

        Teacher t1 = new Professor("Aman", "IT", "DSA");
        Teacher t2 = new Associate_Professor("Raj", "IT", "PCPF");
        Teacher t3 = new Assistant_Professor("Anuj", "CS", "DSGT");

        t1.displayInfo();
        t2.displayInfo();
        t3.displayInfo();
    }

    public void displayInfo() {

        System.out.println("Name: " + this.Name);
        System.out.println("Department: " + this.Department);
        System.out.println("Course: " + this.Course);
        System.out.println("Designation: " + this.Designation);
    }
}
class Professor extends Teacher {
    public Professor (String Name, String Department, String Course) {
        super (Name, Department, Course, "Professor" );

    }
}

class Associate_Professor extends Teacher {
    public Associate_Professor (String Name, String Department, String Course) {
        super (Name, Department, Course, "Associate Professor" );
    }
}

class Assistant_Professor extends Teacher {
    public Assistant_Professor (String Name, String Department, String Course) {
        super (Name, Department, Course, "Professor" );

    }
}

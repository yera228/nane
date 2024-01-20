class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        return (averageMark == 5) ? 100 : 80;
    }
}

class Aspirant extends Student {
    // Additional variable for scientific work
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }


    public double getScholarship() {
        return (averageMark == 5) ? 200 : 180;
    }
    public static void main(String[] args) {
        // Creating objects of Student and Aspirant classes
        Student student = new Student("Yerasyl", "Doktarbek", "Group A", 4.5);
        Aspirant aspirant = new Aspirant("Ramazan", "Kaliev", "Group B", 5.0, "Research Topic");

        // Creating an array of type Student containing both Student and Aspirant objects
        Student[] students = {student, aspirant};

        // Calling getScholarship() method for each array element
        for (Student s : students) {
            System.out.println(s.firstName + " " + s.lastName + ": Scholarship amount - $" + s.getScholarship());
        }
    }
}
public class Student {
    private String name;
    // can initialise
    // static int count = 0;
    private static int count;
    private int age;
    private String course;

    // constructor stops this:
    // Student s1 = new Student();
    // s1.name = "Alice";
    // Instead: Student s1 = new Student("Alice");
    public Student(String name, int age, String course) {
        this.name=name;
        count+=1;
        this.age=age;
        this.course=course;
    }

    // instead of printing mem location
    @Override
    public String toString() {
        return "\nStudent: " + "\nName: " + name +
                "\nAge: " + age +
                "\nCourse: " + course;
    }

    // uses objects so non-static
    public String getName(){
        return name;
    }

    public int getCount(){
        return count;
    }

    public int getAge(){
        return age;
    }

    public String getCourse(){
        return course;
    }
}

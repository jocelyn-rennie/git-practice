public class Student {
    String name;
    // can initialise
    // static int count = 0;
    static int count;
    int age;
    String course;

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

    public void introduce() {
        System.out.println("\nStudent:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Current student count: " + count);
        System.out.println();
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

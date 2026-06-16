// inherits person
public class Student extends Person implements Searchable{
    // can initialise
    // static int count = 0;
    private static int count;
    private String course;

    // constructor stops this:
    // Student s1 = new Student();
    // s1.name = "Alice";
    // Instead: Student s1 = new Student("Alice");
    public Student(String name, int age, String course) {
        // inherits super methods
        super(name, age);
        count+=1;
        this.course=course;
    }

    // instead of printing mem location
    @Override
    public String toString() {
        return "\nStudent: " + "\nName: " + getName() + "\nAge: " + getAge()
                + "\nCourse: " + course;
    }

    public int getCount(){
        return count;
    }

    public String getCourse(){
        return course;
    }

    @Override
    public void introduce(){
        System.out.println("Person:" + "\nName: " + getName() + "\nAge: " +
                getAge() + "\nCourse: " + course);
    }

    @Override
    public boolean matches(String query){
        return getName().equalsIgnoreCase(query);
    }

}

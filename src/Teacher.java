public class Teacher extends Person{
    String subject;
    public Teacher(String name, int age, String subject){
        super(name,age);
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    // edits parent method
    @Override
    public void introduce(){
        System.out.println("Person:" + "\nName: " + getName() + "\nAge: " +
                getAge() + "\nSubject: " + subject);
    }
}

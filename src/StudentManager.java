import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class StudentManager {
    private ArrayList<Student> students;
    public StudentManager(ArrayList<Student> students){
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(String name, int age, String course) {
        Student student = new Student(name, age, course);
        students.add(student);
    }

    public void removeStudent(String name) {
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(name)){
                students.remove(i);
                return;
            }
        }

        System.out.println("\nStudent not found");
    }

    public Student findStudent(String name){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(name)){
                System.out.println("\nFound student");
                return students.get(i);
            }
        }
        return null;
    }

    public void printStudents(){
        System.out.println("\nStudents:");
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }

    public void saveStudents(){
        try {
            FileWriter writer = new FileWriter("students.txt");

            for (Student s : students) {
                writer.write(s.getName() + "," + s.getAge() + "," + s.getCourse() +"\n");
            }

            writer.close();

            System.out.println("Saved successfully");
        }
        catch (IOException e) {
            System.out.println("Error writing file");
        }
    }

    public void retrieveStudents(){
        try {
            Scanner sc = new Scanner(new File("students.txt"));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] split = line.split(",");
                Student student = new Student(split[0], Integer.parseInt(split[1]), split[2]);
                students.add(student);
            }

            sc.close();

            System.out.println("Retrieved successfully");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

}

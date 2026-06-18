import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
// files:
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*

        int i=0;

        while (i<10){
            System.out.print(i);
            i++;
        }

        // ArrayLists
        // non fixed size
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (int i =0; i<names.size(); i++){
            System.out.println(names.get(i));
        }

        names.set(1, "Bobby");
        names.remove("Bobby");

        // enhanced
        for (String name : names) {
            System.out.println(name);
        }

         */

        ArrayList <Student> students = new ArrayList<>();
        StudentManager sm = new StudentManager(students);
        sm.retrieveStudents();

        Scanner sc = new Scanner(System.in);
        String req;
        String name;
        int age;
        String course;

        while(true){
            System.out.println("\nEnter a request: ");
            System.out.println("1. Add student\n" +
                    "2. Remove student\n" +
                    "3. List students\n" +
                    "4. Find student\n" +
                    "5. Exit\n");

            req = sc.next();

            if(req.equals("5")){
                sm.saveStudents();
                break;
            }

            switch (req){
                case "1":
                    System.out.println("\nEnter student name: ");
                    name = sc.next();
                    while (true) {
                        try {
                            System.out.println("Enter student age:");
                            age = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Please enter a valid number.\n");
                            sc.nextLine(); // clear bad input
                        }
                    }
                    System.out.println("Enter student course: ");
                    course = sc.next();
                    sm.addStudent(name,age,course);
                    break;
                case "2":
                    System.out.println("\nEnter student name: ");
                    name = sc.next();
                    sm.removeStudent(name);
                    break;
                case "3":
                    sm.printStudents();
                    break;
                case "4":
                    if (students.isEmpty()){
                        System.out.println("\nThere are no students in the list");
                        break;
                    }
                    System.out.println("\nEnter student name: ");
                    name = sc.next();
                    Student res = sm.findStudent(name);
                    if (res == null){
                        System.out.println("\nStudent does not exist");
                    }
                    else{
                        System.out.println(res);
                    }
                    break;

                default:
                    System.out.println("\nInvalid input");

            }
        }


    }

    // static method belongs to the class
    // does this operation need information from a specific object?
    //Yes → non-static
    static int[] sequence(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i;
        }
        return arr;
    }
    static void remove(ArrayList<Student> students, String find){
        // can have issues removing with an enhanced for loop
        // shouldn't use .name
        // use getters for encapsulation
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(find)) {
                students.remove(i);
                return;
            }
        }
        System.out.println("\nNo such student");
    }

    static void printStudents(ArrayList<Student> students){
        if (students.isEmpty()) {
            System.out.println("\nNo students found.");
            return;
        }

        System.out.println("\nAll students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    static Student exists(ArrayList<Student> students, String find){
        for (Student student : students) {
            if (student.getName().equals(find)) {
                System.out.println("\nStudent found");
                return student;
            }
        }
        return null;
    }
}
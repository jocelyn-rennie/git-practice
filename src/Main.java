import java.util.Scanner;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        System.out.println("Hello from B");
        System.out.println("Test1");
        System.out.println();

        int i=0;

        while (i<10){
            System.out.print(i);
            if (i%2==0){
                System.out.println(" even");
            }
            else{
                System.out.println(" odd");
            }
            i++;
        }


        System.out.println();
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] seq = sequence(n);
        System.out.println();

        for( i = 0; i<n; i++){
            System.out.println(seq[i]);
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

        Students one = new Students("Emma", 18, "CS");
        //one.introduce();

        Students two = new Students("Bob", 20, "Sports");
        //two.introduce();
        Students three = new Students("Dave", 19, "Biology");
        //three.introduce();

        ArrayList <Students> students = new ArrayList <>();
        students.add(one);
        students.add(two);
        students.add(three);

        //printStudents(students);

        remove(students,"Emma");

        printStudents(students);

        remove(students,"Dave");

        printStudents(students);

        remove(students,"Dave");

         */

        Scanner sc = new Scanner(System.in);
        String req;
        ArrayList <Student> students = new ArrayList<>();
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
                break;
            }

            switch (req){
                case "1":
                    System.out.println("\nEnter student name: ");
                    name = sc.next();
                    System.out.println("Enter student age: ");
                    age = sc.nextInt();
                    System.out.println("Enter student course: ");
                    course = sc.next();
                    Student student = new Student(name, age, course);
                    students.add(student);
                    break;
                case "2":
                    System.out.println("\nEnter student name: ");
                    name = sc.next();
                    remove(students, name);
                    break;
                case "3":
                    printStudents(students);
                    break;
                case "4":
                    if (students.isEmpty()){
                        System.out.println("\nThere are no students in the list");
                        break;
                    }
                    System.out.println("\nEnter student name: ");
                    name = sc.next();
                    Student res = exists(students, name);
                    if (res == null){
                        System.out.println("\nStudent does not exist");
                    }
                    else{
                        res.introduce();
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
            student.introduce();
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
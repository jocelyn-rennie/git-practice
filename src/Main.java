import java.util.Scanner;
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

         */

        System.out.println();
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] seq = sequence(n);
        System.out.println();

        for( int i =0; i<n; i++){
            System.out.println(seq[i]);
        }

    }

    static int[] sequence(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i;
        }
        return arr;
    }
}
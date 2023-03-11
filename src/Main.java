/*
Question : Write a program to print floyd's triangle.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int starting,ending,i,j;
        System.out.println("Enter the starting value :");
        starting = sc.nextInt();
        System.out.println("Enter the ending value :");
        ending = sc.nextInt();
        System.out.println("Printing the result :");
        for (i = starting; i < ending; i++){
            for (j = starting; j <= i * 2 -1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
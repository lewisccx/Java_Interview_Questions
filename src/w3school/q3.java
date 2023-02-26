package w3school;

import java.util.Scanner;

//7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
//        Test Data:
//        Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80
public class q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        for(int i = 1; i<=10; i ++){
            System.out.println(num1 + " x " + i + " = " + num1 * i);
        }
    }
}

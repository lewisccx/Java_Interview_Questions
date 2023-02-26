package basic;

import java.util.ArrayList;
import java.util.List;

public class PrimeExample {

    static boolean primeNumber(int num){

        List<Integer> list = new ArrayList<Integer>();

        if(num == 0 || num == 1 ){
            return  false;
        }

        else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    list.add(i);
                }
            }
            if (list.size() == 2) {
                return true;
            } else {
                return false;
            }

        }
    }

    public static void main(String[] args) {
        int num = 3;
        boolean result = primeNumber(num);
        if(result){
            System.out.printf("%d is prime number", num);
        }else {
            System.out.printf("%d is not prime number", num);
        }



    }
}

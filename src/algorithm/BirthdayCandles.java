package algorithm;

import java.util.*;
import java.util.stream.Stream;

public class BirthdayCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (Integer integer : candles) {
            if(!numbers.containsKey(integer)){
                numbers.put(integer, 1);
            }
            else
            {
                int value = numbers.get(integer);
                value++;
                numbers.put(integer, value);
            }
        }

        return Collections.max(numbers.entrySet(), Map.Entry.comparingByValue()).getValue();
    }

    public static void main(String[] args) {
        int[] c1 = {4,4,1,4};
        List<Integer> candles = new ArrayList<>();
        for (int i = 0; i <c1.length ; i++) {
            candles.add(c1[i] );
        }
        System.out.println(birthdayCakeCandles(candles));
    }
}

package algorithm;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int max = 0;
        List<List<Integer>> finalList = new  ArrayList();
        if(a != null && (a.size() == 0 || a.size() == 1)) {
            return 1;
        } else {
            //sort list
            Collections.sort(a);
            int l = 0;
            int r = 1;
            while ( r < a.size() ) {
                List<Integer> subList = new ArrayList<>();

                subList.add (a.get(l));

                while ((a.get(r) - a.get(l) == 0) || (a.get(r) - a.get(l) == 1) ) {
                    subList.add(a.get(r));

                    if(r < a.size() -1) {
                        r++;
                    } else{
                        break;
                    }

                }
                l = l +1;
                r = l+1;

                finalList.add(subList);

            }
            for (List list : finalList) {
                max = Math.max(max, list.size());
            }
            return max;
        }

    }
}
public class PickingNumbers {
    public static void main(String[] args) throws IOException {


        List<Integer> list = Arrays.asList(1, 2,2,3,1,2);


        System.out.println(Result.pickingNumbers(list));

    }
}


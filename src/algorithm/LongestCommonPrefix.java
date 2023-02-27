package algorithm;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] a) {

        int size = a.length;

        /* if size is 0, return empty string */
        if (size == 0)
            return "";

        if (size == 1)
            return a[0];

        /* sort the array of strings */
        int minLength = 0;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for (int i = 1; i < a.length; i++) {
            minLength = a[0].length();
            if(a[i].length() < minLength ){
                minLength = a[i].length();
            }
        }
        int i = 0;
        while (i < minLength && a[0].charAt(i) == a[size-1].charAt(i) )
            i++;

        String pre = a[0].substring(0, i);

        return pre;
    }
    public static void main(String[] args)
    {
        LongestCommonPrefix gfg = new LongestCommonPrefix();
        String[] input = {"flower","flow","flight"};
        System.out.println( "The longest Common Prefix is : " +
                gfg.longestCommonPrefix(input));
    }
}

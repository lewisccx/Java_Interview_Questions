package basic;

public class ArmStrongExample {

    static boolean isArmStrong(int num){

        String numStr = String.valueOf(num);
        int sum = 0;
        int power = numStr.length();
        for (int i = 0; i < power; i++) {
            int digit = (int) numStr.charAt(i) - '0';
            sum  = (int) (sum + (Math.pow(digit,power)));

        }

        return num == sum;
    }

    public static void main(String[] args) {
        System.out.println(isArmStrong(125));
    }
}

package javapoint;
//Static block is used to initialize the static data member.
// It is executed before the main method, at the time of classloading.


class A2 {
    static {
        System.out.println("static block is invoked");
    }


        public static void main(String args[]) {
            System.out.println("Hello main");
        }

}
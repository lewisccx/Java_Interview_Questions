package javapoint;

class Test156 {
    public static void main(String args[]) {
        String a = new String("Sharma is a good player");
        String b = "Sharma is a good player";
        if (a == b) {
            System.out.println("a == b");
        }
        if (a.equals(b)) {
            System.out.println("a equals b");
        }
    }
}
// a equals b
//The operator == also check whether the references of the two string objects are equal or not.
//        Although both of the strings contain the same content, their references are not equal
//        because both are created by different ways(Constructor and String literal)
//        therefore, a == b is unequal. On the other hand, the equal() method always check for the content.
//        Since their content is equal hence, a equals b is printed.
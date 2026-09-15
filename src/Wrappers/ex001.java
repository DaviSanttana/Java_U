package Wrappers;

public class ex001 {
    static void main() {
        /* boolean b; // Boolean
        byte by;  //Byte
        short sh; //Short
        char ch;  //Character
        int in;  //Integer
        float f;  //Float
        long l; //Long
        double d; // Double
         */

        var user = new User("Joao", 21);
        int i = 0;
        printValue(user);
        System.out.println(i);
    }

    private static void printValue(final User user ){
        user.setName("Maria");
        user.setAge(22);
        System.out.println(user);
    }
}

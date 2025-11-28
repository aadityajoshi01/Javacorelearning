package javacorepractice;

public class ex2scope {

    public static int z = 6; // z has global scope

    public static void main(String[] args) {

        int x = 5; // x has local scope within the main method

        System.out.println(x); //x can be accessed here

        if (x == 5) { //block starts here
            int y = 10;//y has block scope
            System.out.println(y);
        } //y is destroyed here but x can be accessed here!!

    } //x is destroyed here!!
}//z is destroyed here

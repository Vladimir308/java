package ru.miluykov;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        int a = 100;
        int b = 300;
        int c = 250;
        int d = 3;
        int var1 = 10;
        int var2 = 20;
        int var3 = 10;
        System.out.println("Arithmetic operations");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("a--   = " +  (a--));
        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d));
        System.out.println("////////////////////");
        System.out.println("Logical operations");
        if ((var1 == var2) && (var2 == var3)) {
            System.out.println("var1, var2, var3 are equal");
        }
        System.out.println("var1, var2, var3 are not equal");
        System.out.println("////////////////////");
        System.out.println("Overflow");
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        System.out.println("Overflow for int type: " + (intMax+5));
        System.out.println("Overflow for long type: " + (longMax+5));
        System.out.println("////////////////////");
        System.out.println("Combination int and double:");
        System.out.println(10.0+2);
        System.out.println("Combination string, int and double:");
        System.out.println("Hello, world!" + 10.5+1);
        }
    }

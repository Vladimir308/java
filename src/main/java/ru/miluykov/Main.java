package ru.miluykov;

import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        out.print("Hello and welcome!");
        int a = 100;
        int b = 300;
        int c = 250;
        int d = 3;
        int var1 = 10;
        int var2 = 20;
        int var3 = 10;
        out.println("Arithmetic operations");
        out.println("a + b = " + (a + b));
        out.println("a - b = " + (a - b));
        out.println("a * b = " + (a * b));
        out.println("b / a = " + (b / a));
        out.println("b % a = " + (b % a));
        out.println("c % a = " + (c % a));
        out.println("a++   = " +  (a++));
        out.println("a--   = " +  (a--));
        out.println("d++   = " +  (d++));
        out.println("++d   = " +  (++d));
        out.println("////////////////////");
        out.println("Logical operations");
        out.println("var1, var2, var3 are not equal");
        out.println("////////////////////");
        out.println("Overflow");
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        out.println("Overflow for int type: " + (intMax+5));
        out.println("Overflow for long type: " + (longMax+5));
        out.println("////////////////////");
        out.println("Combination int and double:");
        out.println(10.0+2);
        out.println("Combination string, int and double:");
        out.println("Hello, world!" + 10.5+1);
        }
    }

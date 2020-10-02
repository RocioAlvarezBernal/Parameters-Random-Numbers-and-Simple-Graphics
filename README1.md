# Parameters-Random-Numbers-and-Simple-Graphics

1. True/False questions
For each of the following statements below, indicate whether it is true or false in Java:

a) The value of a local variable named i has no direct relationship with that of a
variable named i in its caller.
True because of scope.

b) The value of a parameter named x has no direct relationship with that of a variable
named x in its caller.
true it could have to be pointing to the variable to get its value  


2. Tracing method execution
For the program below, trace through its execution by hand to show what output is
produced when it runs.

Beacause these are int we drop the decimal

/*
 * File: Hogwarts.java
 * -------------------
 * This program is just testing your understanding of parameter passing.
 */
import acm.program.*;
public class Hogwarts extends ConsoleProgram {
 public void run() {
 bludger(2001);
 }
 
 
 private void bludger(int y) {
 int x = y / 1000;
 int z = (x + y);
 x = quaffle(z, y);
 println("bludger: x = " + x + ", y = " + y + ", z = " + z);
 }
 
 
 bludger
 int y 2001
 int x 1001
 int z 2003
 
 
 
 private int quaffle(int x, int y) {
 int z = snitch(x + y, y);
 y /= z;
 println("quaffle: x = " + x + ", y = " + y + ", z = " + z);
 return z;
 }
 
 quaffle
 int x 2003
 int y 1
 int z 1001
 
 
 private int snitch(int x, int y) {
 y = x / (x % 10);
 println("snitch: x = " + x + ", y = " + y);
 return y;
 }
} 

snitch
int x 4004
int y 1001



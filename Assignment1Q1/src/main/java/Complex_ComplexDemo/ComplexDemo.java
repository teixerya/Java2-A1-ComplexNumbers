package Complex_ComplexDemo;

/*
Programmer Name: Ryan Teixeira
Student Number: 991291764
 */

/*
Complex Demo is a class that creates new Complex objects
and uses the Complex objects to add and multiply real 
and imaginary numbers.

 */
public class ComplexDemo {
    public static void main(String[] args) {
      
Complex c1 = new Complex(2,3);//2+3i
Complex c2 = new Complex(8,5);//8+5i
Complex c3 = new Complex(); 
Complex c4 = new Complex();

c3 = c1.add(c2); 
System.out.println(c3);//should print 10+8i 
c4 = c1.multiply(c2); //should print 1+34i 
System.out.println(c4);  
System.out.println("\nProgrammer: Ryan Teixeira");
    }
}

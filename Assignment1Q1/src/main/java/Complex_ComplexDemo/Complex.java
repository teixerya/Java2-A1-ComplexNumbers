package Complex_ComplexDemo;
/*
Programmer Name: Ryan Teixeira
Student Number: 991291764

Designed a class Complex having a real part (x) and an imaginary part (y) 
as data members. Complex class has a two methods to:
-add two complex numbers.
-multiply two complex numbers.
 */
 
public class Complex{
    /**
     * data member x and y are declared here.
     */
    private int x;
    private int y;
    
    /**
     * Complex default constructor.
     */
    public Complex(){
    this.x = 0;
    this.y = 0;
    }
    
    /**
     * Complex sets an initial value for x and y.
     * @param x value set for real number.
     * @param y value set for imaginary number.
     */
    public Complex(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * A setter that sets a new integer x.
     * @param x value to be set as new x.
     */
    public void setX(int x){
        this.x = x;
    }
    
    /**
     * A setter that sets a new integer y.
     * @param y value to be set as new y.
     */
    public void setY(int y){
        this.y = y;
    }
    
    /**
     * A getter to retrieve the x.
     * @return retrieves x as a integer.
     */
    public int getX(){
        return this.x;
    }    
    
    /**
     * A getter to retrieve the y.
     * @return retrieves y as a integer.
     */
    public int getY(){
        return this.y;
    }
    //______________________
    
    /**
     * toString returns object type as a string.
     * @return retrieves x and y and concatenates values as a String.
     */
    @Override
    public String toString(){
        return "" + this.getX() + "+" + this.getY() + "i";
    }
    
    /**
     * add method adds two Complex object real numbers and adds
     * two Complex object imaginary numbers.
     * @param obj is added to the Complex coordinating real and 
     * imaginary numbers.
     * @return consolidate the Complex added values as a Complex object return
     * type named comp.
     */
    public Complex add(Complex obj){
        Complex comp = new Complex();
        comp.setX(this.getX() + obj.getX());
        comp.setY(this.getY() + obj.getY());
       
        return comp;
    }
    
    /**
     * multiply method multiplies two Complex's object real numbers and
     * multiplies two Complex object imaginary numbers; using distributive law.
     * @param obj2 is multiplied to the Complex coordinating real and
     * imaginary numbers.
     * @return consolidate the Complex multiplied values as a Complex object 
     * return type named mult.
     */
     public Complex multiply(Complex obj2){
        Complex mult = new Complex();
        mult.setX(this.getX() * obj2.getX()-this.getY()*obj2.getY());
        mult.setY(this.getX() * obj2.getY()+this.getY()*obj2.getX());
        
        return mult;
    }
    
    
    }
    


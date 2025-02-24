class Calculator
{
    // every method has its own stack
    int num = 10;// num instance variable
    public int add(int n1, int n2)
    {
        System.out.println(num);// we are using the variable num inside a method
        return n1 + n2;

    }
    public int add(int n1, int n2, int n3) // this is method overloading where the methods have the same name but different parameters,or same parameters but different type

    {
        return n1 + n2 + n3;
    }
    public double add(double n1,int n2)// n1,n2 local variables
    {
        return n1 + n2;
    }
}
public class Demo
{
    public static void main(String[] args )
    {
        int data =30 ; // it is under the stack main and has a key and a value data,10
        Calculator obj = new Calculator();// obj is a reference variable
        int r1 = obj.add(3,4);
        System.out.println(r1);


    }
}

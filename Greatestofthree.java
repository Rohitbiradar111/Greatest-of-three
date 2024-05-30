//This program shows Greatest of three values in java

public class Greatestofthree {
    public static void main(String args[])
    {
        int a = 5;
        int b = 15;
        int c = 10;

        if(a>=b && a>=c)
        {
            System.out.println("a is greatest");
        }
        else if(b>=a && b>=c)
        {
            System.out.println("b is greatest");
        }
        else
        {
            System.out.println("c is greatest");
        }
    }
}
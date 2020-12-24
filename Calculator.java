import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
       System.out.println("\f");
       Scanner input = new Scanner(System.in);
       
       double x = input.nextDouble();
       double y = input.nextDouble();
       
       System.out.println(""+x+"+"+y+"="+(x+y));
       System.out.println(""+x+"*"+y+"="+(x*y));
       System.out.println(""+x+"-"+y+"="+(x-y));
       System.out.println(""+y+"-"+x+"="+(y-x)); 
       System.out.println(""+x+"/"+y+"="+(x/y));
       System.out.println(""+y+"/"+x+"="+(y/x));
    }
}

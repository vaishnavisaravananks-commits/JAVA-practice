import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Simple Calci");
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("what operation you need to perform? ");
        System.out.println("addition");
         System.out.println("subtraction");
         System.out.println("multiplication");
          System.out.println("division");
          Scanner op=new Scanner(System.in);
         String operation=op.next();
        if(operation.equals("addition")){
            System.out.println(a+b);
        }
        else if(operation.equals("subtraction")){
            System.out.println(a-b);
        }
        else if(operation.equals("multiplication")){
            System.out.println(a*b);

        }
        else{
            System.out.println(a/b);
        }

    } 
}

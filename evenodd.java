import java.util.Scanner;

public class evenodd {
    public static void main(String args[]){
        System.out.println("Even or Odd Checker");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("The number is EVEN");
        }
        else{
            System.out.println("The number is ODD");
        }
    }
    
}

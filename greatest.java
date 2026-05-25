import java.util.Scanner;

public class greatest {
    public static void main(String args[]){
        System.out.println("Let us find the greatest number from the numbers you give!!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a=sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b=sc.nextInt();
        System.out.println("Enter the Third number: ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a +"is greatest");
        }
        else if(b>a && b>c){
            System.out.println(b +"is greatest");
        }
        else{
            System.out.println(c +"is greatest");
        }
    }
    
}

import java.util.Scanner;

public class codechallenge3 {
    public static void main(String args[]){
        System.out.println("Enter the details: ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Name: ");
        String name=sc.next();
        System.out.println("Enter your score out of 100: ");
        int score=sc.nextInt();
        System.out.println("Enter your Department: ");
        String dept=sc.next();
        System.out.println("Your CGPA is: "+((float)score/10));
    }
    
    
    
}

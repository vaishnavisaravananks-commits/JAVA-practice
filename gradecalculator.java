import java.util.Scanner;

public class gradecalculator {
    public static void main(String args[]){
        System.out.println("Grade Calculator");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you marks out of 100: ");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("You're Grade A");
        }
        else if(marks>=80){
            System.out.println("You're Grade B");
        }
        else if(marks>=70){
            System.out.println("You're Grade C");
        }
        else if(marks>=60){
            System.out.println("You're Grade D");
        }
        else{
            System.out.println("You're Grade F");
        }
    }
} 
    
        
    
        
    
    


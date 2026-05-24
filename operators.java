public class operators {
    public static void main(String args[])
        {
        System.out.println("Arithmetic Operations");
        //Variable declaration and Definition
        int a=5;
        int b=10;
        //addition
        int sum=a+b;
        //subtraction
        int diff=a-b;
        //multiplication
        int product=a*b;
        //division
        int div=a/b;
        System.out.println("Addition of a & b=: "+sum);
         System.out.println("Subtarction of a & b=: "+diff);
          System.out.println("Multiplication of a & b=: "+product);
           System.out.println("Division of a & b=: "+div);

           //Unary operator
           System.out.println("Increment and Decrement Operations");
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));

        //Assignment operator
          int num=6;
          num += 6;
          System.out.println("Add 6 more: ",+num);
          num *= 2;
          System.out.println("Mutiply by 2: "+num);
          


    }
}



    

    

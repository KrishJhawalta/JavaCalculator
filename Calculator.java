import java.util.Scanner;

class Functions{
     double sum(int a, int b){
        return a+b;
    }

    double sub(int a, int b){
       return a-b;
    }
    
    double multi(int a, int b){
        return a*b;
    }
    
    double divide(int a, int b){
        return a/b;
    }}

   class input extends Functions{
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        
        void getInput(){
            System.out.print("Enter number 1: ");
            num1 = sc.nextInt();
            
            System.out.print("Enter number 2: ");
            num2 = sc.nextInt();
        }
    }


public class Calculator{
    public static void main(String[] args) {

        int option; 
        option = 0;
        Scanner sc = new Scanner(System.in);
       
         
        // Object of Functions class
        Functions fn = new Functions();
        input inp = new input();
        
        
        // Cases 
        while(option != 5){
             // Display Options
        System.out.println("\nChoose Options: 1,2,3,4");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");

        // Input Option
        System.out.print("Enter option: ");
        option = sc.nextInt();


        double result;


        switch(option){
            case 1:
                inp.getInput();
                result = fn.sum(inp.num1, inp.num2);
                System.out.println("Result is: "+ result);
                break;

            case 2: 
                inp.getInput();
                result = fn.sub(inp.num1, inp.num2);
                System.out.println("Result is: "+ result);
                break;

            case 3: 
                inp.getInput();
                result = fn.multi(inp.num1, inp.num2);
                System.out.println("Result is: "+ result);
                break;

            case 4:
                inp.getInput();
                result = fn.divide(inp.num1, inp.num2);
                System.out.println("Result is: "+ result);
                break;

            case 5:
                System.out.println("Exiting the program.");
                break;

            default:
            System.out.println("Error: Invalid Option");
            
        }}
        sc.close();
    }
}
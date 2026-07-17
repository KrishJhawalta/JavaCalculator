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


class Calculator{
    public static void main(String[] args) {

        int option; 
        Scanner sc = new Scanner(System.in);

        // Display Options
        System.out.println("Choose Options: 1,2,3,4");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");
        System.out.print("Enter option: ");
        option = sc.nextInt();
         
        // Object of Functions class
        Functions fn = new Functions();
        
        
        // Cases
        switch(option){
            case 1:
                System.out.print("Enter number 1: ");               
                int num1 = sc.nextInt();
                
                System.out.print("Enter number 2: ");
                int num2 = sc.nextInt();
                
                double result = fn.sum(num1, num2);
                System.out.println("Result is: "+ result);
                break;

            case 2: 
                System.out.print("Enter number 1: ");
                num1 = sc.nextInt();
                
                System.out.print("Enter number 2: ");
                num2 = sc.nextInt();
                
                result = fn.sub(num1, num2);
                System.out.println("Result is: "+ result);
                break;

            case 3: 
                System.out.print("Enter number 1: ");
                num1 = sc.nextInt();
                
                System.out.print("Enter number 2: ");
                num2 = sc.nextInt();
                
                result = fn.multi(num1, num2);
                System.out.println("Result is: "+ result);
                break;

            case 4:
                System.out.print("Enter number 1: ");                
                num1 = sc.nextInt();
                
                System.out.print("Enter number 2: ");
                num2 = sc.nextInt();
                
                result = fn.divide(num1, num2);
                System.out.println("Result is: "+ result);
                break;

            default:
            System.out.println("Error: Invalid Option");
        }
        
    }
}
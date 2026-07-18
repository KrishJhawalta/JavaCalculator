// Java console calculator program
import java.util.Scanner;

// Operations class
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
        return (double)a/b;
    }

    double modulus(int a, int b){
        return (double)a%b;
    }
}

class input{
    int num1, num2;

    void getInput(Scanner sc){
        System.out.print("Enter number 1: ");
        num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();
    }
}

public class Calculator{
    public static void main(String[] args) {

        int option = 0;
        Scanner sc = new Scanner(System.in);

        Functions fn = new Functions();
        input inp = new input();


        // Options 

        while(option != 6){

            System.out.println("\nChoose Options:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Modulus");
            System.out.println("6: Exit");

            System.out.print("Enter option: ");
            option = sc.nextInt();

            double result;

            switch(option){

                // Cases

                case 1:
                    inp.getInput(sc);
                    result = fn.sum(inp.num1, inp.num2);
                    System.out.println("Result is: " + result);
                    break;

                case 2:
                    inp.getInput(sc);
                    result = fn.sub(inp.num1, inp.num2);
                    System.out.println("Result is: " + result);
                    break;

                case 3:
                    inp.getInput(sc);
                    result = fn.multi(inp.num1, inp.num2);
                    System.out.println("Result is: " + result);
                    break;

                case 4:
                    inp.getInput(sc);

                    if(inp.num2 == 0){
                        System.out.println("Cannot divide by zero.");
                    }else{
                        result = fn.divide(inp.num1, inp.num2);
                        System.out.println("Result is: " + result);
                    }
                    break;

                case 5:
                    inp.getInput(sc);
                    result = fn.modulus(inp.num1, inp.num2);
                    System.out.println("Result is: " + result);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Error: Invalid Option");
            }
        }

        sc.close();
    }
}
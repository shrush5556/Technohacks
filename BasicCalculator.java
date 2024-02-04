import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args){
        double num1,num2,result=0;
        char operation;
        System.out.println("***Basic Calculator***");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        num1 = sc.nextDouble();

        System.out.println("Enter Second Number: ");
        num2 = sc.nextDouble();

        System.out.println("Select operation: + , - , * , / " );
        operation = sc.next().charAt(0); 

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: Addition=" +result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: Subtraction=" +result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: Multiplication=" +result);
                break;

            case '/':
                if(num2 !=0){
                    result = num1 / num2;
                    System.out.println("Result: Division=" +result);
                }
                else{
                    System.out.println("Error !! division by zero is not possible");
                    return; 
                }
                
                break;
        
            default:
                System.out.println("Error ! Invalid operatoion");
                return;
        }
        System.out.println("Result : "+result);
    }
    
}

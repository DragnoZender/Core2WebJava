import java.util.*;

class Calculator{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

		System.out.println("Enter First number");
                int num1 = sc.nextInt();
		System.out.println("Enter Second number");
		int num2 = sc.nextInt();

                System.out.println("Enter the Operation");
                String opt = sc.next();

                switch(opt){
                        case "+":
                                System.out.println("Addition = " + (num1+num2));
                                break;
                        case "-":
                                System.out.println("Subtraction = " + (num1-num2));
                                break;
                        case "*":
                                System.out.println("Multiplication = " + (num1*num2));
                                break;
                        case "/":
                                System.out.println("Division = " + (num1/num2));
                                break;
                        case "%":
                                System.out.println("Modulas = " + (num1%num2));
                                break;
                        /*case "E":
                                System.out.println("poor Score");
                                break;
                        case "P":
                                System.out.println("Fail");
                                break;*/
                        default :
                                System.out.println("Invalid Operation");

                }

        }

}

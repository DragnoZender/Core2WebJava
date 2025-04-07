import java.util.*;

class Grade{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the Grade");
                String grade = sc.next();

                switch(grade){
                        case "O":
                                System.out.println("Outstanding");
                                break;
                        case "A":
                                System.out.println("Excellent");
                                break;
                        case "B":
                                System.out.println("Good");
                                break;
			case "C":
                                System.out.println("Average");
                                break;
			case "D":
                                System.out.println("Below Average");
                                break;
			case "E":
                                System.out.println("poor Score");
                                break;
			case "P":
                                System.out.println("Fail");
                                break;
                        default :
                                System.out.println("Invalid colour");

                }

        }

}

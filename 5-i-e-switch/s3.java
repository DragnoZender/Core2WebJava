import java.util.*;

class Cloth{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the size acronym :- ");
                String size = sc.next();

                switch(size){
                        case "S":
                                System.out.println("Small");
                                break;
                        case "M":
                                System.out.println("Medium");
                                break;
                        case "L":
                                System.out.println("Large");
                                break;
                        case "XL":
                                System.out.println("Extra Large");
                                break;
                        case "XXL":
                                System.out.println("Extra Extra Large");
                                break;
                        /*case "E":
                                System.out.println("poor Score");
                                break;
                        case "P":
                                System.out.println("Fail");
                                break;*/
                        default :
                                System.out.println("Invalid Size");

                }

        }

}

import java.util.*;

class TrafficLight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Colur");
		String colour = sc.next();

		switch(colour){
			case "Red":
				System.out.println("----STOP----");
				break;
			case "Yellow":
                                System.out.println("----WAIT----");
                                break;
			case "Green":
                                System.out.println("----GO----");
                                break;
			default :
				System.out.println("Invalid colour");
		
		}
	
	}

}

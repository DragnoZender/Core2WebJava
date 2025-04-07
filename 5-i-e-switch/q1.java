import java.util.*;

class TrafficLight{
	public static void main(String[] args){

		String stop = "Red";
	        String wait = "Yellow";
		String go = "Green";
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the colour :- ");
		String colour = sc.next();

		if(colour == stop){
			System.out.println("----STOP----");
		}else if(colour == wait){                                                                                                                                              
			System.out.println("----STOP----");
		}else if (colour == go){
				System.out.println("----GO----");
		}
	}
}

import java.util.*;

class Loop{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter N :- ");
                int N = sc.nextInt();

                for(int i = 1;i<=N;i++){
			if(i%2==0){
                        	System.out.println(i);
			}
                }

        }
}

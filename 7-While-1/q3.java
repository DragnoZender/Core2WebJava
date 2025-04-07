import java.util.*;

class Loop{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter N :- ");
                int N = sc.nextInt();
                int M = sc.nextInt();
                int i = N;

                while (i<=M){
                        if ((i % 4 == 0)|| (i%7==0)){
                                System.out.println(i);
                        	i++;
			}
                 }

        }
}

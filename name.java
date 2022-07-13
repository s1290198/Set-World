import java.util.Random;
import java.util.Scanner;

public class Coin{
    public static void main(String[] args){

        System.out.println("Who are you");
        System.out.print("> ");

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println("Hello, "+str+"!");
	
        int frag1=0,frag2=0;
        System.out.println("Tossing a coin...");

        for(int i=0;i<5;i++){
            System.out.print("Round "+i+": ");
            Random r = new Random();
            int coin = r.nextInt(2);
            if(coin==0){
                ++frag1;
                System.out.println("Heads");
            }
            else if(coin==1){
                ++frag2;
                System.out.println("Tails");
            }
        }
        System.out.println("Heads: "+frag1+", Tails: "+frag2);

	if(frag1>frag2) System.out.println("You won");
        else System.out.println("You lost!");
    }
}

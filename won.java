import java.util.Random;

public class won{
        public static void main(String[] args){

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

                if(frag1>frag2) System.out.println("You won");
                else System.out.println("You lost");
        }
}

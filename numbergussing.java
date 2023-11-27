import java.util.Scanner;
public class numbergussing {
    public static void main(String[] args) {
        int guesing_number = 10;
        int x = 0;
        Scanner myobj = new Scanner(System.in);
        while(x != guesing_number) {
            try{
                System.out.println("Enter a number: ");
                x = myobj.nextInt();
                if (x == guesing_number){
                    System.err.println("You are a winner");
                }
                else if (x > guesing_number){
                    System.err.println("Your number is high");

                }else{
                    System.err.println("Your number is low");

            }


            } catch(Exception e){
                System.out.println("Incorect input");
        //myobj.close();
        }


        }
        
    }


}

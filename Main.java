import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

         try {
             PacManGame snk = new PacManGame(9, 9);
             snk.start();
             Scanner scan = new Scanner(System.in);
             while (true) {
                 System.out.println(snk.toString());
                 while (snk.currentStatus == PacManGame.Status.IN_GAME) {
                     int move = scan.nextInt();
                     switch (move) {
                         case 8:
                             snk.move(PacManGame.Move.TOP);
                             break;
                         case 6:
                             snk.move(PacManGame.Move.RIGHT);
                             break;
                         case 2:
                             snk.move(PacManGame.Move.BOTTOM);
                             break;
                         case 4:
                             snk.move(PacManGame.Move.LEFT);
                             break;
                     }
                     System.out.println(snk.toString());
                 }
                 System.out.println("Do you want to play again? (Y) - (N)");
                 String choice = scan.nextLine();
                 if (choice.equalsIgnoreCase("Y")) {
                     snk = new PacManGame(9,9);
                     System.out.println("....starting new game...\n");
                 }
                 else if(!choice.equals("Y") || !choice.equals("N")){
                     System.out.println("Comand Error, please press (Y) to Play again or (N) to Quit");
                     scan.nextLine();
                 }
                 else{
                     break;
                 }
             }
             System.out.println("Closing Scanner...");
             scan.close();
             System.out.println("Scanner Closed.");

         } catch (Exception err) {

         }
     }
 }

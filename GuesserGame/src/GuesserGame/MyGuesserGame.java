package GuesserGame;
import java .util.Scanner;
class Guesser{
	int GuesserNum;
	public int GuesserNumb() {  //collect number from guesser
		Scanner sc = new Scanner(System.in);
		System.out.println("Kindly guess a number");
		GuesserNum = sc.nextInt();
		return GuesserNum;
	}
}
class Player{
	int PlayerNum;
	public int PlayerNumb() {   //collect number from player
		Scanner sc = new Scanner(System.in);
		PlayerNum = sc.nextInt();
		return PlayerNum;
	}
}
 class Umpire{
	 int Guessernum;
	 int Playernum1;
	 int Playernum2;
	 int Playernum3;
     
	 public void collectNumFromGuesser() { // umpire will collect number from guesser
		 Guesser Gu = new Guesser();
		 Guessernum=Gu.GuesserNumb();
	 }
	 public void collectNumFromPlayers() { // umpire will collect number from players
		 System.out.println("Kindly guess a number player1");

		 Player P1 = new Player();
		 Playernum1=P1.PlayerNumb();
		 System.out.println("Kindly guess a number palyer2");
		  Player P2 = new Player();
		 Playernum2=P2.PlayerNumb();
		 System.out.println("Kindly guess a number player3");
		 Player P3 = new Player();
		 Playernum3=P3.PlayerNumb();
		 System.out.println("Kindly guess a number player3");
		  
	 }
	 public void compare() {
		 if(Guessernum==Playernum1) {
			 if(Guessernum==Playernum2 && Guessernum==Playernum3) {
				 System.out.println("All players won the game");
			 }
			 else if(Guessernum==Playernum2) {
				 System.out.println("player 1  and player 2 won the game ");
			 }
			 else if(Guessernum==Playernum3){
				 System.out.println("Player 1 amd player 3 won the game");
			 }
			 else {
				 System.out.println("Only Player1 won the game");
			 }
		 }
		 else if(Guessernum==Playernum2) {
			 if(Guessernum==Playernum3) {
				 System.out.println("Player 2 and player 3 won the game");
			 }
			 else {
				 System.out.println("Player 2 won the game");
			 }
			 
		 }
		 else if(Guessernum==Playernum3) {
			 System.out.println("Only player3 won the game");
		 }
		 else {
			 System.out.println("All player lost the game");
		 }
	 }
 }
public class MyGuesserGame {
         public static void main(String[] args) {
        	 System.out.println("-------Game Started-------");
			Umpire um = new Umpire();
			um.collectNumFromGuesser();
			um.collectNumFromPlayers();
			um.compare();
			System.out.println("--------Game over-------");
		}
}
package line;
import data.ABC;
import integer.player;

public class data2 {
	int numberfromGuesser;
	int numberfromPlayer1;
	int numberfromPlayer2;
	int numberfromPlayer3;
	public void collectnumberfromGuesser() {
		ABC g=new ABC();
		numberfromGuesser=g.guessNumber();
	}
	public void collectnumberfromPlayer() {
		player p1=new player();
		player p2=new player();
		player p3=new player();
		numberfromPlayer1=p1.guessNumber();
		numberfromPlayer2=p2.guessNumber();
		numberfromPlayer3=p3.guessNumber();
	}
	public void compare() {
		System.out.println("Number is"+numberfromGuesser);
		if(numberfromGuesser==numberfromPlayer1) {
			System.out.println("Player1 wins");
		}
		if(numberfromGuesser==numberfromPlayer2) {
			System.out.println("Player2 wins");
		}
		if(numberfromGuesser==numberfromPlayer3) {
			System.out.println("Player3 wins");
		}
		if(numberfromGuesser!=numberfromPlayer1&&numberfromGuesser!=numberfromPlayer2&&numberfromGuesser!=numberfromPlayer3){
			System.out.println("Game lost");
		}
	}

}

public class SnakeLadder {

	static int position = 0;
	static int noOfRoll = 0;
	public static void main(String args[]) {

		int player = (int)(Math.floor(Math.random() * 10 ) % 2 ) + 1;
		if(player == 1) {
			System.out.println("Player A");
		}
		else
			System.out.println("Player B");

		while(position < 100) {
			int roll = (int)(Math.floor(Math.random() * 10 ) % 6 ) +1;
			noOfRoll = noOfRoll + 1;
			System.out.println("ROLL = " + roll);

			int option = (int)(Math.floor(Math.random() * 10 ) % 3 ) + 1;
			switch (option) {
			case 1:
				System.out.println("NO PLAY, STAY AT SAME POSITION");
				System.out.println("Your position = " + position);
				break;
			case 2:
				System.out.println("CLIMB THE LADDER");
				position = position + roll + roll;
				System.out.println("Your position = " + position);
				break;
			case 3:
				System.out.println("SNAKE BITE");
				position = position - roll;
				System.out.println("Your position = " + position);
				break;
			default:
				System.out.println("INVALID MOVE");
				break;
			}

			if(position < 0) {
				position = 0;
				System.out.println("Start Again");
			}

			if(position > 100) {
				System.out.println("Can not move above 100, roll again");
				position = position - roll - roll;
				System.out.println("Your position = " + position);
			}
		}
		System.out.println("Number of total roll = " + noOfRoll);
		if(player == 1) {
			System.out.println("Player A WON");
		}
		else
			System.out.println("Player B WON");
	}
}

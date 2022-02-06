public class SnakeLadder {
	static int position = 0;
	public static void main(String args[]) {
		int roll = (int)(Math.floor(Math.random() * 10 ) % 6 ) +1;
		System.out.println("ROLL = " + roll);
		position = position + roll;
		System.out.println("Your position = " + position);
	}
}

import java.util.Random;

 class Card {
	 
	 
	 private String name;
	 private int suit;
	 private int number; 
	 
	 
	 public Card () {
		 
		 Random randomGenerator = new Random();
		 
		 suit = randomGenerator.nextInt(4)+1;
		 
		 number = randomGenerator.nextInt(13)+1;
		 
		 setSuit();
		 
		 
	 }

	 public void setSuit() {
		 
		 switch (suit)
		 {
		 
		 case 1: name = "Heart";
			 break;
		 case 2: name = "Spades";
			 break;
		 case 3: name = "Clubs";
			 break;
		 case 4: name = "Diamonds";
			 break;
		
			 
		 }
	 }

 		public String tostring () {
 			return ( name + "\t" + number);
 		}
 		}
 public class cards
 {
	 public static void main (String [] args) {
		 Card c1 = new Card();
		 Card c2 = new Card();
		 Card c3 = new Card();
		 Card c4 = new Card();
		 Card c5 = new Card();
		 
		 System.out.println( "Card 1 :" + c1);
		 System.out.println("Card 2: " + c2);
		 System.out.println("Card 3:"+ c3);
		 System.out.println("Card 4 :" + c4);
		 System.out.println("Card 5: "+ c5);
		 
		 
		 
	 }
 }

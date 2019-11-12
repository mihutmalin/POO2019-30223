public class Card implements Comparable<Card>{
	private char number;
	private char suit;
	
	public Card(char number, char suit) {
		this.number = number;
		this.suit = suit;
	}

	public char getNumber() {
		return this.number;
	}
	
	public char getSuit() {
		return suit;
	}
	
	public void setNumber(char number) {
		this.number = number;
	}
	
	public void setSuit(char suit) {
		this.suit = suit;
	}
	
	@Override
	public int compareTo(Card c) {
		//clubs (♣)
		//diamonds (♦)
		//hearts (♥)
		//spades (♠)
		int how=0;
		if(this.suit<c.suit)
			how=-1;
		else if (this.suit>c.suit)
			how=1;
		else if(this.suit==c.suit) {
			if(this.number=='Q' && c.number=='K') 
				how= -1;
			if(c.number=='A')
				how=-1;
			else {
				if(this.number<c.number)
					how=-1;
				else if(this.number==c.number)
					how=0;
				else
					how=1;
			}
		}
		return how;
		
	}
	@Override
    public boolean equals(Object o) {
		return (this.number == ((Card)o).number && this.suit == ((Card)o).suit) ;
	}
	
	public String toString() {
		return this.number+" de "+this.suit;
	}
}
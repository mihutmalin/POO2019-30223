import java.util.Arrays;
public class Arrangement implements OrderedIterator {
	private Card[] deck;
	private int it;
	private int nrCards;
	Arrangement(){
		this.deck=new Card[32];
		this.it=0;
		this.nrCards=0;
	}

	@Override
	public int put(Comparable<Card> comparable) {
		for (int j = 0; j < this.nrCards; j++)
			if (this.deck[j].equals(comparable)) {
				return 0;
			}
		
		this.deck[this.nrCards++] = (Card) comparable;
		Arrays.sort(this.deck,0,this.nrCards);
		return 1;
	}
		
	public void remove(Card c) {
		if(this.nrCards!=0) {
			int nr=0;
			for(int i=0;i<this.nrCards;i++) {
				if(c.getNumber()==deck[i].getNumber()) {
					nr=i;
					break;
				}
			}
			for(int j=nr;j<this.nrCards-1;j++)
				deck[j]=deck[j+1];
			deck[nrCards-1]=null;
			this.nrCards--;
		}
		else
			System.out.println("Nu exista carti in pachet");
	}
	
	@Override
	public boolean hasNext() {
		if(this.deck[++this.it]!=null) 
			return true;
		else
			return false;
	}
	
	@Override
	public Card next() {
		return this.deck[++this.it];
	}
	public static void main(String[] args) {
		Arrangement aranjare=new Arrangement();
		Card carte=new Card('7','♣');
		aranjare.put(carte);
		aranjare.put(new Card('A','♣'));
		aranjare.put(new Card('2','♥'));
		aranjare.put(new Card('K','♣'));
		aranjare.put(new Card('Q','♣'));
		aranjare.put(new Card('J','♣'));
		aranjare.put(new Card('Q','♥'));
		aranjare.put(new Card('2','♠'));
		aranjare.put(new Card('4','♠'));
		aranjare.put(new Card('6','♠'));
		aranjare.put(new Card('9','♦'));
		
		aranjare.remove(carte);
		
		//Pachetul va fi ordonat mai intai pe culori si apoi in functie de valorile cartilor
		System.out.println("Pachetul ordonat va fi:");
		for(Card c:aranjare.deck) {
			if(c!=null) {
				System.out.println(c.getNumber()+" de "+c.getSuit());
			}
		}
	}
}

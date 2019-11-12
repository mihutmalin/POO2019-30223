import java.util.Iterator;

public interface OrderedIterator extends Iterator<Card> {
	public int put(Comparable<Card> comparable);
}
package llPositionalList;

import java.util.Iterator;
import java.util.NoSuchElementException;

import interfaces.Position;
import interfaces.PositionalList;

public class PositionalListElementsBackwardIterator<E> implements Iterator<Position<E>> {

	private Iterator<Position<E>> posIterator; 
	private LinkedPositionalList bList;
	
	public PositionalListElementsBackwardIterator (LinkedPositionalList x){
		while(!= null){
		}
			
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Position<E> next() {
		// TODO Auto-generated method stub
		return null;
	}

}
class ElementIterator<E> implements Iterator<E> { 
	Iterator<Position<E>> posIterator = 
			new PositionIterator(); 
	@Override
	public boolean hasNext() {
		return posIterator.hasNext();
	}

	@Override
	public E next() throws NoSuchElementException {
		if (!hasNext())
			throw new NoSuchElementException("No more elements."); 
		return posIterator.next().getElement();
	} 
	while(posIterator.hasNext()!= null){
		LinkedPositionalList bList;
		bList.addFirst(posIterator.next().getElement());
	}
}

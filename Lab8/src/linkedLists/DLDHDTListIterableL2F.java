package linkedLists;

import interfaces.LinkedList;
import interfaces.Node;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DLDHDTListIterableL2F<E> extends DLDHDTList<E> 
									  implements Iterable<E> 
{
	public Iterator<E> iterator() {
		return new LLIteratorF2L<E>(this);
	}

	private static class LLIteratorF2L<E> 
	implements Iterator<E> 
	{ 
		private LinkedList<E> theList;   // the list to iterate over
		// ... other internal fields ...
		private Node<E> current; 
		private boolean hasMoreElements; 

		public LLIteratorF2L(LinkedList<E> list)//lasst to first 
		{
			theList = list;
			
			if (theList.length() == 0) { 
				current = null; 
				hasMoreElements = false; 
			}
			else { 
				current = theList.getLastNode(); 
				hasMoreElements = true; 
			}
		}

		public boolean hasNext() {
			// Write the new code and substitute next statement ....
			return hasMoreElements;
		}

		public E next() throws NoSuchElementException {
			if(theList.length() == 0)
				throw new NoSuchElementException ("no such element in list");
			E etr = current.getElement(); 
			try { 
				current = theList.getNodeBefore(current); 
			}
			catch(NodeOutOfBoundsException e) { 
				current = null; 
				hasMoreElements = false; 
			}
			return etr;
		}

		public void remove() throws UnsupportedOperationException 
		{
			throw new UnsupportedOperationException("Remove is not implemented.");

		}
	}

}

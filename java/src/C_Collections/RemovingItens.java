package C_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemovingItens {

	public static void main(String[] args) {
//      removing itens from a list within loop
		
		List<String> fruits = new ArrayList<String>(List.of("Banana", "Apple", "Strawberry"));
		
		Iterator<String> fuitIterator = fruits.iterator();
		while (fuitIterator.hasNext()) {
			String string = (String) fuitIterator.next();
			
		}

	}

}

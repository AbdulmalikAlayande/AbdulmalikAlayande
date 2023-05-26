package Chapter16.Set;

import Chapter16.List.AbdulmalikAlayande;
import Chapter16.List.Alayande;

public class MySets<E> implements Sets<E>{
	
	Alayande<E> alayande = new AbdulmalikAlayande<>();
	
	@Override public void add(E object) {
		if (checkForDuplicate(object))
			throw new IllegalArgumentException("Object Already Exists in the List");
		alayande.add(object);
	}
	
	private boolean checkForDuplicate(E object) {
		for (int i = 0; i < alayande.size(); i++)
			if (alayande.get(i) == object) return true;
		return false;
	}
	
	@Override public void delete(int index) {
	
	}
}

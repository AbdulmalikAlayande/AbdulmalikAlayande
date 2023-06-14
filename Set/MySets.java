package Chapter16.Set;

import Chapter16.List.ArrayLists;
import Chapter16.List.Lists;

import java.util.Scanner;

public class MySets<E> implements Sets<E>{
	
	Lists<E> alayande = new ArrayLists<>();
	
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
		alayande.delete(index);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter bb");
		long cpp = scanner.nextLong();
		
		System.out.println("enter wp");
		double wp = scanner.nextDouble();
		
		double diff = cpp - wp;
		double numDiv = diff/cpp;
		double numMul = numDiv*100;
		
		System.out.printf("%f%n%f%n%f", diff, numDiv, numMul);
	}
}

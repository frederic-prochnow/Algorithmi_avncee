import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import java.util.Iterator;


public class ListUtils{
	
	public static List<Integer> genereRdmIntList() {
		List<Integer> liste = new ArrayList<Integer>();
		int taille = new Random().nextInt(31);
		Random alea = new Random();
		for(int i=0; i<taille; i++){
			liste.add(alea.nextInt(101));
		}
		return liste;
	}
	
	public static String toString(List<Integer> l) {
		String s="";
		Iterator<Integer> it = l.iterator();
		if(it.hasNext()){
			s+= it.next();
		}
		while(it.hasNext()){
			s+=" -> " + it.next();
		}
		return s;
	}
	
	public static String toStringInverse(List<Integer> l) {
		String s="";
		ListIterator<Integer> it = l.listIterator(l.size());
		if(it.hasPrevious()) {
			s+= it.previous();
		}
		while(it.hasPrevious()){
			s+=" -> " + it.previous();
		}
		return s;
	}

	public static void affiche(List<Integer> l) {
		System.out.println(toString(l));
	}

	public void afficheInverse(List<Integer> l) {
		System.out.println(toStringInverse(l));
	}

	public int somme(List<Integer> l) {
		int res =0;
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()){
			res+= it.next();
		}
		return res;
	}

	public int moyenne(List<Integer> l) {
		return somme(l)/l.size();
	}

	public int max(List<Integer> l) {
		Iterator<Integer> it = l.iterator();
		int max =0;
		while(it.hasNext()){
			if(it.next() > max){
				max = it.next();
			}
		}
		return max;
	}

	public int min(List<Integer> l) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object positions(List<Integer> l, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public List paire(List<Integer> l) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean estTrie(List<Integer> l) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object trie(List<Integer> l) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

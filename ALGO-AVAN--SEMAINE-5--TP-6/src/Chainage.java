import java.util.Arrays;

public class Chainage implements HashTable{

	MaListe[] tab;
	int i=0;
	
	public Chainage(int taille) {
		tab = new MaListe[taille];
	}
	
	public String toString() {
		return "Chainage [tab=" + Arrays.toString(tab) + "]";
	}

	@Override
	public int put(String key, int value) {
		tab[i].ajout(new HashCouple<String, Integer>(key, value));
		i++;
		return 1;
	}

	@Override
	public int get(String key) {
		
		return 1;
	}

	@Override
	public boolean remove(String key) {
		tab[i].retrait(key);
		i--;
		return true;
	}

	@Override
	public boolean contains(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}

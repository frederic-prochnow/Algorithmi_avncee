import java.util.LinkedList;
import java.util.List;

public class MaListe {

	HashCouple<String, Integer> hCouple;
	LinkedList<HashCouple<String,Integer>> mListe;
	
	public MaListe(String cle,Integer information) {
		hCouple = new HashCouple<String, Integer>(cle,information);
		mListe = new LinkedList<>();
	}
	
	public void ajout(HashCouple<String,Integer> e){
		mListe.add(e);
	}
	
	public void retrait(String key){
		mListe.remove(key);
	}

	
	@Override
	public String toString() {
		return "MaListe [hCouple=" + hCouple + ", mListe=" + mListe + "]";
	}
}

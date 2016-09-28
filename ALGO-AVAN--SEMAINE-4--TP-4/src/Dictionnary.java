import java.util.HashMap;
import java.util.Map;

public class Dictionnary<K1,K2> implements BidirectionnalMap<K1,K2> {

	Map<K1,K2> Dicofr;
	Map<K2,K1> Dicoan;
	
	public Dictionnary(Map<K1,K2> d1,Map<K2,K1> d2){
		Dicofr=d1;
		Dicoan=d2;
	}
	
	@Override
	public String toString() {
		return "Dictionnary ["
	    // TO STRING A DEFINIR
	     + "]";
	}

	@Override
	public K2 getFromPrimary(K1 k) {
		return Dicofr.get(k);
	}

	@Override
	public K1 getFromSecondary(K2 k) {
		return Dicoan.get(k);
	}

	@Override
	public void put(K1 k1, K2 k2) {
		Dicoan.put(k2,k1);
		Dicofr.put(k1,k2);
	}

	@Override
	public boolean isEmpty() {
		return this.isEmpty();
	}

	@Override
	public void clear() {
		Dicoan.clear();
		Dicofr.clear();
		
	}

	@Override
	public void removeFromPrimary(K1 k1) {
		Dicoan.remove(Dicofr.get(k1));
		Dicofr.remove(k1);
		
	}
	
	public static void main(String [] args){
		Map<String,String> dicofrance  = new HashMap<>();
		Map<String,String> dicoanglais = new HashMap<>();
		Dictionnary dico = new Dictionnary(dicofrance,dicoanglais);
		dico.put("chien", "dog");
		System.out.println(dico.toString());
	}
}
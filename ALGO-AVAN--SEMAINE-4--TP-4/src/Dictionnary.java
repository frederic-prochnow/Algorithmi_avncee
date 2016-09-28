
public class Dictionnary<K1,K2> implements BidirectionnalMap<K1,K2> {

	@Override
	public String toString() {
		return "Dictionnary [toString()=" + super.toString() + "]";
	}

	@Override
	public K2 getFromPrimary(K1 k) {
		return null;
	}

	@Override
	public K1 getFromSecondary(K2 k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void put(K1 k1, K2 k2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFromPrimary(K1 k1) {
		// TODO Auto-generated method stub
		
	}
}
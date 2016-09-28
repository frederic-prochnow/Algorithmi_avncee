/**
* A BidirectionnalMap associates a primary with a secondary key
* but also the secondary with the primary key.
* K1 and K2 are the types for primary and secondary key.
*/
public interface BidirectionnalMap<K1, K2> {
	
	public abstract K2 getFromPrimary(K1 k);
	
	public abstract K1 getFromSecondary(K2 k);
	
	public abstract void put(K1 k1, K2 k2);
    
	public abstract boolean isEmpty();
    
	public abstract void clear();
    
	public abstract void removeFromPrimary(K1 k1);
}
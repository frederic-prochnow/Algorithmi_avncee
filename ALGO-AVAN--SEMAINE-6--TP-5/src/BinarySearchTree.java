import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import sun.nio.cs.HistoricallyNamedCharset;

public class BinarySearchTree<K extends Comparable<K>,V> implements Map<K, V>{

	K key;
	V value;
	BinarySearchTree<K, V> left;
	BinarySearchTree<K, V> right;
	
	public BinarySearchTree(){}
	
	public void createBinarySearchTree(K key, V value){
		this.key = key;
		this.value = value;
		left = new BinarySearchTree<>();
		right = new BinarySearchTree<>();
	}
	
	
	public int size() {
		if(this.isEmpty())
			return 0;
		else
			return (left.size()+1+right.size());
	}

	
	public boolean isEmpty() {
		return this.key==null;
	}

	
	public boolean containsKey(Object key) {
		return booleanSearch(key);
	}
	
	public void add(K key,V value){
		binarySearchTreeSearch(key).createBinarySearchTree(key, value);
	}
	
	public BinarySearchTree<K, V> binarySearchTreeSearch(Object key){
		if(this.isEmpty())
			return this;
		else if(this.key.compareTo((K) key)<0)
			return binarySearchTreeSearch(left.key);
		else if(this.key.compareTo((K) key)>0)
			return binarySearchTreeSearch(right.key);
		else //if(this.key.equals(key))
			return this;
	}
	
	public boolean booleanSearch(Object key) {
		if(this.isEmpty())
			return false;
		else if(this.key.compareTo((K) key)<0)
			return left.containsKey(key);
		else if(this.key.compareTo((K) key)>0)
			return right.containsKey(key);
		else 
			return true;
	}


	public boolean containsValue(Object value) {
		ArrayList<BinarySearchTree<K, V>> bdd = new ArrayList<>();
		bdd.add(this);
		while(!bdd.isEmpty()){
			if(bdd.get(0).value.equals(value))
				return true;
			if (!bdd.get(0).left.isEmpty())
				bdd.add(bdd.get(0).left);
			if (!bdd.get(0).right.isEmpty())
				bdd.add(bdd.get(0).right);
			bdd.remove(0);
		}
		return false;
	}


	public String toString() {
		return "BinarySearchTree [key=" + key + ", value=" + value + ", left=" + left + ", right=" + right + "]";
	}

	public V get(Object key) {
		if(this.isEmpty())
			return null;
		if(this.key.equals(key))
			return this.value;
		if(this.key.compareTo((K) key)<0)
			return left.get(key);
		if(this.key.compareTo((K) key)>0)
			return right.get(key);
		return null;
	}


	public V put(K key, V value) {
		V resultat = null;
		if(this.isEmpty())
			return null;
		
		if(this.key.equals(key)){
			resultat = this.value;
			this.value = value;
			return resultat;
		} 
		if(this.key.compareTo(key)<0)
			return left.put(key, value);
		
		if(this.key.compareTo(key)>0)
			return right.put(key, value);
		
		return resultat;
	}

	public BinarySearchTree<K,V> min(){
		BinarySearchTree<K, V> courant = this;
		while(!courant.left.isEmpty()){
			courant=courant.left;
		}
		return courant;
	}
	
	public void copyBinarySearchTree(BinarySearchTree<K,V> bst){
		key = bst.key;
		value = bst.value;
		left = bst.left;
		right= bst.right;
	}
	
	public K deleteMin(){
		BinarySearchTree<K,V> bstMin = min();
		K temp = bstMin.key;
		bstMin.copyBinarySearchTree(bstMin.right);
		return temp;
	}

	public V remove(Object key) {
		BinarySearchTree<K, V> bst = binarySearchTreeSearch(key);
		if(this.left.isEmpty())
			bst.copyBinarySearchTree(bst.right);
		else if(this.right.isEmpty())
			bst.copyBinarySearchTree(bst.left);
		else{
			bst.right.deleteMin();
			return bst.right.value;
		}
		return value;
	}


	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		
	}


	public void clear() {
		// TODO Auto-generated method stub
		
	}


	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}


	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}


	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
}

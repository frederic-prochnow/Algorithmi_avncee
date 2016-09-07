
public class Counter {
	private int comp;
	private int perm;
	
	public Counter() {
		comp = 0;
		perm = 0;
	}
	
	public void incComp() { this.comp++;}
	
	public void incComp(int n){ this.comp+=n;}
	
	public void incPerm() { this.perm++;}
	
	public void incPerm(int n){ this.perm+=n;}
	
	public String toString() {
		return "Comparaison :" + this.comp + " -Permutations :" + this.perm;
	}
	
	public void reset() {
		this.comp =0;
		this.perm =0;
	}
	
}

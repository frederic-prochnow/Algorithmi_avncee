import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class ExoSet {

	public static void main(String[]args){
		Set<Integer> ens1 = new HashSet<Integer>();
		Set<Integer> ens2 = new HashSet<Integer>();
		Random alea = new Random();
		ens1.add(alea.nextInt(10));
		ens1.add(alea.nextInt(10));
		ens1.add(alea.nextInt(10));
		ens2.add(alea.nextInt(10));
		ens2.add(alea.nextInt(10));
		ens2.add(alea.nextInt(10));
		ens1.add(alea.nextInt(10));
		ens1.add(alea.nextInt(10));
		ens1.add(alea.nextInt(10));
		ens2.add(alea.nextInt(10));
		ens2.add(alea.nextInt(10));
		ens2.add(alea.nextInt(10));
		System.out.print("ens 1 = ");  afficher(ens1);
		System.out.print("ens 2 = ");  afficher(ens2);
		System.out.print("inter = ");  afficher(inter(ens1,ens2));
		System.out.print("union = ");  afficher(union(ens1,ens2));
	}
	
	public static void afficher(Set<Integer> ens){
		Iterator<Integer> it = ens.iterator();
		System.out.print("["+ens.size()+"]{");
		if(!ens.isEmpty()){
			if(it.hasNext()){
				System.out.print(it.next());
			}
			while(it.hasNext()){
				System.out.print(", "+ it.next());
			}
		}
		System.out.println("}");
	}
	public static Set<Integer> inter(Set<Integer> set1,Set<Integer> set2){
		Set<Integer> res = new HashSet<>();
		Iterator<Integer> it_set1 = set1.iterator();
		Iterator<Integer> it_set2 = set2.iterator();
		Integer a,b;
		while(it_set1.hasNext()){
			a= it_set1.next();
			it_set2 = set2.iterator();
			while(it_set2.hasNext()){
				b= it_set2.next();
				if (a==b){
					res.add(a);
				}
			}	
		}	
		return res;
	}
	
	public static Set<Integer> union(Set<Integer> set1,Set<Integer> set2){
		Set<Integer> res = new HashSet<>();
		Iterator<Integer> it_set1 = set1.iterator();
		Iterator<Integer> it_set2 = set2.iterator();
		Integer a,b;
		if(!set1.isEmpty() && !set2.isEmpty()){
			while(it_set1.hasNext()){
				res.add(it_set1.next());
			}
			while(it_set2.hasNext()){
				res.add(it_set2.next());
			}
		}
		return res;
	}
	
	public static boolean isIn(Set<Integer> set1,Set<Integer> set2) {
		return set1.size() == inter(set1,set2).size();
	}
}

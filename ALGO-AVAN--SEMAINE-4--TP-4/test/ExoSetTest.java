import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ExoSetTest {
	
	@Test
	public void testInter(){
		Set<Integer> ens1 = new HashSet<Integer>();
		Set<Integer> ens2 = new HashSet<Integer>();
		Set<Integer> res = new HashSet<Integer>();
		ens1.add(10); ens1.add(20);
		ens1.add(30); ens1.add(40);
		ens2.add(20); ens2.add(30);
		ens2.add(50); ens2.add(60);
		res.add(20);  res.add(30);
		assertEquals(res,ExoSet.inter(ens1,ens2));
	}
	
	@Test
	public void testUnion(){
		Set<Integer> ens1 = new HashSet<Integer>();
		Set<Integer> ens2 = new HashSet<Integer>();
		Set<Integer> res = new HashSet<Integer>();
		ens1.add(10); ens1.add(20);
		ens1.add(30); ens1.add(40);
		ens2.add(20); ens2.add(30);
		ens2.add(50); ens2.add(60);
		res.addAll(ens1);
		res.addAll(ens2);
		assertEquals(res,ExoSet.union(ens1,ens2));
	}
	
	@Test
	public void testIsIn(){
		Set<Integer> ens1 = new HashSet<Integer>();
		Set<Integer> ens2 = new HashSet<Integer>();
		ens1.add(10); ens1.add(20);
		ens1.add(30); ens1.add(40);
		ens2.add(20); ens2.add(30);
		ens2.add(50); ens2.add(60);
		ens2.add(10); ens2.add(40);
		assertTrue(ExoSet.isIn(ens1,ens2));
	}
}

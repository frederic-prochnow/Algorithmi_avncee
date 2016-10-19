import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTreeTest {

	BinarySearchTree<Integer,String> bst= new BinarySearchTree<>();
	BinarySearchTree<Integer,String> bst2= new BinarySearchTree<>();
	
	/*@Test
	public void testSize(){
		bst.add(01, "lol");
		bst.add(02, "lil");
		ssertEquals(bst.size(), 2);
		assertEquals(bst2.size(), 0);
	}*/
	
	@Test
	public void testIsEmpty(){
		bst.add(01, "lol");
		assertFalse(bst.isEmpty());
		assertTrue(bst2.isEmpty());
	}
	
	@Test
	public void testContainsKey(){
		bst.add(01, "lol");
		assertTrue(bst.containsKey(01));
		assertFalse(bst.containsKey(02));
		assertFalse(bst2.containsKey(01));
	}
	
	@Test
	public void testBinarySearchTreeSearch(){
		bst.add(01, "lol");
		assertEquals(bst.binarySearchTreeSearch(01), bst);
		assertEquals(bst2.binarySearchTreeSearch(01), bst2);
		
	}
	
	@Test
	public void testConstainsValue(){
		bst.add(01, "lol");
		bst.add(02, "lil");
		assertTrue(bst.containsValue("lol"));
		assertFalse(bst.containsValue("lili"));
	}
}

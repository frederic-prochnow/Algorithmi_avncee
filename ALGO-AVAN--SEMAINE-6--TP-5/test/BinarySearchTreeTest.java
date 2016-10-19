import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTreeTest {

	BinarySearchTree<String,Integer> bst= new BinarySearchTree<>("lol",01);
	BinarySearchTree<String,Integer> bst2= new BinarySearchTree<>();
	
	@Test
	public void testSize(){
		assertEquals(bst.size(), 1);
		assertEquals(bst2.size(), 0);
	}
	
	@Test
	public void testIsEmpty(){
		assertFalse(bst.isEmpty());
		assertTrue(bst2.isEmpty());
	}
	
	@Test
	public void testContainsKey(){
		assertTrue(bst.containsKey("lol"));
		assertFalse(bst.containsKey("yolo"));
		assertFalse(bst2.containsKey("lol"));
	}
	
	@Test
	public void testBinarySearchTreeSearch(){
		assertEquals(bst.binarySearchTreeSearch("lol"), bst);
		assertEquals(bst.binarySearchTreeSearch("yolo"), null);
		assertEquals(bst2.binarySearchTreeSearch("lol"), null);
	}
}

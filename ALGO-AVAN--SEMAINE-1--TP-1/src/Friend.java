import java.util.Arrays;

public class Friend<Comparable>{

	String name;
	int age;
	
	public Friend(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public static void main(String args){
		Friend f1 = new Friend("f1",10);
		Friend f2 = new Friend("f2",11);
		Friend f3 = new Friend("f3",15);
		Friend f4 = new Friend("f4",9);
		//f1.compareTo(f2);
		//Arrays.sort(f1);
		
	}
}

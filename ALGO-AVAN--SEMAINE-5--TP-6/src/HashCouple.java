import java.util.Map;

public class HashCouple<String,Integer> implements Map.Entry<String,Integer>{

	String cle;
	Integer information;
	
	public HashCouple(String cle,Integer information) {
		this.cle = cle;
		this.information = information;
	}
	/*
	public HashCouple(){
		this.cle = null;
		this.information = null;
	}
	*/
	public int hashCode() {
		return super.hashCode();
	}
	
	public  String getKey() {
		return this.cle;
	}

	public Integer getValue() {
		return this.information;
	}

	public Integer setValue(Integer value) {
		Integer i = this.information;
		this.information = value;
		return i;
	}


	
}

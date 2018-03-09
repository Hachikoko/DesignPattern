package ArraysSortWithTemplateMethodPattern;

public class Duck implements Comparable<Duck>{
	String name;
	int weight;
	
	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	public String toString() {
		return name + ":"+weight;
	}

	@Override
	public int compareTo(Duck arg0) {
		// TODO Auto-generated method stub
		if (this.weight>arg0.weight) {
			return 1;
		}else if (this.weight == arg0.weight) {
			return 0;
		}else {
			return -1;
		}
	}
}

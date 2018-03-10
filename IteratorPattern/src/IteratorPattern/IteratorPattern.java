package IteratorPattern;

public class IteratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuByArrayList allList = new MenuByArrayList("allList", "allList!!");
		MenuByArrayList a = new MenuByArrayList("a", "a!!");
		MenuByArray b = new MenuByArray("b", "b!!");
		MenuByArrayList c = new MenuByArrayList("c", "c!!");
		a.add(new MenuItem("a1",1,"a1!!",true));
		a.add(new MenuItem("a2",2,"a2!!",false));
		a.add(new MenuItem("a3",3,"a3!!",true));
		b.add(new MenuItem("b1",1,"b1!!",false));
		b.add(new MenuItem("b2",2,"b2!!",true));
		b.add(new MenuItem("b3",3,"b3!!",false));
		c.add(new MenuItem("c1",1,"c1!!",false));
		c.add(new MenuItem("c2",2,"c2!!",true));
		c.add(new MenuItem("c3",3,"c3!!",false));
		allList.add(a);
		allList.add(b);
		a.add(c);			
		allList.print();
		
		CompositeIterator iterator = new CompositeIterator(allList);
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			if (menuComponent instanceof MenuItem) {
				menuComponent.print();
			}
		}
	}

}

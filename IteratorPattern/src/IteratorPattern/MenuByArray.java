package IteratorPattern;

public class MenuByArray extends MenuComponent{
	private static final int ITEMS_MAX = 7;
	private MenuComponent[] list;
	private String name;
	private String description;
	int offNumber = 0;

	public MenuByArray(String name,String description) {
		super();
		this.list = new MenuComponent[ITEMS_MAX];
		this.name = name;
		this.description = description;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		while ((offNumber<ITEMS_MAX)&&(list[offNumber]!=null)) {
			offNumber++;
		}
		
		if (offNumber < ITEMS_MAX) {
			list[offNumber] = menuComponent;
			offNumber = 0;
		}else {
			System.out.println("No position to add menuItem!!");
			offNumber = 0;
			
		}
		
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ITEMS_MAX; i++) {
			if (list[i] == menuComponent) {
				list[i] = null;
			}
		}
	}

	@Override
	public MenuComponent getChild(int index) {
		// TODO Auto-generated method stub
		if (index < ITEMS_MAX&&list[index]!=null) {
			return list[index];
		}else {
			return null;
		}
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(name+"---"+description+"---");
		
		ArrayIterator arrayIterator = createIterator();
		while (arrayIterator.hasNext()) {
			MenuComponent object = arrayIterator.next();
			object.print();			
		}
	}
	
	public ArrayIterator createIterator() {			
		return new ArrayIterator(list);		
	}
	
	
	
}

package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuByArrayList extends MenuComponent{ 
	private ArrayList<MenuComponent> list;
	private String name;
	private String description;

	public MenuByArrayList(String name,String description) {
		super();
		this.list = new ArrayList<MenuComponent>();
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
		list.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		list.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int index) {
		// TODO Auto-generated method stub
		return list.get(index);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(name+"---"+description+"---");
		
		Iterator<MenuComponent> iterator = list.iterator();
		while (iterator.hasNext()) {
			MenuComponent object = iterator.next();
			object.print();			
		}
	}
	
	public Iterator<MenuComponent> createIterator() {			
		return list.iterator();		
	}
	
	
}

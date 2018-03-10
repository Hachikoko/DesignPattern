package IteratorPattern;

import java.util.Iterator;

public class ArrayIterator implements Iterator<MenuComponent> {

	MenuComponent[] list;
	int position = 0;
	
	
	public ArrayIterator(MenuComponent[] list) {
		super();
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		while (position < list.length) {
			if (list[position] != null) {
				return true;
			}
			position++;
		}
		return false;
	}

	@Override
	public MenuComponent next() {
		// TODO Auto-generated method stub
		MenuComponent temp = list[position];
		position++;
		return temp;
	}

}

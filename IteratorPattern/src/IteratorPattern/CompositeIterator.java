package IteratorPattern;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
	MenuComponent list;
	Stack<Iterator<MenuComponent>> iteratorStack = new Stack<Iterator<MenuComponent>>();
	
	
	
	public CompositeIterator(MenuComponent list) {
		super();
		this.list = list;
		iteratorStack.push(list.createIterator());
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (iteratorStack.isEmpty()) {
			return false;
		}		
		Iterator<MenuComponent> iterator = iteratorStack.peek();
		if (iterator.hasNext()) {
			return true;
		}else {
			iteratorStack.pop();
			return hasNext();
		}
	}

	@Override
	public MenuComponent next() {
		// TODO Auto-generated method stub
//		if (hasNext()) {
			Iterator<MenuComponent> iterator = iteratorStack.peek();
			MenuComponent menuComponent = iterator.next();
			if (menuComponent instanceof MenuByArray||menuComponent instanceof MenuByArrayList) {
				iteratorStack.push(menuComponent.createIterator());
			}
			return menuComponent;
//		}else {
//			return null;
//		}
		
	}

}

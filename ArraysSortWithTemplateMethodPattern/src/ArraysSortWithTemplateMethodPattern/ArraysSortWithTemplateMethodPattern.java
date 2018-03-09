package ArraysSortWithTemplateMethodPattern;

import java.util.Arrays;

import ArraysSortWithTemplateMethodPattern.Duck;

public class ArraysSortWithTemplateMethodPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck[] ducks = {new Duck("a", 3),
						new Duck("b", 2),
						new Duck("c", 1)};
		
		Display(ducks);
		Arrays.sort(ducks);	//没有实现Duck的comparable接口时，出现异常，
		Display(ducks);		//问题是sort如何在不知道是否有compareTO方法的情况下调用compareTO方法，并且不出现编译错误；
	}
	
	public static void Display(Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}

}

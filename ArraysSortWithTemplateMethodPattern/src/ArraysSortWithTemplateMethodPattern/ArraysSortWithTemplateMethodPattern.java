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
		Arrays.sort(ducks);	//û��ʵ��Duck��comparable�ӿ�ʱ�������쳣��
		Display(ducks);		//������sort����ڲ�֪���Ƿ���compareTO����������µ���compareTO���������Ҳ����ֱ������
	}
	
	public static void Display(Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}

}

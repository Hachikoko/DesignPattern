package AdapterPattern;

public class AdapterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildTurkey turkey = new WildTurkey();	//ԭ���ܶ�
		Duck turkeyAdapter = new TurkeyAdapter(turkey);//������
		turkeyAdapter.fly();//��������˷���
		turkeyAdapter.quack();
	}

}

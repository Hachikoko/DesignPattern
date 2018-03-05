package AdapterPattern;

public class AdapterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildTurkey turkey = new WildTurkey();	//原功能端
		Duck turkeyAdapter = new TurkeyAdapter(turkey);//适配器
		turkeyAdapter.fly();//调用适配端方法
		turkeyAdapter.quack();
	}

}

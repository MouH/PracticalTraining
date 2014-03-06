package day2;
//加载类：初始化静态变量，一次
//实例化:成员变量,构造函数
//        先父类，再子类
public class Demo2 {
	int i = 10;
	{//初始化块
		System.out.println(i);
		i = 11;
	}
	static String s = "java";
	static {//静态变量初始化块
		System.out.println(s);
	}
	
	public Demo2(int i) {
		System.out.println(this.i);
		this.i = i;
	}
	public static void main(String[] args) {
		new SubDemo2();
	}
}

class SubDemo2 extends Demo2 {
	int i = 10;
	{//初始化块
		System.out.println(i);
		i = 11;
	}
	
	
	static String s = "php";
	static {//静态变量初始化块
		System.out.println(s);
	}
	public SubDemo2() {
		//子类的第一条语句必须是super语句，调用父类的构造函数
		//super();
		super(10);
		System.out.println("12");
	}
}

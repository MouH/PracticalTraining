package day2;

public class Circle {
	private static double PI;	//静态变量,类变量
	//定义成员变量
	private int x;	//实例变量
	private int y;	
	private int r;
	//构造函数:与类名相同,没有返回类型
	//没有构造函数,系统会生成一个默认的构造函数
	public Circle(int x,int y,int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public Circle() {
		this(0,0,1);
	}
	//定义方法
	public double area() {
		return Math.PI * r * r;
	}
	//静态方法
	public  static void f() {
	}
	@Override 
	public String toString() {
		return "园心:("+x+","+y+"),半径="+r;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + r;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (r != other.r)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	public static void main(String[] args) {
		//创建对象
		Circle c = new Circle(1,1,10);
		//调用对象上的方法
		//System.out.println(c.area());
		
		System.out.println(c);
		
		Circle c1 = new Circle(1,1,10);
		Circle c2 = new Circle(1,1,10);
		System.out.println(c1==c2);//false
		//object上equals的默认实现:==
		System.out.println(c1.equals(c2));
		
		
	
	}

}

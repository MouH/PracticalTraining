package day2;

public class Animal extends Object {
	int weight;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Animal(int w) {
		this.weight = w;
	}
	public Animal() {}
	public static void main(String[] args) {
//		Dog d = new Dog();
//		d.setWeight(20);
//		System.out.println(d.getWeight()+","+d.getName());
		//d：编译期类型Dog
		Dog d = new SmallDog();
		//运行期类型SmallDog:实际类型的方法
		d.yaff();
	}
}

class Dog extends Animal {
	//增加自已的特性
	String name = "小白";
	public String getName() {
		return name;
	}
	public void yaff() {
		System.out.println("wang,wang,wang,.....");
	}
}

class SmallDog extends Dog {
	@Override
	public void yaff() {
		System.out.println("heng,heng,heng,....");
	}
}

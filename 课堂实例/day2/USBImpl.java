package day2;

public class USBImpl implements USB,I {

	@Override
	public void read() {
		System.out.println("read");
		
	}

	@Override
	public void write() {
		System.out.println("write");
		
	}

	public static void main(String[] args) {
		//接口用作类型
		I usb = new USBImpl();
		//usb.read();
	}
	
	
}

interface  I {
	
}

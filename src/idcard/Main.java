package idcard;

import framework.*;
public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("홍길동");
		card1.use();
	}
}

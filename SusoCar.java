package Exam03;

public class SusoCar extends Car {
	@Override
	public void run() {
		System.out.println("수소로 자동차를 달리다.");
	}
	@Override
	public void charge() {
		System.out.println("수소연료를 충전하다.");
	}
}

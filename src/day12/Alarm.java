package day12;

public class Alarm {
	
	// 時間介面
	interface Time {
		void ring();
	}
	/*
	abstract class Time {
		abstract void ring();
	}
	
	class Time {
		void ring() { }
	}
	
	*/
	
	
	void setAlarm(int hours) {
		Time time = new Time() {
			
			@Override
			public void ring() {
				System.out.printf("過了%d小時!鬧鐘響了!\n", hours);
			}
			
		};
		
		time.ring();
	}
	
	// 測試
	public static void main(String[] args) {
		Alarm alarm = new Alarm();
		alarm.setAlarm(3);
	}
}

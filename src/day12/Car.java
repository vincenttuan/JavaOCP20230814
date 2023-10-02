package day12;

public class Car {
	// 靜態內部類別: 表示汽車的引擎
	static class Engine {
		void start() {
			System.out.println("引擎啟動 ");
		}
	}
	
	// 一般內部類別: 表示汽車音響系統
	class AudioSystem {
		void playMusic() {
			System.out.println("播放音樂...");
		}
	}
	
	private Engine engine = new Engine();
	private AudioSystem audioSystem = new AudioSystem();
	
	public void startCar() {
		engine.start();
		// 方法內部類別: 表示汽車啟動時的安全檢查
		class SafetyCheck {
			void doCheck() {
				System.out.println("執行安全檢查...");
			}
		}
		SafetyCheck check = new SafetyCheck();
		check.doCheck();
	}
	
	public void playCarMusic() {
		audioSystem.playMusic();
	}
	
	interface AirConditioner {
		void setTemperature();
	}
	
	public void activateAirConditioner(int temperature) {
		// 匿名內部類別: 表示汽車內的空調
		AirConditioner ac = new AirConditioner() {
			@Override
			public void setTemperature() {
				System.out.printf("設定溫度為 %d 度\n", temperature);
			}
		};
		ac.setTemperature();
	}
	
	 
}












package day13;

import java.util.Arrays;
import java.util.function.Supplier;

/*
 API:
 @FunctionalInterface
 public interface Supplier<T> {
 	T get();
 }
 不接收任何參數, 但是他會回傳一個結果<T>
 */
public class SupplierDemo {
	public static void main(String[] args) {
		// 你按下飲水機, 飲水機(Supplier)會給你一杯清水
		Supplier<String> waterDispenser = () -> "一杯清水";
		String water = waterDispenser.get();
		System.out.println(water);
		
		// 你打開音樂盒, 音樂盒(Supplier)會播放一首歌
		Supplier<String> musicBox = () -> "播放一首歌: 平安夜";
		String song = musicBox.get();
		System.out.println(song);
		
		// 得到一個名字列表 names
		Supplier<String[]> namesGenerator = () -> new String[] {
				"john", "mary", "bob", "vincent", "anita", "jo"
		};
		String[] names = namesGenerator.get();
		System.out.println(Arrays.toString(names));
		
		// 得到一個分數集合 scores
		Supplier<Integer[]> scoresGenerator = () -> new Integer[] {
				80, 35, 95, 100, 40, 75, 65 
		};
		Integer[] scores = scoresGenerator.get();
		System.out.println(Arrays.toString(scores));
	}
}

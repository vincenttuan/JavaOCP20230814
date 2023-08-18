package day02;

import static day02.ArrayDemo4.getAverage;
import static day02.ArrayDemo4.getSD;
import static day02.ArrayDemo4.getCV;

/*
 * 某公司有18位員工，
 * 其中10位在去年投資股票一年的獲利率如下(單位：%)：
 * 7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5
 * 另外8位員工投資買公債一年內獲利率如下(單位：%)
 * 6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2
 * 請問哪一種投資(股票或公債)的較穩健 ?
 * */
public class ArrayDemo5 {

	public static void main(String[] args) {
		double[] stocks = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
        double[] bonds  = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
        
        double stockAvg = getAverage(stocks);       // 股票獲利平均
        double bondAvg  = getAverage(bonds);        // 債券獲利平均
        double stockSD  = getSD(stocks, stockAvg);  // 股票標準差
        double bondSD   = getSD(bonds, bondAvg);    // 債券標準差
        double stockCV  = getCV(stockSD, stockAvg); // 股票變異係數
        double bondCV   = getCV(bondSD, bondAvg);   // 債券變異係數
        
        System.out.printf("股票變異係數: %.3f\n", stockCV);
        System.out.printf("債券變異係數: %.3f\n", bondCV);
        if(stockCV < bondCV) {
        	System.out.println("股票投資較穩健");
        } else {
        	System.out.println("債券投資較穩健");
        }
	}
	
	
}

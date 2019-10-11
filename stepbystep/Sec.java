package stepbystep;

import java.util.Scanner;

// http://59.23.150.58/30stair/sec/sec.php?pname=sec
public class Sec {

	public static void main(String[] args) {
		int second = 0;
		Scanner sc = new Scanner(System.in);
		second = sc.nextInt();
		int sec = second % 60;
		int min = (second/60) % 60;
		int hour = ((second/60)/60) / 60; 
		int day = ((second/60)/60) / 24;
	
		System.out.println("day: " + day + " hour: " + hour + " min: " + min + " sec: " + sec);
	}

}

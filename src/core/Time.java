package core;

public class Time {
	private int h;
	private int m;
	
	public Time(int hour, int minute) {
		h = hour;
		m = minute;
	}
	
	public void setTime(int hour, int minute) {
		h = hour;
		m = minute;
	}
	
	public int[] getTime() {
		int[] tmp = {h, m};
		return tmp;
	}
	
	public String toString() {
		return h + ":" + m;
	}
}

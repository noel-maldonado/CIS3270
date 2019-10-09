package CH10;

public class Time {

	public int hour, minute, second;

	public Time() {
		int[] currentTime = setTime(System.currentTimeMillis());
		this.hour = currentTime[0];
		this.minute = currentTime[1];
		this.second = currentTime[2];

	}

	public Time(long time) {
		int[] currentTime = setTime(time);
		this.hour = currentTime[0];
		this.minute = currentTime[1];
		this.second = currentTime[2];
	}

	public Time(int h, int m, int s) {
		this.hour = h;
		this.minute = m;
		this.second = s;
	}

	public int[] setTime(long elapseTime) {
		int[] time = new int[3];
		long milli = elapseTime;
		long totalSeconds = milli / 1000;
		long currentSeconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;
		time[0] = (int) currentHours;
		time[1] = (int) currentMinutes;
		time[2] = (int) currentSeconds;
		return time;
	}

	public static void main(String[] args) {
		Time one = new Time();
		Time two = new Time(555550000);
		Time three = new Time(5, 23, 55);
		System.out.println("The time for one is " + one.hour + ":" + one.minute + ":" + one.second);
		System.out.println("The time for two is " + two.hour + ":" + two.minute + ":" + two.second);
		System.out.println("The time for three is " + three.hour + ":" + three.minute + ":" + three.second);

	}

}
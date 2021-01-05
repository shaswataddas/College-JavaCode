import java.util.*;
class Time_main
{
	Time_main(int hour,int min,int second)
	{
		int add_min=0,add_hour=0;
		if(second>59)
		{
			add_min = second/60;
			second = second%60;
		}
		min = min + add_min;
		if (min>59) {
			add_hour = min/60;
			min = min%60;
		}
		hour = hour + add_hour;
		System.out.println("The Time is: "+hour+":"+min+":"+second);
	}

	public static void main(String[] args) {
		int h,m,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the Hour: ");
		h = sc.nextInt();
		System.out.println("Give the Minute: ");
		m = sc.nextInt();
		System.out.println("Give the Second: ");
		s = sc.nextInt();
		Time_main tm = new Time_main(h,m,s);
	}
}
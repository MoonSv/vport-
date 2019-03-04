package cn.vport.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class Demo {
	@Test
	public void test1() throws ParseException {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = sdFormat.parse("1989-08-08");
		int age = 0;
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());// 当前时间

		Calendar birth = Calendar.getInstance();
		birth.setTime(birthday);

		if (birth.after(now)) {// 如果传入的时间，在当前时间的后面，返回0岁
			age = 0;
		} else {
			age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
			if (now.get(Calendar.DAY_OF_YEAR) > birth.get(Calendar.DAY_OF_YEAR)) {
				age += 1;
			}
		}
		System.out.println(age);
	}
}

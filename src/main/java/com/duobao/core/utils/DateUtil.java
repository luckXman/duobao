package com.duobao.core.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class DateUtil {

	public final static String[] week = { "", "周日", "周一", "周二", "周三", "周四", "周五", "周六" };

	public final static String[] week2 = { "", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };

	public static Date StringToDate(String dateString, String format) {
		Date date;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			date = sdf.parse(dateString);
		} catch (Exception e) {
			date = null;

		}

		return date;
	}

	public static String StringToDate_YYYY_MM_DD(Date date) {
		String dates = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			dates = sdf.format(date);
		} catch (Exception e) {
			date = null;

		}

		return dates;

	}

	public static String StringToDate_MM_DD(Date date) {
		String dates = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
			dates = sdf.format(date);
		} catch (Exception e) {
			date = null;

		}

		return dates;

	}

	public static String StringToDate_MM_DD_HH_MM(Date date) {
		String dates = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm");
			dates = sdf.format(date);
		} catch (Exception e) {
			date = null;

		}

		return dates;
	}

	public static Date StringToDate(String dateString) {
		Date date;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = sdf.parse(dateString);
		} catch (Exception e) {
			date = null;

		}

		return date;
	}

	public static Date StringtoDateHHMM(String dateString) {
		Date date;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
			date = sdf.parse(dateString);
		} catch (Exception e) {
			date = null;

		}

		return date;
	}

	public static Date StringToDatetpy(String dateString) {
		Date date;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			date = sdf.parse(dateString);
			System.out.println(date);
		} catch (Exception e) {
			date = null;

		}

		return date;
	}

	public static Date StringToDate_YYYY_MM_DD_HH_MM(String dateString) {
		Date date;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			date = sdf.parse(dateString);
		} catch (Exception e) {
			date = null;

		}

		return date;
	}

	public static Date StringToDate_YYYYMMDDHHMM(String dateString) {
		Date date;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			date = sdf.parse(dateString);
		} catch (Exception e) {
			date = null;

		}

		return date;
	}

	public static Date StringToDate_YY_MM_DD_HH_MM(String dateString) {
		Date date;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm");
			date = sdf.parse(dateString);
		} catch (Exception e) {
			date = null;

		}

		return date;
	}

	public static Date StringToDate_YYYY_MM_DD_HH_MM_SS(String dateString) {
		Date date;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date = sdf.parse(dateString);
		} catch (Exception e) {
			date = null;

		}

		return date;
	}

	public static Date stringToDate(String dateString, String format) {
		Date date;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			date = sdf.parse(dateString);
		} catch (Exception e) {
			date = null;

		}
		return date;
	}

	public static String dateToString(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	public static Date StringToDateShort(String dateString) {
		Date date;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			date = sdf.parse(dateString);
		} catch (Exception e) {
			date = null;

		}

		return date;
	}

	public static String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

	public static String dateToStringYYYY_MM_DD_HH_MM(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		return sdf.format(date);
	}

	public static String getByTimeMillis(long timeMillis) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(timeMillis);
		return dateToString(c.getTime());

	}

	public static long getTimeMillis(String dateTime) {
		if (dateTime == null || dateTime.equals("")) {
			return 0l;
		}
		Date date = DateUtil.StringToDate(dateTime);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c.getTimeInMillis();
	}

	public static String getNowDateYYYYMMDD() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);
	}

	public static String getNowDate(String format) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	public static String getNowDateYYMMDD() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		return sdf.format(date);
	}

	public static String getNowDateYYYYMM() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		return sdf.format(date);
	}

	public static String getNowDateYYYY_MM_DD() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}

	public static String getNowDateYYYY_MM_DD_HH_MM() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(date);
	}

	public static String getNowDateYYYY_MM_DD_HH_MM_SS() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

	public static String getNowDateYYYYMMDDHHMMSS() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(date);
	}

	public static String getNowDateYYYYMMDDHHMMSSSS() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		return sdf.format(date);
	}

	public static Integer handleIntTime(Date date, String weekDayName) {
		for (int i = 0; i <= 3; i++) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DAY_OF_MONTH, -i);
			int day = cal.get(Calendar.DAY_OF_WEEK);
			String tempWeek = week[day];
			if (tempWeek.equals(weekDayName))
				return Integer.valueOf(dateToString(cal.getTime(), "yyyyMMdd"));
		}
		return null;
	}

	public static String getWeekStr2(Date date, String[] week) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return week[cal.get(Calendar.DAY_OF_WEEK)];
	}

	public static String getWeekStr(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return week[cal.get(Calendar.DAY_OF_WEEK)];
	}

	public static int getWeekInt(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.DAY_OF_WEEK);
	}

	/**
	 * 补充年份 排除1月份获取同年12月份时间&12月份获取同年1月份时间
	 * 
	 * @param dateStr
	 * @param date
	 *            参考时间
	 * @return
	 */
	public static Date strToDateDafueYear(String dateStr, Date date) {
		Date nowDate = new Date();
		String nowYear = DateUtil.dateToString(nowDate, "yyyy");
		Date matchDate = DateUtil.StringToDate(nowYear + "-" + dateStr, "yyyy-MM-dd HH:mm");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(matchDate);
		Calendar now = Calendar.getInstance();
		// 有参考值使用参考值的年份
		if (date != null) {
			now.setTime(date);
			calendar.set(Calendar.YEAR, now.get(Calendar.YEAR));
		} else {
			// 排除1月份获取同年12月份时间&12月份获取同年1月份时间
			if (calendar.getTimeInMillis() < now.getTimeInMillis() && calendar.get(Calendar.MONTH) == 0
					&& now.get(Calendar.MONTH) == 11) {
				calendar.set(Calendar.YEAR, now.get(Calendar.YEAR) + 1);
			} else if (calendar.getTimeInMillis() > now.getTimeInMillis() && calendar.get(Calendar.MONTH) == 11
					&& now.get(Calendar.MONTH) == 0) {
				calendar.set(Calendar.YEAR, now.get(Calendar.YEAR) - 1);
			}
		}
		return calendar.getTime();
	}

	public static Date strToDateDafueYear(String dateStr) {
		return strToDateDafueYear(dateStr, null);
	}

	public static Date getDateByOffsetDay(Date date, int offset) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_YEAR, offset);
		return cal.getTime();
	}

	public static Date getDateByOffsetTime(Date date, int offset) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MINUTE, offset);
		return cal.getTime();
	}

	public static boolean isDateBefore(String date2, Date date1) {
		try {
			DateFormat df = DateFormat.getDateTimeInstance();
			return date1.before(df.parse(date2));
		} catch (ParseException e) {
			System.out.print(e.getMessage());
			return false;
		}
	}

	public static boolean isIndexDCDateBefore(Date date) {
		try {
			Calendar c = Calendar.getInstance();
			GregorianCalendar ca = new GregorianCalendar();

			if (ca.get(GregorianCalendar.AM_PM) == 1)// 判断上下午时间
				c.set(Calendar.HOUR, -2);
			else
				c.set(Calendar.HOUR, +10);

			c.set(Calendar.SECOND, 0);
			c.set(Calendar.MINUTE, 0);

			Date afterTime = c.getTime();// 当天10时后
			return afterTime.before(date);
		} catch (Exception e) {
			System.out.print(e.getMessage());
			return false;
		}
	}

	public static boolean isIndexDCDateAfter(Date date) {
		try {
			Calendar c = Calendar.getInstance();
			GregorianCalendar ca = new GregorianCalendar();

			if (ca.get(GregorianCalendar.AM_PM) == 1)// 判断上下午时间
				c.set(Calendar.HOUR, +22);
			else
				c.set(Calendar.HOUR, +34);

			c.set(Calendar.SECOND, 0);
			c.set(Calendar.MINUTE, 0);

			Date beforeTime = c.getTime();// 明天10时前
			return beforeTime.after(date);
		} catch (Exception e) {
			System.out.print(e.getMessage());
			return false;
		}

	}

	public static Date GetDCMatchEndTime(Date matchTime, int aheadMilli) {
		if (matchTime == null)
			return null;
		Calendar matchCal = Calendar.getInstance();
		matchCal.setTime(matchTime);

		Calendar startDate = (Calendar) matchCal.clone();
		startDate.set(Calendar.HOUR_OF_DAY, 6);
		startDate.set(Calendar.MINUTE, 0);
		startDate.set(Calendar.SECOND, 0);

		Calendar endDate = (Calendar) matchCal.clone();
		endDate.set(Calendar.HOUR_OF_DAY, 9);
		endDate.set(Calendar.MINUTE, 31);
		endDate.set(Calendar.SECOND, 0);

		// 比较开赛时间.如果在 6:00-9:31 之间的比赛. 则提前到6:00 - aheadMilli 截止
		if (matchCal.after(startDate) && matchCal.before(endDate)) {
			startDate.add(Calendar.MILLISECOND, -aheadMilli);
			return startDate.getTime();
		} else {
			matchCal.add(Calendar.MILLISECOND, -aheadMilli);
			return matchCal.getTime();
		}

	}

	/**
	 * 获取距离现在的时间
	 */
	public static String getMinutes(Date times) {
		long time = new Date().getTime() - times.getTime();// time 单位是 毫秒
		String res = null;
		// 转化成天数
		// 先判断是不是小于 60 * 60 * 1000 也就是 小于1小时，那么显示 ： **分钟前
		if (time < 60 * 60 * 1000) {
			res = (time / 1000 / 60) + "分钟前";
		}
		// 如果大于等于1小时 小于等于一天，那么显示 ： **小时前
		else if (time >= 60 * 60 * 1000 && time < 24 * 60 * 60 * 1000) {
			res = (time / 1000 / 60 / 60) + "小时前";
		}
		// 如果大于等于1小时 小于等于一天，那么显示 ： **小时前
		else if (time >= 24 * 60 * 60 * 1000) {
			res = (time / 1000 / 60 / 60 / 24) + "天前";
		}
		// 如果时间不明确或者发帖不足一分钟 ，则不显示
		else {
			res = "";
		}

		return res;
	}

	/**
	 * 取得系统当前时间前n个月的相对应的一天
	 * 
	 * @param n
	 *            int
	 * @return String yyyy-mm-dd
	 */
	public static String getNMonthBeforeCurrentDay(int n) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, -n);
		return dateToString(c.getTime(), "yyyy-MM-dd");

	}

	public static List<String> getASCDatesBetween(String startDateTxt, String endDateTxt, String format) {
		List<String> dates = null;
		dates = new ArrayList<String>();
		Date startDate = StringToDate(startDateTxt, format);
		Date endDate = StringToDate(endDateTxt, format);
		Calendar calendarTemp = Calendar.getInstance();
		calendarTemp.setTime(startDate);
		while (!calendarTemp.getTime().equals(endDate)) {
			dates.add(dateToString(calendarTemp.getTime(), format));
			calendarTemp.add(Calendar.DAY_OF_YEAR, 1);
		}
		dates.add(endDateTxt);
		return dates;
	}

	public static List<String> getDESCDatesBetween(String startDateTxt, String endDateTxt, String format) {
		List<String> dates = null;
		try {
			dates = new ArrayList<String>();
			Date startDate = new SimpleDateFormat(format).parse(startDateTxt);
			Date endDate = new SimpleDateFormat(format).parse(endDateTxt);
			Calendar calendarTemp = Calendar.getInstance();
			calendarTemp.setTime(endDate);

			while (!calendarTemp.getTime().equals(startDate)) {
				dates.add(dateToString(calendarTemp.getTime(), format));
				calendarTemp.add(Calendar.DAY_OF_YEAR, -1);
			}
			dates.add(startDateTxt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dates;
	}

	public static List<String> getDESCDatesBetween(String startDateTxt, String endDateTxt, String format,
			Date minDate) {
		List<String> dates = null;
		try {
			dates = new ArrayList<String>();
			Date startDate = new SimpleDateFormat(format).parse(startDateTxt);
			Date endDate = new SimpleDateFormat(format).parse(endDateTxt);
			Calendar calendarTemp = Calendar.getInstance();
			calendarTemp.setTime(endDate);

			while (!calendarTemp.getTime().equals(startDate)) {
				if (minDate != null && calendarTemp.getTime().before(minDate)) {
					return dates;
				}
				dates.add(dateToString(calendarTemp.getTime(), format));
				calendarTemp.add(Calendar.DAY_OF_YEAR, -1);
			}
			dates.add(startDateTxt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dates;
	}

	/******* 得到昨天日期 *******/
	public static String getYesterDay() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		return new SimpleDateFormat("yyyyMMdd").format(cal.getTime());
	}

	/**
	 * <p>
	 * 得到昨天日期
	 * </p>
	 * 
	 * @param pattern
	 *            String
	 * @return String
	 */
	public static String getYesterDay(String pattern) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		return new SimpleDateFormat(pattern).format(cal.getTime());
	}

	/**
	 * 获取两个日期之间间隔天数
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static String getTwoDay(Date startDate, Date endDate) {
		long day = 0;
		try {
			day = (endDate.getTime() - startDate.getTime()) / (24 * 60 * 60 * 1000);
		} catch (Exception e) {
			return "";
		}
		return day + "";
	}

	/**
	 * 获取两个日期之间间隔秒数
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static Long getTwoTime(Date startDate, Date endDate) {
		long ss = 0;
		try {
			ss = (endDate.getTime() - startDate.getTime()) / 1000;
		} catch (Exception e) {
			return 0L;
		}
		return ss;

	}

	/**
	 * 判断是否在两个日期之间
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static boolean isCompareDate(Date startDate, Date endDate) {
		Date today = new Date();
		if (startDate.before(today) && endDate.after(today)) {
			return true;
		}
		return false;
	}

	/**
	 * <p>
	 * 获取当天开始时间
	 * </p>
	 * 
	 * @return Date
	 */
	public static Date getStartDateOnCurrDay() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		return cal.getTime();
	}

	/**
	 * <p>
	 * 获取当天结束时间
	 * </p>
	 * 
	 * @return Date
	 */
	public static Date getEndDateOnCurrDay() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		return cal.getTime();
	}

	/**
	 * <p>
	 * 获取本周开始时间
	 * </p>
	 * 
	 * @return Date
	 */
	public static Date getStartDateOnCurrWeek() {
		Calendar cal = Calendar.getInstance();
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		return cal.getTime();
	}

	/**
	 * <p>
	 * 获取本周结束时间
	 * </p>
	 * 
	 * @return Date
	 */
	public static Date getEndDateOnCurrWeek() {
		Calendar cal = Calendar.getInstance();
		cal.setFirstDayOfWeek(Calendar.MONDAY);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		return cal.getTime();
	}

	/**
	 * <p>
	 * 获取本月开始时间
	 * </p>
	 * 
	 * @return Date
	 */
	public static Date getStartDateOnCurrMonth() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		return cal.getTime();
	}

	/**
	 * <p>
	 * 获取本月结束时间
	 * </p>
	 * 
	 * @return Date
	 */
	public static Date getEndDateOnCurrMonth() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.DAY_OF_MONTH, -1);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		return cal.getTime();
	}

	public static boolean isSameDate(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		boolean isSameYear = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
		boolean isSameMonth = isSameYear && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
		boolean isSameDate = isSameMonth && cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);

		return isSameDate;
	}

	/**
	 * 返回当前是星期几（国内星期：1，2，3，4，5，6，7)
	 * 
	 * @return
	 */
	public static int getNowDayInWeekdays() {
		Calendar now = Calendar.getInstance();
		// 一周第一天是否为星期天
		boolean isFirstSunday = (now.getFirstDayOfWeek() == Calendar.SUNDAY);
		int weekDay = now.get(Calendar.DAY_OF_WEEK);
		// 若一周第一天为星期天，则-1
		if (isFirstSunday) {
			weekDay = weekDay - 1;
			if (weekDay == 0) {
				weekDay = 7;
			}
		}
		return weekDay;
	}

}

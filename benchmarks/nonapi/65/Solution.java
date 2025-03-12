	public static int getDayOfWeek(Date date, int week) {//Calendar.DAY_OF_WEEK == week
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(week) - 1;
	}
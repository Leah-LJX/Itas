	public static boolean test0() throws Throwable{
		java.util.Date date1 = new java.util.Date("2020/11/12");
		int week = java.util.Calendar.DAY_OF_WEEK;
		if(getDayOfWeek(date1, week) == 4)
			return true;
		else
			return false;
	}

	public static boolean test1() throws Throwable{
		java.util.Date date2 = new java.util.Date("2020/10/7");
		int week = java.util.Calendar.DAY_OF_WEEK;
		if(getDayOfWeek(date2, week) == 3)
			return true;
		else
			return false;
	}
	
	public static boolean test() throws Throwable{
		return test0() && test1();
	}

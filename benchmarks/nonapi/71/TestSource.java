	public static boolean test0() throws Throwable {
		java.util.Date date1 = new java.util.Date("2020/11/1");
		java.util.Date date2 = new java.util.Date("2020/11/13");
		if(dateSubtraction(date1, date2) == 1036800000) 
			return true;
		else
			return false;
	}
	
	public static boolean test1() throws Throwable {
		java.util.Date date1 = new java.util.Date("2020/10/25");
		java.util.Date date2 = new java.util.Date("2020/11/1");
		if(dateSubtraction(date1, date2) == 604800000)
			return true;
		else
			return false;
	}
	
	public static boolean test() throws Throwable{
		return test0() && test1();
	}
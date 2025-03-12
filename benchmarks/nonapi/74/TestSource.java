	public static boolean test0() throws Throwable{
		if(isNullOrEmpty(""))
			return true;
		else
			return false;
	}
	
	public static boolean test1() throws Throwable{
		if(isNullOrEmpty(null))
			return true;
		else
			return false;
	}
	
	public static boolean test2() throws Throwable{
		if(!isNullOrEmpty("test null"))
			return true;
		else
			return false;
	}
	
	public static boolean test() throws Throwable{
		return test0() && test1() && test2();
	}
	public static boolean test0() throws Throwable{
		if(binaryToDecimal("0101").equals("5"))
			return true;
		else
			return false;
	}
	
	public static boolean test1() throws Throwable{
		if(binaryToDecimal("1101").equals("13"))
			return true;
		else
			return false;
	}
	
	public static boolean test() throws Throwable{
		return test0() && test1();
	}
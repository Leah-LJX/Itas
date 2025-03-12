	public static boolean test0() throws Throwable {
		char ch = 'A';
		if(isAlphabet(ch, 'A', 'Z')) 
			return true;
		else
			return false;
	}
	
	public static boolean test1() throws Throwable {
		char ch = 'c';
		if(!isAlphabet(ch, 'A', 'Z'))
			return true;
		else
			return false;
	}
	
	public static boolean test2() throws Throwable {
		char ch = 'G';
		if(isAlphabet(ch, 'A', 'Z')) 
			return true;
		else
			return false;
	}

	public static boolean test3() throws Throwable {
		char ch = 'Z';
		if(isAlphabet(ch, 'A', 'Z')) 
			return true;
		else
			return false;
	}
	
	public static boolean test() throws Throwable{
		return test0() && test1() && test2() && test3();
	}

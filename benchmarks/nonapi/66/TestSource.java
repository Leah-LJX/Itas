public static boolean test0() throws Throwable {
	    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
	    list.add("a");
	    list.add("b");
	    list.add("c");
	    list.add("d");
	    if(getListLastItem(list, 2) == "c")
	    	return true;
	    else
	    	return false;

	}
	
	public static boolean test1() throws Throwable {
	    java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
	    list.add("a");
	    list.add("b");
	    list.add("c");
	    list.add("d");
	    if(getListLastItem(list, 1) == "d")
	    	return true;
	    else
	    	return false;

	}
	
	public static boolean test() throws Throwable{
		return test0() && test1();
	}

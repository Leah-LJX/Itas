public static boolean test0() throws Throwable{
    java.util.Date date = new java.util.Date();
    if(getNowMonth(date,2) == 11)
        return true;
    else
        return false;
}

public static boolean test1() throws Throwable{
    java.util.Date date = new java.util.Date("2020/9/1");
    if(getNowMonth(date,2) == 9)
        return true;
    else
        return false;
}

public static boolean test() throws Throwable{
	return test0() && test1();
}

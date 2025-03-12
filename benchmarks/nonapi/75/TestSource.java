public static boolean test0() throws Throwable{
    if(getCircleArea(1,java.lang.Math.PI) == java.lang.Math.PI)
        return true;
    else
        return false;
}

public static boolean test1() throws Throwable{
    if(getCircleArea(2,java.lang.Math.PI) == 4 * java.lang.Math.PI)
        return true;
    else
        return false;
}

public static boolean test() throws Throwable{
	return test0() && test1();
}

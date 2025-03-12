	public static boolean test0() throws Throwable {
	   java.awt.geom.Rectangle2D rect = new java.awt.geom.Rectangle2D.Double(1.2, 3.4, 7.8, 5.6); 
	    if(java.lang.Math.abs(getPerimeter(rect) - 26.8) < 1e-7)
	    	return true;
	    else
	    	return false;
	}
	
	public static boolean test1() throws Throwable {
		java.awt.geom.Rectangle2D rect = new java.awt.geom.Rectangle2D.Double(1.2, 3.4, 5.6, 0); 
	    if(java.lang.Math.abs(getPerimeter(rect) - 11.2) < 1e-7)
	    	return true;
	    else
	    	return false;
	}
	
	public static boolean test() throws Throwable{
		return test0() && test1();
	}

	 public static boolean test0() throws Throwable {
			java.awt.geom.Ellipse2D.Double ellipse = new java.awt.geom.Ellipse2D.Double(12.3, -45.6, 7.8, 7.8); 
		    if(isCircle(ellipse))
		    	return true;
		    else
		    	return false;
	}
	 
	 public static boolean test1() throws Throwable {
			java.awt.geom.Ellipse2D.Double ellipse = new java.awt.geom.Ellipse2D.Double(12.3, -45.6, 7.8, 7.7); 
		    if(!isCircle(ellipse))
		    	return true;
		    else
		    	return false;
	}

	public static boolean test2() throws Throwable {
			java.awt.geom.Ellipse2D.Double ellipse = new java.awt.geom.Ellipse2D.Double(12.3, -45.6, 7.8, 7.9); 
		    if(!isCircle(ellipse))
		    	return true;
		    else
		    	return false;
	}
	 
	 public static boolean test() throws Throwable {
		 return test0() && test1() && test2();
	 }

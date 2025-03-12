	public static long dateSubtraction(Date start, Date end) throws ParseException {
		long subtraction = end.getTime() - start.getTime();
		return subtraction;
	}
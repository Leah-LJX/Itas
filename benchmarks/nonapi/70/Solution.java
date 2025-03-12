public static int getNowMonth(Date date,int monthVal) {
        Calendar gc= Calendar.getInstance();
        gc.setTime(date);
        return gc.get(monthVal) + 1;
}

public String getListLastItem(List<String> news, int last) {
    {
      int i2 = 0;
      int i1 = 0;
      String s1 = null;
      i1 = news.size();
      i2 = i1 - last;
      s1 = news.get(i2);
      return s1;
    }
}
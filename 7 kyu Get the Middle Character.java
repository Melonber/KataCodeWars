class Kata {
  public static String getMiddle(String word) {
     
    if(word.length() == 1 || word.length() == 2)
      return word;
    
    if(word.length() % 2 == 0) {
      return "" + word.charAt((int) word.length()/2 - 1) + word.charAt((int) word.length()/2);
    }else {
      return "" + word.charAt((int) word.length()/2);
    }
  }
}

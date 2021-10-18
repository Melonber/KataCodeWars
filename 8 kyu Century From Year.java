public class Solution {
  public static int century(int number) {
    int centuryCount = 0;
    while(number > 0){
        number = number - 100;
        centuryCount = centuryCount + 1;}
    return centuryCount;
  }
}

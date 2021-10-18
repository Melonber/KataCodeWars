public class Codewars {
  public static String oddOrEven (int[] array) {
  String answer;
        int sum = 0;
        for(int i = 0; i<= array.length-1;i++)
            sum = sum + array[i];
        if(sum%2==0)
            answer = "even";
        else
            answer = "odd";
        System.out.println(answer);
        return answer;
  }
}

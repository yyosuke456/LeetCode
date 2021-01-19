import java.util.Scanner;

// https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber9 {
  public static void main(String[] args) {
    // 標準入力から読み込む際に、Scan
    Scanner sc = new Scanner(System.in);

    // String １つ分を読み込む
    int n = Integer.parseInt(sc.next());

    System.out.println(isPalindrome(n));
  }

  public static boolean isPalindrome(int x) {
    String s = String.valueOf(x);
    int centerPosition = s.length() / 2;
    String pref = s.substring(0, centerPosition);
    String suff = "";
    if (s.length() % 2 == 0) {
      suff = s.substring(centerPosition, s.length());
    } else {
      suff = s.substring(centerPosition + 1, s.length());
    }
    StringBuilder suffBuilder = new StringBuilder(suff);
    String reversedSuff = suffBuilder.reverse().toString();
    return pref.equals(reversedSuff);
  }
}
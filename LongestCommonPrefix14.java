import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
// https://leetcode.com/problems/longest-common-prefix/

class Solution {
  public String longestCommonPrefix(String[] strs) {
    String result = "";
    List<String> strList = Arrays.asList(strs);
    if (strList.size() == 0) {
      return result;
    }
    if (strList.get(0).length() == 0) {
      return result;
    }

    int minLength = strList.stream().min((l, r) -> l.length() - r.length()).orElse("").length();
    for (int i = 0; i < minLength; i++) {
      int index = i;
      String firstStr = strList.get(0).substring(index, index + 1);
      List<String> filteredList = strList.stream().filter(s -> s.substring(index, index + 1).equals(firstStr))
          .collect(Collectors.toList());
      if (strList.size() == filteredList.size()) {
        result += firstStr;
      } else {
        break;
      }
    }
    return result;
  }
}
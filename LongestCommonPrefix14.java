import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
  public String longestCommonPrefix(String[] strs) {
    String result = "";
    List<String> strList = Arrays.asList(strs);
    for (int i = 0; i < strList.size(); i++) {
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
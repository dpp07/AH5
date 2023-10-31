import java.util.HashMap;

class Solution {
    public static char mostFrequentChar(String s) {
        HashMap <Character, Integer> charCountMap = new HashMap<>();
        int storeLength = s.length();
        char storeAnswer = 0;
        int count = 0;

        for (int i = 0; i < storeLength; i++){
            char character = s.charAt(i);
            charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);

            if (count <= charCountMap.get(character)){
                storeAnswer = character;
                count = charCountMap.get(character);
            }
        }
      return storeAnswer;
    }
  
    public static void main(String[] args) {
      System.out.println(Solution.mostFrequentChar("bookkeeper"));
      System.out.println(Solution.mostFrequentChar("david"));
      System.out.println(Solution.mostFrequentChar("mississippi"));
      System.out.println(Solution.mostFrequentChar("eleventennine"));
    }

  }

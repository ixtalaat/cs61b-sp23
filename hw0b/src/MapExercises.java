import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> mapResult = new TreeMap<Character, Integer>();
        char letter = 'a';

        for (int i=1; i<=26; i++) {
            mapResult.put(letter, i);
            letter = (char) (letter + 1);
        }
        return  mapResult;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> mapResult = new TreeMap<Integer, Integer>();
        for (int i=0; i<nums.size() ; i++) {
            mapResult.put(nums.get(i), (nums.get(i)*nums.get(i)));
        }
        return  mapResult;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> mapResult = new TreeMap<String, Integer>();
        for (int i=0; i<words.size() ; i++) {
            int count = 0;
            for (int j=0; j<words.size() ; j++) {

                if (words.get(i).equals(words.get(j)))
                    count++;

            }
            mapResult.put(words.get(i), count);
        }
        return mapResult;
    }
}

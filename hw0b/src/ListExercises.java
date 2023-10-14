import java.util.List;
import java.util.ArrayList;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum = 0;
        for (int i=0; i<L.size(); i++) {
            sum += L.get(i);
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> evensList = new ArrayList<>();
        for (int num : L) {
            if(num % 2 == 0)
                evensList.add(num);
        }
        return evensList;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> commonItems = new ArrayList<>();
        for (int i=0; i<L1.size(); i++) {
            for (int j=0; j< L2.size(); j++) {
                if(L1.get(i) == L2.get(j))
                    commonItems.add(L1.get(i));
            }
        }
        return commonItems;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for (String word : words) {
            for (int i=0; i<word.length(); i++) {
                if(word.charAt(i) == c)
                    count++;
            }
        }
        return count;
    }
}

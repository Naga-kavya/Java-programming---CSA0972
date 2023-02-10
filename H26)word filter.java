import java.util.*;

class WordFilter {
    private Map<String, Integer> prefixMap;
    private Map<String, Integer> suffixMap;
    private String[] words;

    public WordFilter(String[] words) {
        this.words = words;
        prefixMap = new HashMap<>();
        suffixMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <= words[i].length(); j++) {
                prefixMap.put(words[i].substring(0, j) + "#" + words[i], i);
                suffixMap.put(words[i] + "#" + words[i].substring(j), i);
            }
        }
    }

    public int f(String pref, String suff) {
        if (prefixMap.containsKey(pref + "#" + suff)) {
            return prefixMap.get(pref + "#" + suff);
        }
        return -1;
    }
}

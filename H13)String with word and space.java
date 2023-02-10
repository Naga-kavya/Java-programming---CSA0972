public int lengthOfLastWord(String s) {
    if (s == null || s.length() == 0) return 0;
    String[] words = s.split(" ");
    int n = words.length;
    for (int i = n - 1; i >= 0; i--) {
        if (words[i].length() != 0) {
            return words[i].length();
        }
    }
    return 0;
}

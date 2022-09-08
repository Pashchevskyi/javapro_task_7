package ua.ithillel.lms.javapro.pavlopashchevskyi.task7;

public class StringWizard {
    public int findSymbolOccurance(String str, char ch) {
        int result = -1;
        int times = 0;
        do {
            result = str.indexOf(ch, result + 1);
            if (result != -1) {
                times++;
            }
        } while (result > -1 && result < str.length());

        return times;
    }

    public int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public String stringReverse(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);

        return sb.reverse().toString();
    }

    public boolean isPalindrome(String str) {
        int j = str.length() - 1;
        char strChars[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (strChars[i] != strChars[j]) {
                return false;
            }
            j--;
        }

        return true;
    }
}
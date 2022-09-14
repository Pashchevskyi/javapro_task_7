package ua.ithillel.lms.javapro.pavlopashchevskyi.task7;

public class StringWizard {
    public int findSymbolOccurance(String str, char ch) {
        if (str == null) {
            return 0;
        }
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
        if (source == null || target == null) {
            return -1;
        }
        return source.indexOf(target);
    }

    public String stringReverse(String str) {
        if (str == null) {
            System.out.println("ERROR: unable to reverse null instead of string");
            return "";
        }
        int n = str.length();
        char strInversedChars[] = new char[n];
        for (int j = 0; j < n; j++) {
            strInversedChars[j] = str.charAt(n - j - 1);
        }

        return new String(strInversedChars);
    }

    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
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
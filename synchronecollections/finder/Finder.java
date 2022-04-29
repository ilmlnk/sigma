package synchrocollections.finder;

public class Finder {
    public static boolean matchString(String str) {
        if (str.length() > 1) {
            return str.toLowerCase().charAt(0) == str.toLowerCase().charAt(str.length() - 1);
        }
        return false;
    }
}

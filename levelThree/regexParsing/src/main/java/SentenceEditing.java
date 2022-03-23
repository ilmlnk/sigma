import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceEditing {
    private String str;

    public SentenceEditing() {}

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public static void editString(String str, int lengthLimit) {
        String buffer;
        if (str.length() <= lengthLimit) {
            Pattern pattern = Pattern.compile("\\b[aeiouyAEIOUY].+");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                buffer = matcher.group();
                FileRecording.fileRecord(buffer);
            }
        }
    }
}

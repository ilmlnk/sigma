import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private FileProcessor fileProcessor;

    private BufferedReader bf1;
    private BufferedReader bf2;
    private BufferedReader bf3;

    public Parser(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
    }

    public ArrayList<Double> parseDoubles() throws IOException {
        try {
            bf1 = new BufferedReader(new FileReader(fileProcessor.getNameFirst()));
            bf2 = new BufferedReader(new FileReader(fileProcessor.getNameSecond()));
            bf3 = new BufferedReader(new FileReader(fileProcessor.getNameThird()));
        } catch (FileNotFoundException e) {
            System.err.println("It is not possible to find these files!");
        }

        StringBuilder builder = new StringBuilder();
        ArrayList<Double> doubles = new ArrayList<>();

        while(bf1.ready()) {
            builder.append((char) bf1.read());
        }
        while(bf2.ready()) {
            builder.append((char) bf2.read());
        }
        while(bf3.ready()) {
            builder.append((char) bf3.read());
        }

        String s = builder.toString();
        Pattern pattern = Pattern.compile("[0-9]*[.,][0-9]+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            doubles.add(Double.parseDouble(matcher.group(0).replace(",", ".")));
        }
        closeStreams();
        return doubles;
    }

    public ArrayList<String> parseStrings() throws IOException {
        try {
            bf1 = new BufferedReader(new FileReader(fileProcessor.getNameFirst()));
            bf2 = new BufferedReader(new FileReader(fileProcessor.getNameSecond()));
            bf3 = new BufferedReader(new FileReader(fileProcessor.getNameThird()));
        } catch (FileNotFoundException e) {
            System.err.println("It is not possible to find these files!");
        }

        StringBuilder builder = new StringBuilder();
        ArrayList<String> strings = new ArrayList<>();
        String line;

        while ((line = bf1.readLine()) != null) {
            builder.append(line);
        }
        String s = builder.toString();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            strings.add(matcher.group());
        }
        closeStreams();
        return strings;
    }

    private boolean closeStreams() {
        try {
            bf1.close();
            bf2.close();
            bf3.close();
        } catch (IOException e) {
            System.err.println("It is not possible to close files!");
        }
        return true;
    }

    public FileProcessor getFileProcessor() {
        return fileProcessor;
    }

    public void setFileProcessor(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
    }
}

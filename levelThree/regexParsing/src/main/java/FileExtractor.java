/*
 * За допомогою класів Pattern, Matcher / Scanner (за вибором
 * слухача) в заданому текстовому файлі видалити всі слова заданої довжини, що
 * починаються на приголосну букву. Опрацьовані фрагменти тексту заносити до нового
 * текстового файлу безпосередньо після опрацювання без утворення буферних
 * колекцій.
 *
 * */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExtractor {
    private File[] files;

    public FileExtractor(File... files) {
        this.files = files;
    }

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    public boolean extractingData(int stringLengthLimit) {
        String stringData;

        try {
            for (File f : files) {
                if (f.exists()) {
                    Scanner scanner = new Scanner(f);
                    while (scanner.hasNextLine()) {
                        stringData = scanner.nextLine();
                        SentenceEditing.editString(stringData, stringLengthLimit);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File is not found!");
            return false;
        }
        return true;
    }
}

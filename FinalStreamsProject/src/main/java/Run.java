import service.FileProcessingHandler;

public class Run {
    public static void main(String[] args) {
        FileProcessingHandler fileProcessingHandler = new FileProcessingHandler("C:\\Users\\ilmln" +
                "\\IdeaProjects\\FinalStreamsProject\\src\\main\\java\\files");
        fileProcessingHandler.run();
    }
}
package threads;

import threads.dto.MainThreadRecord;
import threads.dto.ThreadController;

public class Run {
    public static void main(String[] args) {
        new ThreadController("C:\\Users\\ilmln\\IdeaProjects\\" +
                "Level3\\src\\main\\java\\threads\\files\\read\\readfile1");
        new ThreadController("C:\\Users\\ilmln\\IdeaProjects\\" +
                "Level3\\src\\main\\java\\threads\\files\\read\\readfile2");
        new ThreadController("C:\\Users\\ilmln\\IdeaProjects\\" +
                "Level3\\src\\main\\java\\threads\\files\\read\\readfile3");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();

        MainThreadRecord.consistentRecord("C:\\Users\\ilmln\\IdeaProjects\\" +
                "Level3\\src\\main\\java\\threads\\files\\read\\readfile1");
        MainThreadRecord.consistentRecord("C:\\Users\\ilmln\\IdeaProjects\\" +
                "Level3\\src\\main\\java\\threads\\files\\read\\readfile2");
        MainThreadRecord.consistentRecord("C:\\Users\\ilmln\\IdeaProjects\\" +
                "Level3\\src\\main\\java\\threads\\files\\read\\readfile3");

    }
}

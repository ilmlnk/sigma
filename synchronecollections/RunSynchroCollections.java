package synchrocollections;/*
*
* todo: Із використанням потокобезпечних колекцій пакету
*   java.util.concurrent створити синхронну багатопотокову систему для формування з
*   трьох текстових файлів колекції з кількістю повторень кожного слова ДОВЖИНОЮ
*   БІЛЬШЕ ОДНІЄЇ БУКВИ, В ЯКИХ СПІВПАДАЮТЬ ПЕРША ТА ОСТАННЯ
*   БУКВИ. НЕ ВИКОРИСТОВУВАТИ проміжне створення колекцій для прочитаного
*   тексту.
*
* */

public class RunSynchroCollections {
    public static void main(String[] args) {
        new ThreadController("C:\\Users\\ilmln\\IdeaProjects\\SynchroCollections\\src\\main\\java\\" +
                "synchrocollections\\files\\1");
        new ThreadController("C:\\Users\\ilmln\\IdeaProjects\\SynchroCollections\\src\\main\\java\\" +
                "synchrocollections\\files\\2");
        new ThreadController("C:\\Users\\ilmln\\IdeaProjects\\SynchroCollections\\src\\main\\java\\" +
                "synchrocollections\\files\\3");
    }
}

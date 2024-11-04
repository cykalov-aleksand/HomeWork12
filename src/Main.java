public class Main {
    public static void main(String[] args) {
        Author authorBook1 = new Author("Роберт", "Мартин");
        Author authorBook2 = new Author("Брюсс", "Эккель");
        Book book1 = new Book("Чистый код создание, анализ и рефакторинг", authorBook1, 2024);
        Book book2 = new Book("Философия Java", authorBook2, 2023);
        System.out.println(" Первый вариант вывода информации с помощью метода show() класса Book ");
        System.out.printf("%10s%45s%20s%20s%20s\n", "№ книги", "Название книги", "Имя автора", "Фамилия автора", "Год издания");
        book1.show("Книга 1");
        book2.show("Книга 2");
        int year = 2000;
        System.out.println("\nС помощью сеттера изменили год издания первой книги на " + year + " год\n");
        book1.setYearRelease(year);
        System.out.println("Поменяли год публикации первой книги на " + book1.getYearRelease() + " год (значение прочли с геттера)");
        System.out.println(" Второй вариант вывода информации с помощью геттеров ");
        System.out.printf("%10s%45s%20s%20s%20s\n", "№ книги", "Название книги", "Имя автора", "Фамилия автора", "Год издания");
        System.out.printf("%10s%45s%20s%20s%20d\n", "Книга 1", book1.getTitle(), book1.getAuthor().getName(),
                book1.getAuthor().getSurname(), book1.getYearRelease());
        System.out.printf("%10s%45s%20s%20s%20d\n", "Книга 2", book2.getTitle(), book2.getAuthor().getName(),
                book2.getAuthor().getSurname(), book2.getYearRelease());
    }
}
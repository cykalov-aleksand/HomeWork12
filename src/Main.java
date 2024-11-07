public class Main {
    static void show(String s,Book o) {
        System.out.printf("%10s%100s\n", s, o);
    }
    static String compare(Book book,Book book2) {
        if (book.equals(book2)) {
            return "Книги одинаковы";
        } else {
            return "Книги разные ";
        }
    }
    static String sortByYear(Book book1, Book book2){
        int code1 = book1.hashCode() - book1.getTitle().hashCode() - book1.getAuthor().hashCode();
        int code2 = book2.hashCode() - book2.getTitle().hashCode() - book2.getAuthor().hashCode();
        if (code1 == code2) {
            if (book1.getYearRelease() == book2.getYearRelease()) {
                return "одинаковые";
            }
        }
        return "разные";
    }
    static String sortByAvtor(Book book1, Book book2){
        int code1 = book1.hashCode() - book1.getTitle().hashCode() - book1.getYearRelease();
        int code2 = book2.hashCode() - book2.getTitle().hashCode() - book2.getYearRelease();
        if (code1 == code2) {
            if (book1.getAuthor().equals(book2.getAuthor())) {
                return "одинаковые";
            }
        }
        return "разные";
    }
    public static void main(String[] args) {
        Author authorBook1 = new Author("Роберт", "Мартин");
        Author authorBook2 = new Author("Брюсс", "Эккель");
        Author authorBook3 = new Author("Брюсс", "Эккель");
        Book book1 = new Book("Чистый код создание, анализ и рефакторинг", authorBook1, 2024);
        Book book2 = new Book("Философия Java", authorBook2, 2023);
        Book book3 = new Book("Философия Java", authorBook3, 2023);
        System.out.printf("%10s%45s%20s%20s%20s\n", "№ книги", "Название книги", "Имя автора", "Фамилия автора", "Год издания");
        show("Книга 1", book1);
        show("Книга 2", book2);
        show( "Книга 3", book3);
        System.out.println("Сравнили первую книгу со второй - "+ compare(book1,book2));
        System.out.println("Сравнили вторую книгу с третьей - "+ compare(book2,book3));
       int year = 2020;
        System.out.println("\nС помощью сеттера изменили год издания третьей книги на " + year + " год\n");
        book3.setYearRelease(year);
       show("Книга 1", book1);
       show("Книга 2", book2);
        show( "Книга 3", book3);
        System.out.println("\nСравнили вторую книгу с третьей - "+ compare(book2,book3)+" так как поменяли год");
        System.out.println("\nУ второй и третьей книги года выпуска - "+sortByYear(book3,book2));
        System.out.println("\nУ второй и третьей книги авторы - "+ sortByAvtor(book2,book3));
    }
}
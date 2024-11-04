import java.time.LocalDate;

public class Book {
    private String title;
    private final Author author;
    private int yearRelease;

    Book(String title, Author author, int yearRelease) {
        if (title == null || title.isBlank()) {
            title = "Ошибка, в конструкторе нет названия книги!!!";
            throw new RuntimeException(title);
        }
        if ((yearRelease < 1000) || (yearRelease > LocalDate.now().getYear())) {
            throw new RuntimeException(" в конструкторе неверно введен год издания");
        }
        this.title = title;
        this.author = author;
        this.yearRelease = yearRelease;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearRelease() {
        return this.yearRelease;
    }

    public void setTitle(String title) {
        if (title != null && !title.isBlank()) {
            this.title = title.trim();
        } else {
            String error = "ОШИБКА ввода названия книги автора - " + author.getSurname();
            throw new RuntimeException(error);
        }
    }

    public void setAuthor(String name, String surname) {
        if ((name == null || name.isBlank()) || (surname == null || surname.isBlank())) {
            String error = "ОШИБКА ввода фамилии или имени автора книги - \"" + title + "\"";
            throw new RuntimeException(error);
        } else {
            this.author.setName(name);
            this.author.setSurname(surname);
        }
    }

    public void setYearRelease(int yearRelease) {
        if ((yearRelease > 1000) && (yearRelease < LocalDate.now().getYear())) {
            this.yearRelease = yearRelease;
        } else {
            String error = "ОШИБКА ввода года издания книги - \"" + title + "\" ";
            throw new RuntimeException(error);
        }
    }

    public void show(String numberBook) {
        System.out.printf("%10s%45s%20s%20s%20d\n ", numberBook, this.title, author.getName(), author.getSurname(), this.yearRelease);
    }
}

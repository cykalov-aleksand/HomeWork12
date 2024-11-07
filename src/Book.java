import java.time.LocalDate;

public class Book {
    private String title;
    private final Author author;
    private int yearRelease;

    Book(String title, Author author, int yearRelease) {
        if (title == null || title.isBlank()) {
            title = "Ошибка, в конструкторе нет названия книги!!!";
            throw new IllegalArgumentException(title);
        }
        if ((yearRelease < 1000) || (yearRelease > LocalDate.now().getYear())) {
            throw new IllegalArgumentException(" в конструкторе неверно введен год издания");
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
            throw new IllegalArgumentException(error);
        }
    }

    public void setAuthor(String name, String surname) {
        if ((name == null || name.isBlank()) || (surname == null || surname.isBlank())) {
            String error = "ОШИБКА ввода фамилии или имени автора книги - \"" + title + "\"";
            throw new IllegalArgumentException(error);
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
            throw new IllegalArgumentException(error);
        }
    }

    public void show(String numberBook) {
        System.out.printf(numberBook);
    }
    @Override
    public String toString() {
        return String.format("%45s%40s%20s",this.title,author,this.yearRelease);
    }
     @Override
   public int hashCode() {
     int result;
  result = java.util.Objects.hash(this.title) + author.hashCode()+this.yearRelease;
    return result;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book that = (Book) object;
        boolean s=author.equals(that.author);
       return title.equals(that.title) && (yearRelease==that.yearRelease)&&(author.equals(that.author));
    }
}

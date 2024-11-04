public class Author {
    private String name;
    private String surname;

    Author(String name, String surname) {
        if (name == null || name.isBlank()) {
            name = "неизвестно";
        }
        if (surname == null || surname.isBlank()) {
            surname = "неизвестна";
        }
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name.trim();
        } else {
            String error = " ОШИБКА ввода имени автора - " + this.surname;
            throw new RuntimeException(error);
        }
    }

    public void setSurname(String surname) {
        if (surname != null && !surname.isBlank()) {
            this.surname = surname.trim();
        } else {
            String error = "ОШИБКА ввода фамилии автора";
            throw new RuntimeException(error);
        }
    }
}

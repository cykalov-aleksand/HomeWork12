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
            throw new IllegalArgumentException(error);
        }
    }

    public void setSurname(String surname) {
        if (surname != null && !surname.isBlank()) {
            this.surname = surname.trim();
        } else {
            String error = "ОШИБКА ввода фамилии автора";
            throw new IllegalArgumentException(error);
        }
    }

    @Override
    public String toString() {

        return String.format("%20s%20s", this.name, this.surname);
    }

    @Override
    public int hashCode() {
        int result;
        result = java.util.Objects.hash(this.name) + java.util.Objects.hash(this.surname);
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Author that = (Author) object;
       return surname.equals(that.surname) && name.equals(that.name);
        }
    }

package ru.PhoneBook;

/**
 * Created by oleg on 11.10.16.
 */
public class Phones {
    private int id;
    private String num;

    public Phones(int id, String num) {
        this.id = id;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public String getNum() {
        return num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phones phones = (Phones) o;

        if (id != phones.id) return false;
        return num != null ? num.equals(phones.num) : phones.num == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (num != null ? num.hashCode() : 0);
        return result;
    }
}

package ru.PhoneBook;

/**
 * Created by oleg on 11.10.16.
 */
public class Phones {
    private String id;
    private String num;

    public Phones(String id, String num) {
        this.id = id;
        this.num = num;
    }

    public String getId() {
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

        if (id != null ? !id.equals(phones.id) : phones.id != null) return false;
        return num != null ? num.equals(phones.num) : phones.num == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (num != null ? num.hashCode() : 0);
        return result;
    }
}

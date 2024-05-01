package edu.hw3.task5;

import java.util.Objects;

@SuppressWarnings("NeedBraces")
public class Contact {
    private final String firstname;
    private final String lastname;
    private final String comparison;

    public Contact(String string) {
        String[] strings = string.split(" ");
        firstname = strings[0];
        lastname = strings.length > 1 ? strings[1] : null;
        comparison = lastname == null ? firstname : lastname;
    }

    public static int compare(Contact contact1, Contact contact2) {
        return contact1.getComparison().compareTo(contact2.getComparison());
    }

    public String getComparison() {
        return comparison;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(firstname, contact.firstname) && Objects.equals(lastname, contact.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }
}

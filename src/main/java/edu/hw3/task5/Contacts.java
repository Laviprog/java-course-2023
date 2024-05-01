package edu.hw3.task5;

import java.util.Arrays;

public class Contacts {
    public Contact[] parseContacts(String[] parseContacts, String sortedType) {
        if (parseContacts == null) {
            return new Contact[]{};
        }
        Contact[] contacts = new Contact[parseContacts.length];
        for (int i = 0; i < parseContacts.length; i++) {
            contacts[i] = new Contact(parseContacts[i]);
        }
        if (sortedType.equals("ASC")) {
            sortContactByAsc(contacts);
        } else if (sortedType.equals("DESC")) {
            sortContactByDesc(contacts);
        }
        return contacts;
    }

    private void sortContactByDesc(Contact[] contacts) {
        Arrays.sort(contacts, (contact1, contact2) -> Contact.compare(contact2, contact1));
    }

    private void sortContactByAsc(Contact[] contacts) {
        Arrays.sort(contacts, Contact::compare);
    }
}

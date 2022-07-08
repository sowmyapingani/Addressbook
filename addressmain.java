package com.bridge.labzs;

public class addressmain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
         AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.addContact();

        //UC2 add contacts
        for (Contacts contacts : addressBook.contactsArrayList) {
            System.out.println("The" + contacts);
        }
    }

    private static class AddressBook {
        public Contacts[] contactsArrayList;

        public void addContact() {

        }

    }
}

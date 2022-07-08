package com.bridge.labzs;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class addressbook {
    public static void main(String args[]) {

        class AddressBook {
            static Scanner scan = new Scanner(System.in);
            List<Contacts> contactsArrayList = new ArrayList<Contacts>();

            public void addContact() {
                Contacts contacts = new Contacts();
                System.out.println("FirstName: ");
                String Firstname = scan.next();
                contacts.setState(Firstname);
                System.out.println("Lastname: ");
                String Lastname = scan.next();
                contacts.setState(Lastname);
                System.out.println("address ");
                String address = scan.next();
                contacts.setAddress(address);
                System.out.println("City: ");
                String city = scan.next();
                contacts.setState(city);
                contacts.setCity(city);
                System.out.println("State: ");
                String state = scan.next();
                contacts.setState(state);
                System.out.println("Zip: ");
                String zip = scan.next();
                contacts.setState(zip);
                contacts.setZip(zip);
                System.out.println("phone: ");
                String phone = scan.next();
                contacts.setState(phone);
                contacts.setPhone(phone);
                System.out.println("Email: ");
                String email = scan.next();
                contacts.setState(email);

                System.out.println(contacts.toString());

                contacts.setEmail(email);
                contactsArrayList.add(contacts);
            }

            public void editContacts() {
                System.out.println("enter the first name to edit: ");
                String firstName = scan.next();
                for (Contacts contact : contactsArrayList) {
                    if (firstName.equals(contact.getFirstName())) {
                        contact.editContacts();
                        break;
                    }
                    System.out.println("Enter the Firstname to delete");
                    String FirstName = scan.next();
                    boolean isContactthere = false;

                    for(Contacts Contact:contactsArrayList){
                        if(firstName.equals(contact.getFirstName())){
                            contactsArrayList.remove(contact);
                            System.out.println("Contact Deleted");
                        }
                    }
                }

                }
            }
        }
    }

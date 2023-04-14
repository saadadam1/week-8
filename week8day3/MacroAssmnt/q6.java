// Address Book: Create a class called AddressBook that stores a collection of contacts in a HashMap. The class should have methods to add, edit, and delete contacts, as well as to search for a contact by name.
import java.util.HashMap;

public class AddressBook {
    private HashMap<String, Contact> contacts;
    
    public AddressBook() {
        this.contacts = new HashMap<>();
    }
    
    public void addContact(String name, Contact contact) {
        this.contacts.put(name, contact);
    }
    
    public void editContact(String name, Contact updatedContact) {
        if (this.contacts.containsKey(name)) {
            this.contacts.put(name, updatedContact);
        } else {
            System.out.println("Contact not found!");
        }
    }
    
    public void deleteContact(String name) {
        if (this.contacts.containsKey(name)) {
            this.contacts.remove(name);
        } else {
            System.out.println("Contact not found!");
        }
    }
    
    public Contact searchContact(String name) {
        return this.contacts.get(name);
    }
}

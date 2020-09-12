import java.util.Scanner;

public class ContactsManager {
    Contact [] contacts;
    int count = 0;

    ContactsManager(){
        contacts = new Contact[4];
    }

    public void addContact(Contact contact){
        contacts[count] = contact;
        count++;
    }

    public String searchContact(String name){
        for (Contact contact : contacts) {
            if (contact.getName().toLowerCase().equals(name.toLowerCase())) {
                return contact.getPhoneNumber();
            }
        }
        return "result not found";
    }

    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();
        contact1.setName("Lulu");
        contact1.setPhoneNumber("+996 456 789");

        Contact contact2 = new Contact();
        contact2.setName("Aidai");
        contact2.setPhoneNumber("+996 567 342");

        Contact contact3 = new Contact("Bema", "+996 812 818");
        Contact contact4 = new Contact("Adilet", "+996 127 890");

        myContactsManager.addContact(contact1);
        myContactsManager.addContact(contact2);
        myContactsManager.addContact(contact3);
        myContactsManager.addContact(contact4);


        Scanner scanner = new Scanner(System.in);
        String enterName = scanner.nextLine();

        System.out.println(myContactsManager.searchContact(enterName));

    }
}

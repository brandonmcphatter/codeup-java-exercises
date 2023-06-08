package contact_CLI_app;
import util.Input;

import java.util.ArrayList;

public class ContactApplication {

    public static void main(String[] args) {
        Input userInput = new Input();
        boolean confirm;
        menuDisplay();
        int userSelection = userInput.getInt(1, 5);

        switch (userSelection) {
            case 1:
//                showAllContacts();
            case 2:
                addContact();
                System.out.println("Cool!");
                menuDisplay();
                break;
            case 3:
//                searchForContact();
            case 4:
//                deleteContact();
            case 5:
                System.out.println("That's All Folks!");
                break;
        }

    }

    public static void menuDisplay() {
            System.out.println("1. View Contacts");
            System.out.println("2. Add New Contact");
            System.out.println("3. Search a Contact By Name");
            System.out.println("4. Delete Existing Contact");
            System.out.println("5. Exit\n");

            System.out.println("Enter Selection: ");
    }

//    public static ArrayList<Contact> showAllContacts() {
//
//    }

    public static Contact addContact() {
        System.out.println("Enter First Name: ");
        Input textInput = new Input();
        String name1 = textInput.getString();
        System.out.println("Enter Last Name: ");
        String name2 = textInput.getString();
        System.out.println("Enter phone number: ex-(123-456-7890)");
        String number = textInput.getString();
        System.out.printf("%s -- %s -- (%s)", name1, name2, number);
        return new Contact(name1, name2, number);
    }




}

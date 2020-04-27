package view;

import model.Contact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class MainView {
    public Contact createContactForm() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("===ADD NEW CONTACT===");
        System.out.print("1. Enter Contact name:");
        String name = br.readLine();
        System.out.print("2. Enter Contact number:");
        String number = br.readLine();
        System.out.print("3. Enter Contact group:");
        String group = br.readLine();
        System.out.print("4. Enter Contact gender:");
        String gender = br.readLine();
        System.out.print("5. Enter Contact date of birth:");
        String dob = br.readLine();
        System.out.print("6. Enter Contact address:");
        String address = br.readLine();
        System.out.print("7. Enter Contact email:");
        String email = br.readLine();

        Contact newContact = new Contact(name,number,group,gender,dob,address,email);
        return newContact;

    }

    public int mainMenu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option;
        System.out.println("========== MAIN MENU ==========");
        System.out.println("1. Display Contact");
        System.out.println("2. Add new contact");
        System.out.println("3. Update Contact");
        System.out.println("4. Delete contact by Name");
        System.out.println("5. Search contact info by Name");
        System.out.println("6. Load contact from database");
        System.out.println("7. Save contact to database");
        System.out.println("================================");
        System.out.println("8. Quit");
        option = Integer.parseInt(br.readLine());
        return option;
    }

    public void displayAllContact(ArrayList<Contact> contactList) {
        System.out.println("================DISPLAY ALL CONTACT======================================");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Name","Number","Group","Gender","DOB","Address","Email");
        Iterator<Contact> itr = contactList.iterator();
        while (itr.hasNext()) {
            Contact holder = itr.next();
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",holder.getContactName(), holder.getContactNumber(), holder.getGroup(), holder.getGender(),holder.getDob(),holder.getAddress(),holder.getEmail());
        }
        System.out.println("===========================================================================");

    }

    public static String enterNameForm() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value;
        System.out.println("========== ENTER NAME FORM ==========");
        System.out.print("Enter contact name:");
        value = br.readLine();
        return value;
    }

    public static void displayContact(Contact contact) throws IOException {
        System.out.println("================DISPLAY CONTACT======================================");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Name","Number","Group","Gender","DOB","Address","Email");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",
                contact.getContactName(), contact.getContactNumber(), contact.getGroup(), contact.getGender(), contact.getDob(),contact.getAddress(),contact.getEmail());
        }
}

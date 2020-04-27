package controller;

import model.Contact;
import view.MainView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class MainFunction {
    public void updateContactByName(ArrayList<Contact> contactList) throws IOException {
        Iterator<Contact> itr;
        String name = MainView.enterNameForm();
        itr = contactList.iterator();
        while (itr.hasNext()) {
            Contact holder = itr.next();
            if (holder.getContactName().equals(name)) {
                MainView mainView = new MainView();
                contactList.set(contactList.indexOf(holder), mainView.createContactForm());
                break;
            }
        }
    }
    public void deleteContactByName(ArrayList<Contact> contactList) throws IOException {
        Iterator<Contact> itr;
        String name;
        name = MainView.enterNameForm();
        itr = contactList.iterator();
        while (itr.hasNext()) {
            Contact holder = itr.next();
            if (holder.getContactName().equals(name)) {
                contactList.remove(holder);
                break;
            }
        }
    }

    public void searchContactByName(ArrayList<Contact> contactList) throws IOException {
        Iterator<Contact> itr;
        String name;
        name = MainView.enterNameForm();
        itr = contactList.iterator();
        while (itr.hasNext()) {
            Contact holder = itr.next();
            if (holder.getContactName().equals(name)) {
            MainView mainView = new MainView();
            mainView.displayContact(holder);
            }
        }
    }
}

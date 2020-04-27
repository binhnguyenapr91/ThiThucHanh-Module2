package controller;

import dao.Dao;
import model.Contact;
import view.MainView;
import java.io.IOException;
import java.util.ArrayList;

public class ContactManager {

    private static final String INVALID_OPTION_STRING = "Invalid Option";
    private static final String DATA_FILE_PATH = "contactData.dat";
    private static final int EXIT_CODE = 8;
    private static final int INIT_VALUE = -1;
    private static final int DISPLAY_ALL_CODE = 1;
    public static final int ADD_CODE = 2;
    public static final int UPDATE_CODE = 3;
    public static final int DELETE_CODE = 4;
    public static final int SEARCH_CODE = 5;

    private static ArrayList<Contact> initData() {
        // Sample Data
        ArrayList<Contact> contactList = new ArrayList<Contact>();

        Contact c1 = new Contact("BinhNguyen", "0987654321", "family", "male","26/04/1991","Ha Noi","binh@gmail.com");
        Contact c2 = new Contact("TienNguyen", "0987654321", "family", "female","26/04/1991","Ha Noi","binh@gmail.com");
        Contact c3 = new Contact("HoaiPham", "0987654321", "codegym", "female","26/04/1991","Ha Noi","binh@gmail.com");
        Contact c4 = new Contact("LamNguyen", "0987654321", "family", "male","26/04/1991","Ha Noi","binh@gmail.com");
        Contact c5 = new Contact("NguyenNguyen", "0987654321", "codegym", "male","26/04/1991","Ha Noi","binh@gmail.com");

        contactList.add(c1);
        contactList.add(c2);
        contactList.add(c3);
        contactList.add(c4);
        contactList.add(c5);
        // -----------------------
        return contactList;
    }

    private static void menuControl(MainView mainView, MainFunction mainFunction, Dao dao, ArrayList<Contact> contactList) throws IOException {
        int option =INIT_VALUE;

        while (option != EXIT_CODE) {
            option = mainView.mainMenu();
            switch (option) {
                case EXIT_CODE:
                    System.exit(EXIT_CODE);
                    break;
                case DISPLAY_ALL_CODE:
                    mainView.displayAllContact(contactList);
                    break;
                case ADD_CODE:
                    contactList.add(mainView.createContactForm());
                    break;
                case UPDATE_CODE:
                    mainFunction.updateContactByName(contactList);
                    break;
                case DELETE_CODE:
                    mainFunction.deleteContactByName(contactList);
                    break;
                case SEARCH_CODE:
                    mainFunction.searchContactByName(contactList);
                    break;
                case 6:
                    contactList = dao.readFromFile(DATA_FILE_PATH);
                    break;
                case 7:
                    dao.writeToFile(contactList, DATA_FILE_PATH);
                    break;
                default:
                    System.out.println(INVALID_OPTION_STRING);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        MainView mainView = new MainView();
        MainFunction mainFunction = new MainFunction();
        Dao dao = new Dao();
        ArrayList<Contact> contactList = initData();
        menuControl(mainView, mainFunction, dao, contactList);
    }


}

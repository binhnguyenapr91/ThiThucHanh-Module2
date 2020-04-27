package dao;

import model.Contact;

import java.io.*;
import java.util.ArrayList;

public class Dao {
    public void writeToFile(ArrayList<?> contactList, String path) throws IOException {
          String COMMA = ",";
          String END = "\n";

        FileWriter fw = null;

        try {
            fw = new FileWriter(path);

            for (Object contact : contactList) {
                Contact holder = (Contact) contact;
                fw.append(String.valueOf(holder.getContactName()));
                fw.append(COMMA);
                fw.append(String.valueOf(holder.getContactNumber()));
                fw.append(COMMA);
                fw.append(String.valueOf(holder.getGroup()));
                fw.append(COMMA);
                fw.append(String.valueOf(holder.getGender()));
                fw.append(COMMA);
                fw.append(String.valueOf(holder.getDob()));
                fw.append(COMMA);
                fw.append(String.valueOf(holder.getAddress()));
                fw.append(COMMA);
                fw.append(String.valueOf(holder.getEmail()));
                fw.append(END);

            }
            System.out.println("Save Successfull!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error!");
        } finally {
            fw.flush();
            fw.close();
        }

    }
}

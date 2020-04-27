package dao;

import model.Contact;

import java.io.*;
import java.nio.Buffer;
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

    public ArrayList<Contact> readFromFile(String dataFilePath) {
        ArrayList<Contact> contacts = new ArrayList<>();
        BufferedReader br = null;
        try{
            String line;
            br = new BufferedReader(new FileReader(dataFilePath));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                String name = splitData[0];
                String number = splitData[1];
                String group = splitData[2];
                String gender = splitData[3];
                String dob = splitData[4];
                String address = splitData[5];
                String email = splitData[6];
                contacts.add(new Contact(name,number,group,gender,dob,address,email));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return contacts;
    }
}

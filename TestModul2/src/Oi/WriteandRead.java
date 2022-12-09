package Oi;

import Model.Studnet;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteandRead {
    static String url = "hello.txt";

    public static void write(List<Studnet> SaveStudnet) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(url);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(SaveStudnet);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("loi");

        }
    }

    public static List<Studnet> read() {
        try {
            FileInputStream fileInputStream = new FileInputStream(url);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Studnet>) objectInputStream.readObject();


        } catch (IOException | ClassNotFoundException e) {
            System.out.println("loi");
            return  new ArrayList<>();
        }
    }


}

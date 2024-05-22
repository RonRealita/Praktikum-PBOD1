/*
* Nama File    : SerializePerson.java
* Nama Pembuat : Rona Realita Najma
* NIM          : 24060122140124
* Deskripsi    : Main file untuk menyimpan data melalui serialisasi
* Tanggal      : 22 Mei 2024
*/

import java.io.*;
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person p = null;
        try {
            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            p = (Person) ois.readObject();
            ois.close();
            System.out.println("Serialized person name = "+p.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

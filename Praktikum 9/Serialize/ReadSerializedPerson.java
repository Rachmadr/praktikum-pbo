// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 15-05-2024
// Deskripsi    : kelas serialisasi untuk menmbaca objek person

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serialized persone name = " + person.getName());
        }catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}

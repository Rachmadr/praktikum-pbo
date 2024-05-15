// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 15-05-2024
// Deskripsi    : kelas serialisasi untuk menuliskan objek person

import java.io.*;

class Person implements Serializable{
    private String name;
    
    public Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Soobin");
        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek");
            s.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

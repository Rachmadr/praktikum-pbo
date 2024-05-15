// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 15-05-2024
// Deskripsi    : kelas MySQLPersonDAO untuk connect ke MySQL

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception{
        String name = person.getName();

        //koneksi ke db
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pbo", "root", "24060122120014");

        //quey
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi
        con.close();
    }
}

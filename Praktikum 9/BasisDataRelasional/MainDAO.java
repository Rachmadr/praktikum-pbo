// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 15-05-2024
// Deskripsi    : main kelas

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Yeonjun");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try{
            m.getPersonDAO().savePerson(person);
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}

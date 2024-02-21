public class MTitik {
    public static void main(String[] args){
        Titik t1, t2, t3;
        //float counterTitik;

        t1 = new Titik();
        t2 = new Titik();

        t1.setAbsis(6);
        t1.setOrdinat(7);
        t2.setAbsis(1);
        t2.setOrdinat(4);

        t3 = new Titik(5, 6);

        float absis, ordinat;
        absis = t1.getAbsis();
        ordinat = t1.getOrdinat();

        System.out.println("Jumlah objek titik :" + Titik.getCounterTitik());
        System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

    }    
}

public class MGaris {
    public static void main(String[] args) {
        Garis g1;
        Garis g2;
        Garis g3;

        g1 = new Garis();
        g2 = new Garis(new Titik(1,1), new Titik(6,6));
        g3 = new Garis(new Titik(1,6), new Titik(6,1));

        System.out.println("Garis 1 : ((" + g1.getTitikAwal().getAbsis() + ", " + g1.getTitikAwal().getOrdinat() + "), (" + g1.getTitikAkhir().getAbsis() + ", " + g1.getTitikAkhir().getOrdinat() + "))");
        System.out.println("Garis 2 : ((" + g2.getTitikAwal().getAbsis() + ", " + g2.getTitikAwal().getOrdinat() + "), (" + g2.getTitikAkhir().getAbsis() + ", " + g2.getTitikAkhir().getOrdinat() + "))");
        System.out.println("Garis 3 : ((" + g3.getTitikAwal().getAbsis() + ", " + g3.getTitikAwal().getOrdinat() + "), (" + g3.getTitikAkhir().getAbsis() + ", " + g3.getTitikAkhir().getOrdinat() + "))");

        System.out.println("Panjang G1 : " + g1.getPanjang());
        System.out.println("Panjang G2 : " + g2.getPanjang());
        System.out.println("Panjang G3 : " + g3.getPanjang());

        System.out.println("Gradien G1 : " + g1.getGradien());
        System.out.println("Gradien G2 : " + g2.getGradien());
        System.out.println("Gradien G3 : " + g3.getGradien());
        
        Garis gr = g2.getRefleksiY();
        System.out.println("Refleksi Y Garis 2 : ((" + gr.getTitikAwal().getAbsis() + ", " + gr.getTitikAwal().getOrdinat() + "), (" + gr.getTitikAkhir().getAbsis() + ", " + gr.getTitikAkhir().getOrdinat() + "))");

        if(g2.isTegakLurus(g3)){
            System.out.println("Garis G2 dan G3 Tegak Lurus");
        }
        else{
            System.out.println("Garis G2 dan G3 tidak Tegak Lurus");
        }
    }
}

// Nama         : Rachmad Rifa'i
// NIM          : 24060122120014
// Tanggal      : 09-03-2024
// Deskripsi    : Program utama dari kelas product

public class MProduct {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 4, 500);
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Stock: " + product.getStock());
        System.out.println("Product Price: " + product.getPrice());
        product.purchaseProduct(5);
        System.out.println("Product Stock: " + product.getStock());
    }
}
//Fitur login
public class FurnitureStore {
    public static void login() {
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        if (username.equals("ANGGA,JOVAR,LEON") && password.equals("PBO")) {
            loggedInUser = new User(username, password);
            System.out.println("Login berhasil! Selamat datang, " + username);
        } else {
            System.out.println("Username atau password tidak valid.");
        }
    }

}

    //Fitur cari produk
    public static void searchProduct() {
        System.out.print("Masukkan nama produk yang dicari: ");
        String searchTerm = scanner.nextLine().toLowerCase();
        boolean found = false;
        System.out.println("Hasil pencarian:");
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(searchTerm)) {
                System.out.println(product);
                found = true;
                if (!found) {
                    System.out.println("Produk tidak ditemukan.");
                }
            }

        }
        }

     //Fitur detail produk
     public static void viewProductDetail() {
         System.out.print("Masukkan ID produk untuk melihat detail: ");
         int productId = scanner.nextInt();
         scanner.nextLine(); // Bersihkan newline

         for (Product product : products) {
             if (productId == product.getId()) {
                 System.out.println(product);
                 return;
             }
         }
         System.out.println("Produk tidak ditemukan.");
     }

     //Fitur detail pengiriman produk
     public static void shippingDetails() {
         System.out.println("Pengiriman dilakukan melalui jasa kurir terpercaya. Estimasi pengiriman 3-5 hari kerja.");
     }
public static void productReview() {
    System.out.println("⭐⭐⭐⭐⭐ (5/5) \"Kursi Kayu");
    System.out.println("⭐⭐⭐⭐ (4/5) \"Meja Makan");
    System.out.println("⭐⭐⭐ (3/5) \"Lemari Pakaian");
    System.out.println("⭐⭐⭐⭐⭐ (5/5) \"Sofa");
    System.out.println("⭐⭐⭐⭐ (4/5) \"kasur");
    System.out.println("⭐⭐⭐⭐⭐ (5/5) \"Hiasan Dinding");
    System.out.println("⭐⭐⭐⭐ (4/5) \"Meja kecil");
    System.out.println("⭐⭐⭐ (3/5) \"kursi Gaming");
    System.out.println("⭐⭐⭐⭐⭐ (5/5) \"Rak Piring");
    System.out.println("⭐⭐⭐⭐⭐ (5/5) \"Meja Belajar");
}


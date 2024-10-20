import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FurnitureStore {

    // List untuk menyimpan produk, keranjang, dan wishlist
    public static List<Product> products = new ArrayList<>();
    public static List<Product> cart = new ArrayList<>();
    public static List<Product> wishlist = new ArrayList<>();
    public static User loggedInUser;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeProducts();
        showMainMenu();
    }

    // Fungsi untuk inisialisasi produk
    public static void initializeProducts() {
        products.add(new Product(1, "Kursi Kayu", 500000, "Kursi kayu berkualitas."));
        products.add(new Product(2, "Meja Makan", 1200000, "Meja makan elegan."));
        products.add(new Product(3, "Lemari Pakaian", 2500000, "Lemari pakaian dengan desain modern."));
        products.add(new Product(4, "Sofa", 3500000, "Sofa nyaman dengan desain minimalis."));
        products.add(new Product(5, "Kasur", 10000000, "kasur Empuk, nyaman dan dengan desain yang menarik."));
        products.add(new Product(6, "Hiasan Dinding", 2000000, "Bahan yang kuat untuk memperindah ruangan."));
        products.add(new Product(7, "Meja kecil", 6000000, "Kayu berkualitas dengan desain yang indah."));
        products.add(new Product(8, "Kursi gaming", 8900000, "Kursi empuk ,membuat duduk menjadi nyaman."));
        products.add(new Product(9, "Rak piring", 3700000, "Bahan yang berkualitas dengan penyimpanan yang banyak."));
        products.add(new Product(10, "Meja Belajar", 4800000, "Meja belajar impian."));

    }


    public static void showMainMenu() {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nSELAMAT DATANG DI APLIKASI FURNITURE STORE:");
            System.out.println("1. Login Account");
            System.out.println("2. Cari Produk");
            System.out.println("3. Detail Produk");
            System.out.println("4. Tambah ke Keranjang");
            System.out.println("5. Cek Promo dan Diskon");
            System.out.println("6. Metode Pembayaran");
            System.out.println("7. Detail Pengiriman Produk");
            System.out.println("8. Ulasan Produk");
            System.out.println("9. Wishlist Produk");
            System.out.println("10. Notifikasi Pengingat");
            System.out.println("11. Mencari Toko Terdekat");
            System.out.println("12. Logout");
            System.out.println("13. Keluar");

            String selectedMenu = input("Pilih opsi");

            switch (selectedMenu) {
                case "1":
                    login();
                    break;
                case "2":
                    searchProduct();
                    break;
                case "3":
                    viewProductDetail();
                    break;
                case "4":
                    addToCart();
                    break;
                case "5":
                    checkPromoAndDiscount();
                    break;
                case "6":
                    paymentMethod();
                    break;
                case "7":
                    shippingDetails();
                    break;
                case "8":
                    productReview();
                    break;
                case "9":
                    wishlist();
                    break;
                case "10":
                    reminderNotification();
                    break;
                case "11":
                    findNearestStore();
                    break;
                case "12":
                    logout();
                    break;
                case "13":
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

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

    public static void searchProduct() {
        System.out.print("Masukkan nama produk yang dicari: ");
        String searchTerm = scanner.nextLine().toLowerCase();
        boolean found = false;
        System.out.println("Hasil pencarian:");
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(searchTerm)) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Produk tidak ditemukan.");
        }
    }
    public static void addToCart() {
        System.out.print("Masukkan ID produk untuk ditambahkan ke keranjang: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); // Bersihkan newline

        for (Product product : products) {
            if (productId == product.getId()) {
                cart.add(product);
                System.out.println(product.getName() + " ditambahkan ke keranjang.");
                return;
            }
        }
        System.out.println("Produk tidak ditemukan.");
    }

    public static void shippingDetails() {
        System.out.println("Pengiriman dilakukan melalui jasa kurir terpercaya. Estimasi pengiriman 3-5 hari kerja.");
    }

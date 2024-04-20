import java.util.ArrayList;

public class Product {
    String Name, Category;
    int ID, Quantity, Price;

    public static ArrayList<Product> arrayProducts = new ArrayList<>();

    public static void Create_Product(int id, String name, String cat, int quan, int pric) {
        Product p = new Product();
        p.ID = id;
        p.Name = name;
        p.Category = cat;
        p.Quantity = quan;
        p.Price = pric;
        arrayProducts.add(p);

    }

    public int Give_ID() {
        credentials c3 = new credentials();
        int x = c3.ReadTheStockFile("FOR ID");

        return x;
    }

    public void display() {
        for (int i = 0; i < arrayProducts.size(); i++) {
            System.out.println("Name: " + arrayProducts.get(i).Name + "\n" + arrayProducts.get(i).ID + "\n"
                    + arrayProducts.get(i).Category);
        }

    }

    public void Create_File_Products() {
        credentials c3 = new credentials();
        c3.ReadTheStockFile(0, 0, 0);
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.display();
    }
}

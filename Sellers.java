import java.util.ArrayList;

// import java.awt.*;
// import java.awt.event.*;

public class Sellers {
    int ID, AGE;
    String NAME, GENDER, CELL_NO, USERNAME, PASSWORD;
    public static ArrayList<Sellers> arraySellers = new ArrayList<>();

    public Sellers() {

    }

    public static void Create_Product(int id, String name, String gen, int age, String cell_no, String uname,
            String pass) {
        Sellers s = new Sellers();
        s.ID = id;
        s.NAME = name;
        s.GENDER = gen;
        s.AGE = age;
        s.CELL_NO = cell_no;
        s.USERNAME = uname;
        s.PASSWORD = pass;
        arraySellers.add(s);

    }

    public int Give_ID() {
        credentials c3 = new credentials();
        int x = c3.ReadTheStockFileforSellerID("FOR ID");

        return x;
    }

}

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class credentials {

    // cartpage cp = new cartpage();

    public credentials() {
        // SellerLogin sl = new SellerLogin();
    }

    public void writefile(String x, String y, String z) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("credentials.csv", true));
            bw.write("\n" + x + "," + y);
            bw.close();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    int c = 0;

    public boolean verify(String x, String y) throws IOException {
        String file = "credentials.csv";
        String delimiter = ",";
        String line;
        String[] lines;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                lines = line.split(delimiter, 2);
                if ((lines[0].equals(x)) && (lines[1].equals(y))) {
                    c = 1;
                    break;
                } else {
                    c = 0;
                }
                System.out.println(lines[0] + ",,," + lines[1]);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        if (c == 1)
            return true;
        else
            return false;
    }

    public boolean verifySeller(String x, String y) throws IOException {
        String file = "sellers.csv";
        String delimiter = ",";
        String line;
        String[] lines;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                lines = line.split(delimiter, 7);
                if ((lines[5].equals(x)) && (lines[6].equals(y))) {
                    c = 1;
                    break;
                } else {
                    c = 0;
                }
                System.out.println(lines[0] + ",,," + lines[1]);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        if (c == 1)
            return true;
        else
            return false;
    }

    public void writeStockfile(String a, String b, Object c, String d, String e) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("stock.csv", true));
            bw.write("\n" + a + "," + b + "," + c + "," + d + "," + e);
            bw.close();

        } catch (IOException ex) {

            ex.printStackTrace();
        }

    }

    public void OverwriteStockfile() {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("stock.csv"));
            for (int i = 0; i < SellerLogin.owarr.size(); i++) {

                if (i == 0) {
                    bw.write(SellerLogin.owarr.get(i)[0] + "," + SellerLogin.owarr.get(i)[1] + ","
                            + SellerLogin.owarr.get(i)[2] + "," + SellerLogin.owarr.get(i)[3] + ","
                            + SellerLogin.owarr.get(i)[4]);
                } else {
                    bw.write("\n" + SellerLogin.owarr.get(i)[0] + "," + SellerLogin.owarr.get(i)[1] + ","
                            + SellerLogin.owarr.get(i)[2] + "," + SellerLogin.owarr.get(i)[3] + ","
                            + SellerLogin.owarr.get(i)[4]);
                }

            }

            bw.close();

        } catch (IOException ex) {

            ex.printStackTrace();
        }

    }

    public void OverwriteStockfile(int x) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("stock.csv"));
            for (int i = 0; i < SellerLogin.delarr.size(); i++) {

                if (i == 0) {
                    bw.write(SellerLogin.delarr.get(i)[0] + "," + SellerLogin.delarr.get(i)[1] + ","
                            + SellerLogin.delarr.get(i)[2] + "," + SellerLogin.delarr.get(i)[3] + ","
                            + SellerLogin.delarr.get(i)[4]);
                } else {
                    bw.write("\n" + SellerLogin.delarr.get(i)[0] + "," + SellerLogin.delarr.get(i)[1] + ","
                            + SellerLogin.delarr.get(i)[2] + "," + SellerLogin.delarr.get(i)[3] + ","
                            + SellerLogin.delarr.get(i)[4]);
                }

            }

            bw.close();

        } catch (IOException ex) {

            ex.printStackTrace();
        }

    }

    public void OverwriteSellerCredsfile(int x) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("sellers.csv"));
            for (int i = 0; i < AdminLogin.delarr.size(); i++) {

                if (i == 0) {
                    bw.write(AdminLogin.delarr.get(i)[0] + "," + AdminLogin.delarr.get(i)[1] + ","
                            + AdminLogin.delarr.get(i)[2] + "," + AdminLogin.delarr.get(i)[3] + ","
                            + AdminLogin.delarr.get(i)[4] + ","
                            + AdminLogin.delarr.get(i)[5] + ","
                            + AdminLogin.delarr.get(i)[6]);
                } else {
                    bw.write("\n" + AdminLogin.delarr.get(i)[0] + "," + AdminLogin.delarr.get(i)[1] + ","
                            + AdminLogin.delarr.get(i)[2] + "," + AdminLogin.delarr.get(i)[3] + ","
                            + AdminLogin.delarr.get(i)[4] + ","
                            + AdminLogin.delarr.get(i)[5] + ","
                            + AdminLogin.delarr.get(i)[6]);
                }

            }

            bw.close();

        } catch (IOException ex) {

            ex.printStackTrace();
        }

    }

    public void OverwriteSellerCredsfile(int x, int y) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("sellers.csv"));
            for (int i = 0; i < AdminLogin.owarr.size(); i++) {

                if (i == 0) {
                    bw.write(AdminLogin.owarr.get(i)[0] + "," + AdminLogin.owarr.get(i)[1] + ","
                            + AdminLogin.owarr.get(i)[2] + "," + AdminLogin.owarr.get(i)[3] + ","
                            + AdminLogin.owarr.get(i)[4] + ","
                            + AdminLogin.owarr.get(i)[5] + ","
                            + AdminLogin.owarr.get(i)[6]);
                } else {
                    bw.write("\n" + AdminLogin.owarr.get(i)[0] + "," + AdminLogin.owarr.get(i)[1] + ","
                            + AdminLogin.owarr.get(i)[2] + "," + AdminLogin.owarr.get(i)[3] + ","
                            + AdminLogin.owarr.get(i)[4] + ","
                            + AdminLogin.owarr.get(i)[5] + ","
                            + AdminLogin.owarr.get(i)[6]);
                }

            }

            bw.close();

        } catch (IOException ex) {

            ex.printStackTrace();
        }

    }

    public void writeSellerStockfile(int a, String b, Object c, int d, String e, String f, String g) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("sellers.csv", true));
            bw.write("\n" + a + "," + b + "," + c + "," + d + "," + e + "," + f + "," + g);
            bw.close();

        } catch (IOException ex) {

            ex.printStackTrace();
        }

    }

    public void ReadTheStockFile() {
        String file = "stock.csv";
        String delimiter = ",";
        String line;
        String[] lines;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            SellerLogin sl = new SellerLogin();

            while ((line = br.readLine()) != null) {
                lines = line.split(delimiter, 5);
                // sl.AddTableAfterRead();
                sl.AddTableAfterRead(lines[0], lines[1], lines[2], lines[3], lines[4]);
                System.out.println(
                        "\n" + lines[0] + ",---" + lines[1] + ",--" + lines[2] + ",--" + lines[3] + ",--" + lines[4]);

            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void ReadTheStockFile(int x, String a, String b, String c, String d) {
        String file = "stock.csv";
        String delimiter = ",";
        String line;
        String[] lines;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            SellerLogin sl = new SellerLogin();

            while ((line = br.readLine()) != null) {
                lines = line.split(delimiter, 5);

                if (Integer.valueOf(lines[0]) == x) {
                    lines[1] = a;
                    lines[2] = b;
                    lines[3] = c;
                    lines[4] = d;
                    SellerLogin.owarr.add(lines);
                } else {
                    SellerLogin.owarr.add(lines);
                }
                // sl.AddTableAfterRead();
                sl.AddTableAfterRead(lines[0], lines[1], lines[2], lines[3], lines[4]);
                System.out.println(
                        "\n" + lines[0] + ",---" + lines[1] + ",--" + lines[2] + ",--" + lines[3] + ",--" + lines[4]);

            }
            br.close();
            for (int i = 0; i < SellerLogin.owarr.size(); i++) {
                System.out.println(SellerLogin.owarr.get(i)[1]);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        OverwriteStockfile();
    }

    public void ReadTheStockFile(int x, int y, int z, int a) {
        String file = "stock.csv";
        String delimiter = ",";
        String line;
        String[] lines;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            SellerLogin sl = new SellerLogin();

            while ((line = br.readLine()) != null) {
                lines = line.split(delimiter, 5);

                if (Integer.valueOf(lines[0]) == x) {

                } else {
                    SellerLogin.delarr.add(lines);
                }
                System.out.println(
                        "\n" + lines[0] + "," + lines[1] + "," + lines[2] + "," + lines[3] + "," + lines[4]);

            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        OverwriteStockfile(0);
    }

    public void ReadTheSellerCredsFile(int x) {
        String file = "sellers.csv";
        String delimiter = ",";
        String line;
        String[] lines;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {
                lines = line.split(delimiter, 7);

                if (Integer.valueOf(lines[0]) == x) {

                } else {
                    AdminLogin.delarr.add(lines);
                }

            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        OverwriteSellerCredsfile(0);
    }

    public void ReadTheSellerCredsFile(int x, String a, String b, String c, String d, String e, String f) {
        String file = "sellers.csv";
        String delimiter = ",";
        String line;
        String[] lines;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {
                lines = line.split(delimiter, 7);

                if (Integer.valueOf(lines[0]) == x) {
                    lines[1] = a;
                    lines[2] = b;
                    lines[3] = c;
                    lines[4] = d;
                    lines[5] = e;
                    lines[6] = f;
                    AdminLogin.owarr.add(lines);
                } else {
                    AdminLogin.owarr.add(lines);
                }

            }
            br.close();

        } catch (Exception xe) {
            System.out.println(xe);
        }
        OverwriteSellerCredsfile(0, 0);
    }

    public void ReadSellerFile() {
        String file = "sellers.csv";
        String delimiter = ",";
        String line;
        String[] lines;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            AdminLogin al = new AdminLogin();

            while ((line = br.readLine()) != null) {
                lines = line.split(delimiter, 7);
                // sl.AddTableAfterRead();
                al.AddTableAfterRead(lines[0], lines[1], lines[2], lines[3], lines[4], lines[5], lines[6]);
                System.out.println(
                        "\n" + lines[0] + ",---" + lines[1] + ",--" + lines[2] + ",--" + lines[3] + ",--" + lines[4]);

            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void ReadTheStockFile(int x) {
        String file = "stock.csv";
        String delimiter = ",";
        String line;
        String[] lines;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            cartpage cp = new cartpage();

            while ((line = br.readLine()) != null) {
                lines = line.split(delimiter, 5);
                // sl.AddTableAfterRead();
                cp.AddTableAfterRead(lines[0], lines[1], lines[2], lines[4]);
                System.out.println(
                        "\n" + lines[0] + ",---" + lines[1] + ",--" + lines[2] + ",--" + lines[3] + ",--" + lines[4]);

            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void ReadTheStockFile(int x, int y) {
        String file = "stock.csv";
        String delimiter = ",";
        String line;
        String[] lines;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            CustomerLogin cl = new CustomerLogin();

            while ((line = br.readLine()) != null) {
                lines = line.split(delimiter, 5);

                cl.AddTableAfterRead(lines[0], lines[1], lines[2], lines[3], lines[4]);
                Product.Create_Product(Integer.valueOf(lines[0]), lines[1], lines[2], Integer.valueOf(lines[3]),
                        Integer.valueOf(lines[4]));
                // System.out.println(
                // "\n" + lines[0] + ",---" + lines[1] + ",--" + lines[2] + ",--" + lines[3] +
                // ",--" + lines[4]);

            }

            br.close();

            // for (int i = 0; i < Product.arrayProducts.size(); i++) {
            // System.out.println(Product.arrayProducts.get(i).Name);
            // }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int ReadTheStockFile(String giveID) {
        String file = "stock.csv";
        String delimiter = ",";
        String line;
        String[] lines;
        int c = 0;
        int Id = 1;
        ArrayList<Integer> array_IDs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {
                c++;
                lines = line.split(delimiter, 5);
                array_IDs.add(Integer.valueOf(lines[0]));

            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        int x = array_IDs.get(array_IDs.size() - 1);
        Id = x + 1;
        return Id;
    }

    public int ReadTheStockFileforSellerID(String giveID) {
        String file = "sellers.csv";
        String delimiter = ",";
        String line;
        String[] lines;
        int c = 0;
        int Id = 1;
        ArrayList<Integer> array_IDs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {
                c++;
                lines = line.split(delimiter, 5);
                array_IDs.add(Integer.valueOf(lines[0]));
            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        // for (int i = 0; i < c + 1; i++) {

        // if (array_IDs.contains(i)) {

        // } else {
        Id = array_IDs.get(array_IDs.size() - 1) + 1;
        // break;
        // }

        // }
        return Id;
    }

    public void ReadTheStockFile(int x, int y, int z) {
        String file = "stock.csv";
        String delimiter = ",";
        String line;
        String[] lines;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {
                c++;
                lines = line.split(delimiter, 5);
                Product.Create_Product(Integer.valueOf(lines[0]), lines[1], lines[2], Integer.valueOf(lines[3]),
                        Integer.valueOf(lines[4]));

            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public int ReadTheStockFile(String x, String y, int z, int id) {
        String file = "stock.csv";
        String delimiter = ",";
        String line;
        String[] lines;
        int c = 0;
        int quantity = 1;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((line = br.readLine()) != null) {

                lines = line.split(delimiter, 5);
                if (Integer.valueOf(lines[0]) == id) {
                    System.out.println(lines[3]);
                    quantity = Integer.valueOf(lines[3]);

                    break;
                }

                c++;
            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return quantity;
    }
}

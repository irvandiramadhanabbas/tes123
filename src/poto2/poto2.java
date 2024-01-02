package poto2;

public class poto2 {
    private int menu;
    private int jumlah;

    public int getMenu() {
        return menu;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTotal() {
        int total = 0;
        if (menu == 1) {
            total = jumlah * 15000;
        } else if (menu == 2) {
            total = jumlah * 20000;
        } else if (menu == 3) {
            total = jumlah * 9000;
        } else if (menu == 4) {
            total = jumlah * 20000;
        } else {
        }
        return total;
    }
}

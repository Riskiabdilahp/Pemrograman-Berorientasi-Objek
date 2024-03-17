public class BangunDatar {

    private int p,l,s;
    //overloading constructor
    BangunDatar(int s) {
        this.s = s;
    }

    BangunDatar(int p, int l) {
        this.p = p;
        this.l = l;
    }

    void setBangunDatar(int s) {
        this.s = s;
    }
    void setBangunDatar(int p, int l) {
        this.p = p;
        this.l = p;
    }

    int getS() {
        return s;
    }

    int getP() {
        return p;
    }

    int getL() {
        return l;
    }

    void info() {
        System.out.println("Panjang:" + getS());
        //Tambahkan untuk yang p & l
    }
}
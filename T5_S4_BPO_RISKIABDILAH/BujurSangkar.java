public class BujurSangkar extends BangunDatar {

    BujurSangkar(int s){
        super(s);
    }

    int getLuas() {
        int s = super.getS();
        return s * s;
    }

    int getKeliling() {
        int s = super.getS();
        return 4 * s;
    }

    public String toString () {
        return "Luas : " + getLuas () + "\n" + "Keliling : " + getKeliling ();
    }

    void info() {
        System.out.println("Sisi Bujur Sangkar : " + super.getS());
    }

    
}
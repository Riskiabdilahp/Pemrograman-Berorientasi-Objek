public class PersegiPanjang extends BangunDatar {
    
    PersegiPanjang(int p, int l){
        super(p, l);
    }

    int getLuas(){
        int p = super.getP();
        int l = super.getL();
        return p*l;
    }
    int getKeliling(){
        int p = super.getP();
        int l = super.getL();
        return 2 * (p+l);
    }


    public String toString(){
        return "Luas :" + getLuas() + "\n" + "Keliling :" + getKeliling();
    }

    void info(){
        System.out.println(" panjang persegi panjang :" + super.getP());
        System.out.println(" panjang persegi panjang :" + super.getL());
    }
}
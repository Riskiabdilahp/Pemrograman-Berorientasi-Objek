public class MahasiswaKu {

    public static class Mahasiswa<K1, K2, K3> {

        private K1 nim;
        private K2 name;
        private K3 clas;

        public K1 getNim() {
            return nim;
        }

        public void setNim(K1 nim) {
            this.nim = nim;
        }

        public K2 getName() {
            return name;
        }

        public void setName(K2 name) {
            this.name = name;
        }

        public K3 getClas() {
            return clas;
        }

        public void setClas(K3 clas) {
            this.clas = clas;
        }
    }

    public static void main(String[] args) {
        Mahasiswa <String,String,Integer> T = new Mahasiswa<>();
        T.setNim("20220040210");
        T.setName("Sky");
        T.setClas(22);

        System.out.println(T.getNim());
        System.out.println(T.getName());
        System.out.println(T.getClas());
    }
}

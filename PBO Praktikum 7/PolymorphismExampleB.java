public class PolymorphismExampleB {
    public static class Pegawai {
        protected String name;
        protected int salary;

        public Pegawai(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public void cetakGaji() {
            int salary = 5000000;
            System.out.println("Nama: " + name + ", Gaji Pokok: " + salary);
        }
    }

    public static class Manajer extends Pegawai {
        private int tunjangan;

        public Manajer(String name, int salary, int tunjangan) {
            super(name, salary);
            this.tunjangan = tunjangan;
        }

        @Override
        public void cetakGaji() {
            int salary = 5000000;
            int tunjangan = 700000;
            System.out.println("Nama: " + name + ", Gaji Pokok: " + salary + ", Tunjangan:" + tunjangan);
        }
    }

    public static class Programmer extends Pegawai {
        private int bonus;

        public Programmer(String name, int salary, int bonus) {
            super(name, salary);
            this.bonus = bonus;
        }

        @Override
        public void cetakGaji() {
            int salary = 5000000;
            int bonus = 450000;
            System.out.println("Nama: " + name + ", Gaji Pokok: " + salary + ", Bonus:" + bonus);
        }
    }

    public static class Payroll {
        public void cetakGaji(Pegawai pegawai) {
            pegawai.cetakGaji();
        }
    }

    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira", 0, 0);
        Pegawai pegawai2 = new Manajer("Joko", 0, 0);
        Pegawai pegawai3 = new Manajer("Argo", 0, 0);

        Payroll payroll = new Payroll();
        payroll.cetakGaji((pegawai));
        payroll.cetakGaji((pegawai2));
        payroll.cetakGaji((pegawai3));
    }
}

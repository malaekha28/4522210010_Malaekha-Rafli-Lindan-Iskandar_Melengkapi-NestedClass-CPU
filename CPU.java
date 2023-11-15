import java.text.NumberFormat;
import java.util.Locale;

public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }

    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM + " GB");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public class Harddisk {
        int kapasitas;
        String manufacturer;

        Harddisk(int kapasitas, String manufacturer) {
            this.kapasitas = kapasitas;
            this.manufacturer = manufacturer;
        }

        public void getInfoHarddisk() {
            System.out.println("Kapasitas: " + this.kapasitas + " GB");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public class Motherboard {
        String chipse;
        String manufacturer;

        Motherboard(String chipse, String manufacturer) {
            this.chipse = chipse;
            this.manufacturer = manufacturer;
        }

        public void getInfoMotherboard() {
            System.out.println("Chipset: " + this.chipse);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public class PowerSupply {
        int watt;
        String manufacturer;

        PowerSupply(int watt, String manufacturer) {
            this.watt = watt;
            this.manufacturer = manufacturer;
        }

        public void getInfoPowerSupply() {
            System.out.println("Daya: " + this.watt + " watt");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public class VGACard {
        String namaGPU;
        int vram;
        String manufacturer;

        VGACard(String namaGPU, int vram, String manufacturer) {
            this.namaGPU = namaGPU;
            this.vram = vram;
            this.manufacturer = manufacturer;
        }

        public void getInfoVGACard() {
            System.out.println("Nama GPU: " + this.namaGPU);
            System.out.println("VRAM: " + this.vram + " GB");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }
}

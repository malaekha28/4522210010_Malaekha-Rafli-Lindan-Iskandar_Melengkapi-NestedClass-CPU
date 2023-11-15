import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Create a CPU object
        CPU myComputer = new CPU(15000000, "Lenovo");

        // Create a Processor object
        CPU.Processor i7 = myComputer.new Processor(8, "Intel", "i7");

        // Create a RAM object
        CPU.RAM rs32GB = myComputer.new RAM(32, "Samsung");

        // Create a Harddisk object
        CPU.Harddisk harddisk = myComputer.new Harddisk(512, "Seagate");

        // Create a Motherboard object
        CPU.Motherboard motherboard = myComputer.new Motherboard("B660M", "ASUS");

        // Create a PowerSupply object
        CPU.PowerSupply powerSupply = myComputer.new PowerSupply(750, "Corsair");

        // Create a VGACard object
        CPU.VGACard vgaCard = myComputer.new VGACard("RTX 3080", 8, "ASUS");

        // Display CPU information
        myComputer.getCPUInfo();

        // Display processor information
        i7.getProcessorInfo();

        // Display RAM information
        rs32GB.getInfoRAM();

        // Display harddisk information
        harddisk.getInfoHarddisk();

        // Display motherboard information
        motherboard.getInfoMotherboard();

        // Display power supply information
        powerSupply.getInfoPowerSupply();

        // Display VGA card information
        vgaCard.getInfoVGACard();
    }
}
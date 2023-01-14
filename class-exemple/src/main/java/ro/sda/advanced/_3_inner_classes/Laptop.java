package ro.sda.advanced._3_inner_classes;

public class Laptop {

    double price;

    public Laptop(double price) {
        this.price = price;
    }

    //inner class
    class Processor {
        String manufacturer;
        int numberOfCores;
        int ram;

        public Processor(String manufacturer, int numberOfCores, int ram) {
            this.manufacturer = manufacturer;
            this.numberOfCores = numberOfCores;
            this.ram = ram;
        }

        double getLaptopPrice() {
            return price;
        }

        double getCache() {
            return 4.3;
        }
    }
}

class Main {

    public static void main(String[] args) {

        // mai intai am nevoie de un laptop ca sa am un procesor
        Laptop myLaptop = new Laptop(100);
        // dupa ce am creat un obiect al clasei laptop, vom crea un boiect pentru procesor
        Laptop.Processor processor = myLaptop.new Processor("Intel", 6, 16);

        System.out.println(processor.getLaptopPrice());

        System.out.println(processor.getCache());
    }
}



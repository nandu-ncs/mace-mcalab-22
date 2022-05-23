import java.util.Scanner;
class Cpu {
	int price;
	Scanner myObj = new Scanner(System.in); 
	void get() {
		System.out.println("Enter the price : ");
		price=myObj.nextInt(); 
	}
	void display() {
		System.out.println("Price : "+price);
	}
	class Processor {
		int numcores;
		String manufacturer;
		void get() {
			System.out.println("Enter the no of cores : ");
			numcores = myObj.nextInt(); 
			System.out.println("Enter the Processor manufacturer : ");
			manufacturer = myObj.next(); 
		}
		void display() {
			System.out.println("No: of cores : "+numcores);
			System.out.println("Manufacturer : "+manufacturer);
		}
	}
	static class Ram {
		Scanner myObj = new Scanner(System.in); 
        int memory;
        String manufacturer;
		void get() {
			System.out.println("Enter memory size : ");
			memory = myObj.nextInt(); 
			System.out.println("Enter the Ram manufacturer : ");
			manufacturer = myObj.next(); 
		}

        void display() {
            System.out.println("Memory Size : " + memory);
            System.out.println("Memory manufactures : " + manufacturer);
        }
    }

}
class MainCpu {
	public static void main(String args[]) {
		Cpu cpu1 = new Cpu();
		Cpu.Processor processor1 = cpu1.new Processor();
		Cpu.Ram ram1 = new Cpu.Ram();
		cpu1.get();
		processor1.get();
		ram1.get();
		System.out.println("\nDetails of CPU\n");
		cpu1.display();
		processor1.display();
		ram1.display();
	}
}
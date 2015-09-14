
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompositeElement cabinet = new CompositeElement("Cabinet");
		cabinet.Add(new FloppyDisk("Floppy disk drive"));
		cabinet.Add(new HardDrive("Hard disk drive"));
		
		CompositeElement motherBoard = new CompositeElement("Mother Board");
		motherBoard.Add(new RAMModule("4GB RAM module"));
		motherBoard.Add(new RAMModule("4GB RAM module"));
		motherBoard.Add(new Processor("2.33Ghz I7 processor"));
		
		cabinet.Add(motherBoard);

		
		int netprice = cabinet.NetPrice();
		System.out.println("Total price : " + netprice + "\n --- \n");
		
		int power = cabinet.Power();
		System.out.println("Total power consuption : " + power + "\n --- \n");
	}

}

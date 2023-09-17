package invoice;

public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Qty1=4, Qty2=10, Qty3=9, Qty4=10;
		String Item1="Pencil";
		String Item2="Duster";
		String Item3="Pens";
		String Item4="crayon";
		int Unit1=20,Unit2=50,Unit3=30,Unit4=80;
		//Calculation of the amount
		int Amount1=Unit1*Qty1;
		int Amount2=Unit2*Qty2;
		int Amount3=Unit3*Qty3;
		int Amount4=Unit4*Qty4;
		
		double Sum1= Amount1;
		double Sum2= Amount2;
		double Sum3= Amount3;
		double Sum4= Amount4;
		
		
		int Subtotal=Amount1+Amount2+Amount3+Amount4;
		double allTotal= Subtotal;
        double VAT=0.16*Subtotal;
		double totalAmount=Subtotal+VAT;
		System.out.println("************************Adamson Computer Ltd**************************");
		System.out.println("#99 ACS Building Glimore Ave. New Mla.. Quezon City * Tel No:123-4567");
		System.out.println("\t\tVAT REG.TIN 098-765-4321-0000");
		System.out.println("\t\t\tSALES INVOICE");
		System.out.println("");
		System.out.println("");
		String soldTo="C026-01-0946/2022";
		String name="Sharon Naliaka";
		System.out.print("Sold To: "+soldTo);
		System.out.println("\t\t\t\tDate:28/04/2020");
		System.out.print("Address:"+name);
		System.out.println("\t\t\t\tContact Number:0100100100");
		System.out.println("");
		System.out.println("");
		System.out.println("==================================================================================");
		System.out.print("Qty\t");
		System.out.print("|\tItem Description\t|");
		System.out.print("\tUnit Price\t|");
		System.out.println("\tAmount");
		System.out.println("==================================================================================");
		System.out.print(Qty1);
		System.out.print("\t|\t");
		System.out.print(Item1);
		System.out.print("\t\t\t|");
		System.out.print("\t");
		System.out.print(Unit1);
		System.out.println("\t\t|\t"+Sum1);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print(Qty2);
		System.out.print("\t|\t");
		System.out.print(Item2);
		System.out.print("\t\t\t|");
		System.out.print("\t");
		System.out.print(Unit2);
		System.out.println("\t\t|\t"+Sum2);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print(Qty3);
		System.out.print("\t|\t");
		System.out.print(Item3);
		System.out.print("\t\t\t|");
		System.out.print("\t");
		System.out.print(Unit3);
		System.out.println("\t\t|\t"+Sum3);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print(Qty4);
		System.out.print("\t|\t");
		System.out.print(Item4);
		System.out.print("\t\t\t|");
		System.out.print("\t");
		System.out.print(Unit4);
		
		System.out.println("\t\t|\t"+Sum4);
		System.out.println("==================================================================================");
		System.out.println("\t\t\t\t\t\tSubtotal\t|\t"+allTotal);
		System.out.println("\t\t\t\t\t\t====================================");
		System.out.println("\t\t\t\t\t\tVAT\t\t|\t"+VAT);
		System.out.println("\t\t\t\t\t\t=====================================");
		System.out.println("\t\t\t\t\t\tTotal Amount\t|\t"+totalAmount);
		System.out.println("\t\t\t\t\t\t====================================");
		
		
	
		
		

	}

}

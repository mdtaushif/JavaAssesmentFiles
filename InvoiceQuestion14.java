package JavaAssessment;

import java.util.*;

public class InvoiceQuestion14 {

	String PartNumber;
	String PartDescription;
	int Quantity;
	double PricePerItem;

	public InvoiceQuestion14(String PartNumber, String PartDescription, int Quantity, double PricePerItem) {
		this.PartNumber = PartNumber;
		this.PartDescription = PartDescription;
		this.Quantity = Quantity;
		this.PricePerItem = PricePerItem;
	}

	public void setPartNumber(String PartNumber) {
		this.PartNumber = PartNumber;
	}

	public String getPartNumber() {
		return PartNumber;
	}

	public void setPartDescription(String PartDescription) {
		this.PartDescription = PartDescription;
	}

	public String PartDescription() {
		return PartDescription;
	}

	public void setQuantity(int Quantity) {
		this.Quantity = Quantity;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setPricePerItem(double PricePerItem) {
		this.PricePerItem = PricePerItem;
	}

	public double getPricePerItem() {
		return PricePerItem;
	}

	public static void main(String[] args) {
		int quant;
		Scanner Input = new Scanner(System.in);
		System.out.println("EnterProductName:- ");
		String ProductName = Input.next();
		System.out.println("enter the quantity");
		quant = Input.nextInt();
		InvoiceQuestion14 soap = new InvoiceQuestion14("soap", "fomey", quant, 25.2);
		InvoiceQuestion14 shampoo = new InvoiceQuestion14("shampoo", "fomey", quant, 25.2);
		InvoiceQuestion14 lizol = new InvoiceQuestion14("lizol", "fomey", quant, 25.2);
		switch (ProductName) {
		case "soap":
			getInvoice(soap.Quantity, soap.PricePerItem);
			break;
		case "shampoo":
			getInvoice(shampoo.Quantity, shampoo.PricePerItem);
			break;
		case "lizol":
			getInvoice(lizol.Quantity, lizol.PricePerItem);
			break;

		}
	}

	public static void getInvoice(int quant, double PricePerItem) {
		double cost;
		cost = quant * PricePerItem;
		System.out.println(cost);
	}
}
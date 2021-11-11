package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("Company Name: ");
	}
	private void companyid() {
		System.out.println("Company Id: ");
	}
	private void companyadr() {
		System.out.println("Company Address");
	}
	private void companyhr() {
		System.out.println("Company hr address");
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyid();
		c.companyadr();
		c.companyhr();
		
	}

}

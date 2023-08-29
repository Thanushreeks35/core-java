class FastrackExecutor{
	
	public static void main(String watch[]){
		Fastrack fastrack = new Fastrack();
		fastrack.productId = 1;
		fastrack.productType = "Analog";
		fastrack.productColor = "Brown";
		fastrack.productBrand = "Quartz";
		fastrack.productPrice = 1136;
		
		System.out.println("ProductId is"+ fastrack.productId);
		System.out.println("ProductType is"+ fastrack.productType);
		System.out.println("ProductColor is"+ fastrack.productColor);
		System.out.println("ProductBrand"+ fastrack.productBrand);
		System.out.println("ProductPrice"+ fastrack.productPrice);
		
		fastrack.provideWatch();
		
		Fastrack fastrack1 = new Fastrack();
		fastrack1.productId = 2;
		fastrack1.productType = "Analog";
		fastrack1.productColor = "Black";
		fastrack1.productBrand = "Quartz";
		fastrack1.productPrice = 1023;
		
		System.out.println("ProductId is"+ fastrack1.productId);
		System.out.println("ProductType is"+ fastrack1.productType);
		System.out.println("ProductColor is"+ fastrack1.productColor);
		System.out.println("ProductBrand"+ fastrack1.productBrand);
		System.out.println("ProductPrice"+ fastrack1.productPrice);
		
		fastrack1.provideWatch();
		
		Fastrack fastrack2 = new Fastrack();
		fastrack2.productId = 3;
		fastrack2.productType = "Analog";
		fastrack2.productColor = "Blue";
		fastrack2.productBrand = "Quartz";
		fastrack2.productPrice = 875;
		
		System.out.println("ProductId is"+ fastrack2.productId);
		System.out.println("ProductType is"+ fastrack2.productType);
		System.out.println("ProductColor is"+ fastrack2.productColor);
		System.out.println("ProductBrand"+ fastrack2.productBrand);
		System.out.println("ProductPrice"+ fastrack2.productPrice);
		
		fastrack2.provideWatch();
		
		Fastrack fastrack3 = new Fastrack();
		fastrack3.productId = 4;
		fastrack3.productType = "Analog";
		fastrack3.productColor = "Silver";
		fastrack3.productBrand = "Quartz";
		fastrack3.productPrice = 742;
		
		System.out.println("ProductId is"+ fastrack3.productId);
		System.out.println("ProductType is"+ fastrack3.productType);
		System.out.println("ProductColor is"+ fastrack3.productColor);
		System.out.println("ProductBrand"+ fastrack3.productBrand);
		System.out.println("ProductPrice"+ fastrack3.productPrice);
		
		fastrack3.provideWatch();
		
		Fastrack fastrack4 = new Fastrack();
		fastrack4.productId = 5;
		fastrack4.productType = "Analog";
		fastrack4.productColor = "Gold";
		fastrack4.productBrand = "Quartz";
		fastrack4.productPrice = 1012;
		
		System.out.println("ProductId is"+ fastrack4.productId);
		System.out.println("ProductType is"+ fastrack4.productType);
		System.out.println("ProductColor is"+ fastrack4.productColor);
		System.out.println("ProductBrand"+ fastrack4.productBrand);
		System.out.println("ProductPrice"+ fastrack4.productPrice);
		
		fastrack4.provideWatch();
	}
}
class ChainExecutor{
	
	public static void main(String fashion[]){
		Chain chain = new Chain();
		chain.chainId = 1;
		chain.chainColor = "Silver";
		chain.chainBrand = "Royatto";
		chain.chainMaterial = "Copper";
		chain.chainPrice = 223;
		
		System.out.println("ChainId is"+ chain.chainId);
		System.out.println("ChainColor is"+ chain.chainColor);
		System.out.println("ChainBrand is"+ chain.chainBrand);
		System.out.println("ChainMaterial"+ chain.chainMaterial);
		System.out.println("ChainPrice"+ chain.chainPrice);
		
		chain.provideFashion();
		
		Chain chain1 = new Chain();
		chain1.chainId = 2;
		chain1.chainColor = "Gold";
		chain1.chainBrand = "DMJ";
		chain1.chainMaterial = "Brass";
		chain1.chainPrice = 449;
		
		System.out.println("ChainId is"+ chain1.chainId);
		System.out.println("ChainColor is"+ chain1.chainColor);
		System.out.println("ChainBrand is"+ chain1.chainBrand);
		System.out.println("ChainMaterial"+ chain1.chainMaterial);
		System.out.println("ChainPrice"+ chain1.chainPrice);
		
		chain1.provideFashion();
		
		Chain chain2 = new Chain();
		chain2.chainId = 3;
		chain2.chainColor = "Silver";
		chain2.chainBrand = "Royatto";
		chain2.chainMaterial = "Copper";
		chain2.chainPrice = 223;
		
		System.out.println("ChainId is"+ chain2.chainId);
		System.out.println("ChainColor is"+ chain2.chainColor);
		System.out.println("ChainBrand is"+ chain2.chainBrand);
		System.out.println("ChainMaterial"+ chain2.chainMaterial);
		System.out.println("ChainPrice"+ chain2.chainPrice);
		
		chain2.provideFashion();
		
		Chain chain3 = new Chain();
		chain3.chainId = 4;
		chain3.chainColor = "Gold";
		chain3.chainBrand = "Khushal";
		chain3.chainMaterial = "Alloy";
		chain3.chainPrice = 299;
		
		System.out.println("ChainId is"+ chain3.chainId);
		System.out.println("ChainColor is"+ chain3.chainColor);
		System.out.println("ChainBrand is"+ chain3.chainBrand);
		System.out.println("ChainMaterial"+ chain3.chainMaterial);
		System.out.println("ChainPrice"+ chain3.chainPrice);
		
		chain3.provideFashion();
		
		Chain chain4 = new Chain();
		chain4.chainId = 5;
		chain4.chainColor = "Gold";
		chain4.chainBrand = "Divastri";
		chain4.chainMaterial = "Stainless Steel";
		chain4.chainPrice = 295;
		
		System.out.println("ChainId is"+ chain4.chainId);
		System.out.println("ChainColor is"+ chain4.chainColor);
		System.out.println("ChainBrand is"+ chain4.chainBrand);
		System.out.println("ChainMaterial"+ chain4.chainMaterial);
		System.out.println("ChainPrice"+ chain4.chainPrice);
		
		chain4.provideFashion();
		
	}
}
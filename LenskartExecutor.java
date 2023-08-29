class LenskartExecutor{
	
	static public void main(String eye[]){
		Lenskart lenskart = new Lenskart();
		lenskart.lenskartId = 1;
		lenskart.lensType = "Full Rim";
		lenskart.lensColor = "Brown";
		lenskart.lensMaterial = "Plastic";
		lenskart.lensPrice = 1700;
		
		System.out.println("LenskartId is"+ lenskart.lenskartId);
		System.out.println("LensType is"+ lenskart.lensType);
		System.out.println("LensColor is"+ lenskart.lensColor);
		System.out.println("LensMaterial"+ lenskart.lensMaterial);
		System.out.println("LensPrice"+ lenskart.lensPrice);
		
		lenskart.provideVision();
		
		Lenskart lenskart1 = new Lenskart();
		lenskart1.lenskartId = 2;
		lenskart1.lensType = "Full Rim";
		lenskart1.lensColor = "Blue";
		lenskart1.lensMaterial = "TR90";
		lenskart1.lensPrice = 679;
		
		System.out.println("LenskartId is"+ lenskart1.lenskartId);
		System.out.println("LensType is"+ lenskart1.lensType);
		System.out.println("LensColor is"+ lenskart1.lensColor);
		System.out.println("LensMaterial"+ lenskart1.lensMaterial);
		System.out.println("LensPrice"+ lenskart1.lensPrice);
		
		lenskart1.provideVision();
		
		Lenskart lenskart2 = new Lenskart();
		lenskart2.lenskartId = 3;
		lenskart2.lensType = "Full Rim";
		lenskart2.lensColor = "Light Blue";
		lenskart2.lensMaterial = "TR90";
		lenskart2.lensPrice = 1499;
		
		System.out.println("LenskartId is"+ lenskart2.lenskartId);
		System.out.println("LensType is"+ lenskart2.lensType);
		System.out.println("LensColor is"+ lenskart2.lensColor);
		System.out.println("LensMaterial"+ lenskart2.lensMaterial);
		System.out.println("LensPrice"+ lenskart2.lensPrice);
		
		lenskart2.provideVision();
		
		Lenskart lenskart3 = new Lenskart();
		lenskart3.lenskartId = 4;
		lenskart3.lensType = "Full Rim";
		lenskart3.lensColor = "Black";
		lenskart3.lensMaterial = "Plastic";
		lenskart3.lensPrice = 754;
		
		System.out.println("LenskartId is"+ lenskart3.lenskartId);
		System.out.println("LensType is"+ lenskart3.lensType);
		System.out.println("LensColor is"+ lenskart3.lensColor);
		System.out.println("LensMaterial"+ lenskart3.lensMaterial);
		System.out.println("LensPrice"+ lenskart3.lensPrice);
		
		lenskart3.provideVision();
		
		Lenskart lenskart4 = new Lenskart();
		lenskart4.lenskartId = 5;
		lenskart4.lensType = "Full Rim";
		lenskart4.lensColor = "Pink";
		lenskart4.lensMaterial = "TR90";
		lenskart4.lensPrice = 1200;
		
		System.out.println("LenskartId is"+ lenskart4.lenskartId);
		System.out.println("LensType is"+ lenskart4.lensType);
		System.out.println("LensColor is"+ lenskart4.lensColor);
		System.out.println("LensMaterial"+ lenskart4.lensMaterial);
		System.out.println("LensPrice"+ lenskart4.lensPrice);
		
		lenskart4.provideVision();
	}
}
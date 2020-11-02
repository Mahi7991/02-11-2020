class State{
	public static void main(String args[])
	{
		int vehiclePrice=110000;
		String state="KA";
		switch(state)
		{
			case "KA":float kaRoadTax=0.18f*vehiclePrice;
				  System.out.println(kaRoadTax);
				  break;
			case "DL":float dlRoadTax=0.25f*vehiclePrice;
				  System.out.println(dlRoadTax);
				  break;
			case "RJ":float rjRoadTax=0.24f*vehiclePrice;
			          System.out.println(rjRoadTax);
				  break;
			case "UP":float upRoadTax=0.12f*vehiclePrice;
				  System.out.println(upRoadTax);
				  break;
			case "HP":float hpRoadTax=0.22f*vehiclePrice;
				  System.out.println(hpRoadTax);
				  break;
			case "HR":float hrRoadTax=0.13f*vehiclePrice;
				  System.out.println(hrRoadTax);
				  break;
			default:System.out.println("Select from KA,DL,RJ,UP,HP,HR");
		}
	}
}
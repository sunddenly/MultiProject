package com.elong.design.pattern.ch22Bridge;

public class BridgeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile ab;
		
		ab = new MobileM();
		ab.SetMobileSoft(new MobileGame());
		ab.Run();
		ab.SetMobileSoft(new MobileAddrList());
		ab.Run();
		ab.SetMobileSoft(new MobileMP3());
		ab.Run();
		System.out.println("\n");
		
		ab = new MobileN();
		ab.SetMobileSoft(new MobileGame());
		ab.Run();
		ab.SetMobileSoft(new MobileAddrList());
		ab.Run();
		ab.SetMobileSoft(new MobileMP3());
		ab.Run();
		System.out.println("\n");
		

	}

}

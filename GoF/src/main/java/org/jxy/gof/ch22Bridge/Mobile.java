package com.elong.design.pattern.ch22Bridge;

public abstract class Mobile {
	
	protected MobileSoft soft;
	
	public void SetMobileSoft(MobileSoft soft) {
		this.soft = soft;
	}
	
	public abstract void Run();

}

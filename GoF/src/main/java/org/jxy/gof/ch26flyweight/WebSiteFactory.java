package com.elong.design.pattern.ch26flyweight;

import java.util.Hashtable;

public class WebSiteFactory {
	
	private Hashtable flyweights = new Hashtable();
	
	public WebSite GetWebSiteCategory(String key) {
		if (!flyweights.containsKey(key)) {
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return (WebSite)flyweights.get(key);
	}
	
	public int GetWebSiteCount() {
		return flyweights.size();
	}

}

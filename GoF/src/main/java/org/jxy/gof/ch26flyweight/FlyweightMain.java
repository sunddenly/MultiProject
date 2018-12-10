package com.elong.design.pattern.ch26flyweight;

public class FlyweightMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSiteFactory f = new WebSiteFactory();
		
		WebSite fx = f.GetWebSiteCategory("show");
		fx.Use(new User("user1"));
		WebSite fy = f.GetWebSiteCategory("show");
		fy.Use(new User("user2"));
		WebSite fz = f.GetWebSiteCategory("show");
		fz.Use(new User("user3"));
		WebSite fl = f.GetWebSiteCategory("blog");
		fl.Use(new User("user4"));
		WebSite fm = f.GetWebSiteCategory("blog");
		fm.Use(new User("user5"));
		WebSite fn = f.GetWebSiteCategory("blog");
		fn.Use(new User("user6"));
		
		System.out.println("The count of website cates is:" + f.GetWebSiteCount());

	}

}

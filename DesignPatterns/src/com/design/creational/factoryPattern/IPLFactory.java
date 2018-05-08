package com.design.creational.factoryPattern;

public class IPLFactory {
	public IPL getCaptain(String teamName) {
		if (teamName == null) {
			return null;
		}
		if (teamName.equalsIgnoreCase("csk")) {
			return new ChennaiSuperKings();
		}
		if (teamName.equalsIgnoreCase("mi")) {
			return new MumbaiIndians();
		}
		if (teamName.equalsIgnoreCase("rcb")) {
			return new RoyaleChallengersBanglore();
		}
		return null;
	}
}

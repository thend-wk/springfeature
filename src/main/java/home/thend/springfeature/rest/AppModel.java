package home.thend.springfeature.rest;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class AppModel {
	
	private String key;
	
	private String name;
	
	private String icon;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	@Override
	public String toString() {
		return "AppModel : " + key + 
				" " + name + " " + icon; 
	}

}

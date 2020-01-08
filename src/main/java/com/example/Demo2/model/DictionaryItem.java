package com.example.Demo2.model;

import java.io.Serializable;

public class DictionaryItem implements Serializable {
	private String Code = "";
	public String getCode(){
		return Code;
	}
	public void setCode(String value){
		this.Code = value;
	}

	private String Name = "";
	public String getName(){
		return Name;
	}
	public void setName(String value){
		this.Name = value;
	}

}

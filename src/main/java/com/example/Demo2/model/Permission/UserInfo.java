package com.example.Demo2.model.Permission;

import java.io.Serializable;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.example.Demo2.service.DictionaryService;
import com.example.Demo2.model.DictionaryItem;

@Component
public class UserInfo implements Serializable {
	@Autowired
	private DictionaryService dictionaryService;

	private static UserInfo m_UserInfo;

	@PostConstruct 
	public void init(){
		m_UserInfo=this;
		m_UserInfo.dictionaryService=this.dictionaryService;
	}

	private int ID = 0;
	public int getID(){
		return this.ID;
	}
	public void setID(int value){
		this.ID = value;
	}

	private String UserCode = "";
	public String getUserCode(){
		return this.UserCode;
	}
	public void setUserCode(String value){
		this.UserCode = value;
	}

	private String UserName = "";
	public String getUserName(){
		return this.UserName;
	}
	public void setUserName(String value){
		this.UserName = value;
	}

	private String UserPwd = "";
	public String getUserPwd(){
		return this.UserPwd;
	}
	public void setUserPwd(String value){
		this.UserPwd = value;
	}

	private int Sex = 0;
	public int getSex(){
		return this.Sex;
	}
	public void setSex(int value){
		this.Sex = value;
	}

	private java.util.Date Birthday = new java.util.Date();
	public java.util.Date getBirthday(){
		return this.Birthday;
	}
	public void setBirthday(java.util.Date value){
		this.Birthday = value;
	}

	private String Phone = "";
	public String getPhone(){
		return this.Phone;
	}
	public void setPhone(String value){
		this.Phone = value;
	}

	private String UserLevel = "";
	public String getUserLevel(){
		return this.UserLevel;
	}
	public void setUserLevel(String value){
		this.UserLevel = value;
	}

	private int IsDelete = 0;
	public int getIsDelete(){
		return this.IsDelete;
	}
	public void setIsDelete(int value){
		this.IsDelete = value;
	}

	private String OpenId = "";
	public String getOpenId(){
		return this.OpenId;
	}
	public void setOpenId(String value){
		this.OpenId = value;
	}

}

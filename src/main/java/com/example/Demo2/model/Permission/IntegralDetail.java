package com.example.Demo2.model.Permission;

import java.io.Serializable;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.example.Demo2.service.DictionaryService;
import com.example.Demo2.model.DictionaryItem;

@Component
public class IntegralDetail implements Serializable {
	@Autowired
	private DictionaryService dictionaryService;

	private static IntegralDetail m_IntegralDetail;

	@PostConstruct 
	public void init(){
		m_IntegralDetail=this;
		m_IntegralDetail.dictionaryService=this.dictionaryService;
	}

	private int ID = 0;
	public int getID(){
		return this.ID;
	}
	public void setID(int value){
		this.ID = value;
	}

	private int UserID = 0;
	public int getUserID(){
		return this.UserID;
	}
	public void setUserID(int value){
		this.UserID = value;
	}

	private int Type = 0;
	public int getType(){
		return this.Type;
	}
	public void setType(int value){
		this.Type = value;
	}

	private int IsAdd = 0;
	public int getIsAdd(){
		return this.IsAdd;
	}
	public void setIsAdd(int value){
		this.IsAdd = value;
	}

	private int AddValue = 0;
	public int getAddValue(){
		return this.AddValue;
	}
	public void setAddValue(int value){
		this.AddValue = value;
	}

	private String Description = "";
	public String getDescription(){
		return this.Description;
	}
	public void setDescription(String value){
		this.Description = value;
	}

	private int IsDelete = 0;
	public int getIsDelete(){
		return this.IsDelete;
	}
	public void setIsDelete(int value){
		this.IsDelete = value;
	}

	private String Operator = "";
	public String getOperator(){
		return this.Operator;
	}
	public void setOperator(String value){
		this.Operator = value;
	}

	private java.util.Date OperateDate = new java.util.Date();
	public java.util.Date getOperateDate(){
		return this.OperateDate;
	}
	public void setOperateDate(java.util.Date value){
		this.OperateDate = value;
	}

	private java.util.Date CreateDate = new java.util.Date();
	public java.util.Date getCreateDate(){
		return this.CreateDate;
	}
	public void setCreateDate(java.util.Date value){
		this.CreateDate = value;
	}

	private String SourceTag = "";
	public String getSourceTag(){
		return this.SourceTag;
	}
	public void setSourceTag(String value){
		this.SourceTag = value;
	}

	private int IntegralTotal = 0;
	public int getIntegralTotal(){
		return this.IntegralTotal;
	}
	public void setIntegralTotal(int value){
		this.IntegralTotal = value;
	}

}

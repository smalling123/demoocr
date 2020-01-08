package com.example.Demo2.model.Permission;

import java.io.Serializable;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.example.Demo2.service.DictionaryService;
import com.example.Demo2.model.DictionaryItem;

@Component
public class RechargeDetail implements Serializable {
	@Autowired
	private DictionaryService dictionaryService;

	private static RechargeDetail m_RechargeDetail;

	@PostConstruct 
	public void init(){
		m_RechargeDetail=this;
		m_RechargeDetail.dictionaryService=this.dictionaryService;
	}

	private Integer ID = 0;
	public int getID(){
		return this.ID;
	}
	public void setID(int value){
		this.ID = value;
	}

	private Integer UserID = 0;
	public int getUserID(){
		return this.UserID;
	}
	public void setUserID(int value){
		this.UserID = value;
	}

	private double Balance = 0.0;
	public double getBalance(){
		return this.Balance;
	}
	public void setBalance(double value){
		this.Balance = value;
	}

	private Integer AddValue = 0;
	public Integer getAddValue(){
		return this.AddValue;
	}
	public void setAddValue(int value){
		this.AddValue = value;
	}

	private Integer IsAdd = 0;
	public int getIsAdd(){
		return this.IsAdd;
	}
	public void setIsAdd(int value){
		this.IsAdd = value;
	}

	private String Description = "";
	public String getDescription(){
		return this.Description;
	}
	public void setDescription(String value){
		this.Description = value;
	}

	private Integer IsDelete = 0;
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

	private String Tag = "";
	public String getTag(){
		return this.Tag;
	}
	public void setTag(String value){
		this.Tag = value;
	}

	private Integer IsEffective = 0;
	public int getIsEffective(){
		return this.IsEffective;
	}
	public void setIsEffective(int value){
		this.IsEffective = value;
	}

	private Integer IsSuccess = 0;
	public int getIsSuccess(){
		return this.IsSuccess;
	}
	public void setIsSuccess(int value){
		this.IsSuccess = value;
	}

	private Integer Type = 0;
	public int getType(){
		return this.Type;
	}
	public void setType(int value){
		this.Type = value;
	}

	private String SourceTag = "";
	public String getSourceTag(){
		return this.SourceTag;
	}
	public void setSourceTag(String value){
		this.SourceTag = value;
	}

	private String SValue = "";
	public String getSValue(){
		return this.SValue;
	}
	public void setSValue(String value){
		this.SValue = value;
	}

}

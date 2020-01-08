package com.example.Demo2.model.Permission;

import java.io.Serializable;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.example.Demo2.service.DictionaryService;
import com.example.Demo2.model.DictionaryItem;

@Component
public class CouponsInfo implements Serializable {
	@Autowired
	private DictionaryService dictionaryService;

	private static CouponsInfo m_CouponsInfo;

	@PostConstruct 
	public void init(){
		m_CouponsInfo=this;
		m_CouponsInfo.dictionaryService=this.dictionaryService;
	}

	private int ID = 0;
	public int getID(){
		return this.ID;
	}
	public void setID(int value){
		this.ID = value;
	}

	private int CouponCode = 0;
	public int getCouponCode(){
		return this.CouponCode;
	}
	public void setCouponCode(int value){
		this.CouponCode = value;
	}

	private String CouponsName = "";
	public String getCouponsName(){
		return this.CouponsName;
	}
	public void setCouponsName(String value){
		this.CouponsName = value;
	}

	private String Description = "";
	public String getDescription(){
		return this.Description;
	}
	public void setDescription(String value){
		this.Description = value;
	}

	private int EffectiveDay = 0;
	public int getEffectiveDay(){
		return this.EffectiveDay;
	}
	public void setEffectiveDay(int value){
		this.EffectiveDay = value;
	}

	private double CouponValue = 0.0;
	public double getCouponValue(){
		return this.CouponValue;
	}
	public void setCouponValue(double value){
		this.CouponValue = value;
	}

	private double NeedValue = 0.0;
	public double getNeedValue(){
		return this.NeedValue;
	}
	public void setNeedValue(double value){
		this.NeedValue = value;
	}

	private int TotalNum = 0;
	public int getTotalNum(){
		return this.TotalNum;
	}
	public void setTotalNum(int value){
		this.TotalNum = value;
	}

	private int IsDelete = 0;
	public int getIsDelete(){
		return this.IsDelete;
	}
	public void setIsDelete(int value){
		this.IsDelete = value;
	}

	private int IsLimitNum = 0;
	public int getIsLimitNum(){
		return this.IsLimitNum;
	}
	public void setIsLimitNum(int value){
		this.IsLimitNum = value;
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

}

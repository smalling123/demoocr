package com.example.Demo2.model.Permission;

import java.io.Serializable;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.example.Demo2.service.DictionaryService;
import com.example.Demo2.model.DictionaryItem;

@Component
public class CouponsDetail implements Serializable {
	@Autowired
	private DictionaryService dictionaryService;

	private static CouponsDetail m_CouponsDetail;

	@PostConstruct 
	public void init(){
		m_CouponsDetail=this;
		m_CouponsDetail.dictionaryService=this.dictionaryService;
	}

	private int ID = 0;
	public int getID(){
		return this.ID;
	}
	public void setID(int value){
		this.ID = value;
	}

	private int CouponID = 0;
	public int getCouponID(){
		return this.CouponID;
	}
	public void setCouponID(int value){
		this.CouponID = value;
	}

	private String Field1 = "";
	public String getField1(){
		return this.Field1;
	}
	public void setField1(String value){
		this.Field1 = value;
	}

	private int UserID = 0;
	public int getUserID(){
		return this.UserID;
	}
	public void setUserID(int value){
		this.UserID = value;
	}

	private java.util.Date UseSDate = new java.util.Date();
	//可用开始时间
	public java.util.Date getUseSDate(){
		return this.UseSDate;
	}
	public void setUseSDate(java.util.Date value){
		this.UseSDate = value;
	}

	private java.util.Date UseEDate = new java.util.Date();
	//可用结束时间
	public java.util.Date getUseEDate(){
		return this.UseEDate;
	}
	public void setUseEDate(java.util.Date value){
		this.UseEDate = value;
	}

	private double CouponValue = 0.0;
	//优惠券金额
	public double getCouponValue(){
		return this.CouponValue;
	}
	public void setCouponValue(double value){
		this.CouponValue = value;
	}

	private double NeedValue = 0.0;
	//需要购买一定金额以上可用，比如慢100可用
	public double getNeedValue(){
		return this.NeedValue;
	}
	public void setNeedValue(double value){
		this.NeedValue = value;
	}

	private int CouponState = 0;
	public int getCouponState(){
		return this.CouponState;
	}
	public void setCouponState(int value){
		this.CouponState = value;
	}

	private int IsDelete = 0;
	public int getIsDelete(){
		return this.IsDelete;
	}
	public void setIsDelete(int value){
		this.IsDelete = value;
	}

	private java.util.Date OperateData = new java.util.Date();
	public java.util.Date getOperateData(){
		return this.OperateData;
	}
	public void setOperateData(java.util.Date value){
		this.OperateData = value;
	}

	private java.util.Date CreateDate = new java.util.Date();
	public java.util.Date getCreateDate(){
		return this.CreateDate;
	}
	public void setCreateDate(java.util.Date value){
		this.CreateDate = value;
	}

	private String Operator = "";
	public String getOperator(){
		return this.Operator;
	}
	public void setOperator(String value){
		this.Operator = value;
	}

}

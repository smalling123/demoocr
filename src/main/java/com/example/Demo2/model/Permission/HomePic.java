package com.example.Demo2.model.Permission;

import java.io.Serializable;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.example.Demo2.service.DictionaryService;
import com.example.Demo2.model.DictionaryItem;

@Component
public class HomePic implements Serializable {
	@Autowired
	private DictionaryService dictionaryService;

	private static HomePic m_HomePic;

	@PostConstruct 
	public void init(){
		m_HomePic=this;
		m_HomePic.dictionaryService=this.dictionaryService;
	}

	private int ID = 0;
	public int getID(){
		return this.ID;
	}
	public void setID(int value){
		this.ID = value;
	}

	private int PicName = 0;
	public int getPicName(){
		return this.PicName;
	}
	public void setPicName(int value){
		this.PicName = value;
	}

	private String PicUrl = "";
	public String getPicUrl(){
		return this.PicUrl;
	}
	public void setPicUrl(String value){
		this.PicUrl = value;
	}

	private int IsShow = 0;
	public int getIsShow(){
		return this.IsShow;
	}
	public void setIsShow(int value){
		this.IsShow = value;
	}

	private int SortLevel = 0;
	public int getSortLevel(){
		return this.SortLevel;
	}
	public void setSortLevel(int value){
		this.SortLevel = value;
	}

	private String Titles = "";
	public String getTitles(){
		return this.Titles;
	}
	public void setTitles(String value){
		this.Titles = value;
	}

	private String Tag = "";
	//标签
	public String getTag(){
		return this.Tag;
	}
	public void setTag(String value){
		this.Tag = value;
	}

	private String Content = "";
	public String getContent(){
		return this.Content;
	}
	public void setContent(String value){
		this.Content = value;
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

}

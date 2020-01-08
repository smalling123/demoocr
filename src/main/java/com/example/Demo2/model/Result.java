package com.example.Demo2.model;

import java.io.Serializable;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.example.Demo2.service.DictionaryService;
import com.example.Demo2.model.DictionaryItem;

@Component
public class Result implements Serializable {
	@Autowired
	private DictionaryService dictionaryService;

	private static Result m_Result;

	@PostConstruct 
	public void init(){
		m_Result=this;
		m_Result.dictionaryService=this.dictionaryService;
	}

	private int Code = 0;
	public int getCode(){
		return this.Code;
	}
	public void setCode(int value){
		this.Code = value;
	}

	private String Msg = "";
	public String getMsg(){
		return this.Msg;
	}
	public void setMsg(String value){
		this.Msg = value;
	}

	private String Token = "";
	public String getToken(){
		return this.Token;
	}
	public void setToken(String value){
		this.Token = value;
	}

	private Object Data = null;
	public Object getData(String sValue){
		return this.Data;
	}
	public void setData(Object value){
		this.Data = value;
	}

	private int PageNumber = 0;
	public int getPageNumber(){
		return this.PageNumber;
	}
	public void setPageNumber(int value){
		this.PageNumber = value;
	}

	private int PageSize = 0;
	public int getPageSize(){
		return this.PageSize;
	}
	public void setPageSize(int value){
		this.PageSize = value;
	}

	private int RecordCount = 0;
	public int getRecordCount(){
		return this.RecordCount;
	}
	public void setRecordCount(int value){
		this.RecordCount = value;
	}

}

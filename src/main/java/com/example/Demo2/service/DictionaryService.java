package com.example.Demo2.service;


import java.util.List;
import java.util.ArrayList;
import com.example.Demo2.model.DictionaryItem;

public interface DictionaryService{
	public List<DictionaryItem> getDictionaryItems(String dictionary, String filter);

	public String convertDictionary(String dictionary, String code);

}

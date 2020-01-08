package com.example.Demo2.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import java.util.List;
import java.util.ArrayList;
import com.example.Demo2.model.DictionaryItem;
import com.example.Demo2.mapper.DictionaryMapper;
@Service("dictionaryService")
public class DictionaryServiceImpl implements DictionaryService{
	@Autowired
	private DictionaryMapper m_DictionaryMapper;
	@Cacheable(value = { "getDictionaryItems" },key="#dictionary+'-'+#filter")
	public List<DictionaryItem> getDictionaryItems(String dictionary, String filter){
		return new ArrayList<DictionaryItem>();
	}
	@Cacheable(value = { "convertDictionary" },key="#dictionary+'-'+#code")
	public String convertDictionary(String dictionary, String code){
		DictionaryItem result = new DictionaryItem();
		return result==null ? "" : result.getName();
	}

}

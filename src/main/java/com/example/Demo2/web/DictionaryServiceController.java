package com.example.Demo2.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Demo2.service.DictionaryService;
import java.util.List;
import java.util.ArrayList;
import com.example.Demo2.model.DictionaryItem;

@RestController
public class DictionaryServiceController{
	@Autowired
	private DictionaryService dictionaryService;

	@RequestMapping(value = "/getDictionaryItems")
	public List<DictionaryItem> getDictionaryItems(String dictionary, String filter){
		return dictionaryService.getDictionaryItems(dictionary, filter);
	}

	@RequestMapping(value = "/convertDictionary")
	public String convertDictionary(String dictionary, String code){
		return dictionaryService.convertDictionary(dictionary, code);
	}

}

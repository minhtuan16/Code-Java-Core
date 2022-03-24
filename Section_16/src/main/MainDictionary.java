package main;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import model.Dictionary;
import service.MapDictionaryService;
import service.MapDictionaryServiceIMPL;

public class MainDictionary {

	public static void main(String[] args) {
		
		MapDictionaryService mapDictionaryService = new MapDictionaryServiceIMPL();
		
		Map<String, Dictionary> map = mapDictionaryService.input();
		mapDictionaryService.info(map);
		mapDictionaryService.filter(map);
		mapDictionaryService.delete(map);
	}	
}

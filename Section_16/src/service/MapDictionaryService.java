package service;

import java.util.Map;

import model.Dictionary;

public interface MapDictionaryService {

	Map<String , Dictionary> input();
	
	void info(Map<String , Dictionary> map);

	void filter(Map<String, Dictionary> mapFilter);
	
	void delete(Map<String, Dictionary> mapDelete);
}

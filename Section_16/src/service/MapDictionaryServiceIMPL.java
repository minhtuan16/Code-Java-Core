package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import model.Dictionary;

public class MapDictionaryServiceIMPL implements MapDictionaryService{
	DictionaryService dictionaryService = new DictionaryServiceIMPL();
	@Override
	public Map<String, Dictionary> input() {
		Map<String, Dictionary> map = new HashMap<String, Dictionary>();
	
		while(true) {
			System.out.println("Nhap Dictionary: ");
			
			Dictionary dic = new Dictionary();
			dictionaryService.input(dic);
			
			map.put(dic.getKeyWord(), dic);
			
			System.out.println("Thoat an 1 !");
			int n = new Scanner(System.in).nextInt();
			
			if(n == 1) {
				break;
			}
			
		}
		return map;
	}

	@Override
	public void info(Map<String, Dictionary> map) {
		for(Entry<String, Dictionary> entry : map.entrySet()) {
			dictionaryService.info(entry.getValue());
		}
		
	}

	@Override
	public void filter(Map<String, Dictionary> mapFilter) {

		System.out.println("Nhap keyword muon tim: ");
		String a = new Scanner(System.in).nextLine();
		
		Dictionary dictionary = mapFilter.get(a);
		
		if(dictionary != null) {
			System.out.println("Danh sach tim kiem: ");
			dictionaryService.info(dictionary);
		} else {
			System.out.println("Khong tim thay !");
		}
	}

	@Override
	public void delete(Map<String, Dictionary> mapDelete) {

		System.out.println("Nhap keyword muon xoa: ");
		String s = new Scanner(System.in).nextLine();
		
		mapDelete.remove(s);
		
		System.out.println("Danh sach sau khi xoa: ");
		info(mapDelete);
	}



	

}

package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		
		Map<String ,List<Music>> map = new HashMap<>();
		map.put("발라드", new ArrayList<>());
		map.get("발라드").add(0,new Music("내 첫사랑","베리굿"));
		map.get("발라드").add(1,new Music("또 다시 사랑","임창정"));
		map.get("발라드").add(2,new Music("부산에 가면","박진영"));
		map.put("댄스", new ArrayList<>());
		map.get("댄스").add(0,new Music("커피","유재환,김예림"));
		map.get("댄스").add(1,new Music("다 잘될거야","쿨"));
	
		System.out.println("--<<멜론 장르별 차트>>--");
		printList(map);
		
		map.get("발라드").set(2,new Music("지우고 지워도","차수경"));
		
		System.out.println("--<<발라드 3위 곡 변경>>--");
		printList(map);
		
		map.get("발라드").remove(0);
		
		System.out.println("--<<3위 곡 번경>>--");
		printList(map);
		
		map.clear();
		
		System.out.println("--<<전체 리스트 삭제>>--");
		printList(map);
		
	}
	
	public static void printList(Map<String, List<Music>> map) {
		int num = 0;
		for(String key : map.keySet()) {
			System.out.println("["+key+"]");
			num = 1;
			for(Music m : map.get(key)) {
				System.out.println(num +". " +  m.toString());
				num++;
			}
		}
	}
	
}

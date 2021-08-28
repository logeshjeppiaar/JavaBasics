package com.logesh.mapTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		List<Map<String, Object>> list = new ArrayList<>();

		Map<String, Object> map1 = new HashMap<>();
		map1.put("abc", 123);
		map1.put("def", "SED");

		Map<String, Object> map12 = new HashMap<>();
		map12.put("abc", 645);
		map12.put("def", 66523);

		Map<String, Object> map13 = new HashMap<>();
		map13.put("abc", "sdfj");
		map13.put("def", 5344147);

		list.add(map1);
		list.add(map12);
		list.add(map13);

		System.out.println(list);

		String mx = list.stream().map(i -> i.get("def").toString()).max(Comparator.comparing(String::valueOf)).get();
		;
		System.out.println(mx);

	}

}

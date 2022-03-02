package array1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Array3 {
	public static void main(String[] args) {
		String[] names = { "山田", "田中", "横山", "山田", "佐藤", "鈴木", "加藤", "田中", "山田" };

		String[] keywords = {"山", "田"};
		int[] counter = new int[keywords.length];
		for (int i = 0; i < counter.length; i++) {
			counter[i] = 0;
		}

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < keywords.length; j++) {
				if (names[i].contains(keywords[j])) {
					counter[j]++;
					break;
				}
			}
		}


		for (int i = 0; i < counter.length; i++) {
			System.out.println(counter[i]);
		}

		/////////////////////////////////////////////////////////////////////////////
		Character[] keywords2 = {'山', '田', '藤' };
		Map<Character, Integer> counter2 = new LinkedHashMap<>();
		for (Character kw: keywords2) {
			counter2.put(kw, 0);
		}
		for (String name: names) {
			for (int i = 0; i < name.length(); i++) {
				if (counter2.containsKey(name.charAt(i))) {
					counter2.put(name.charAt(i), counter2.get(name.charAt(i)) + 1);
					break;
				}
			}
		}
		for (Character c: counter2.keySet()) {
			System.out.println(c + ":" + counter2.get(c));
		}

	}
}

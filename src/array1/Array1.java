package array1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		String[] names = { "山田", "田中", "横山", "山田", "佐藤", "鈴木", "加藤", "田中", "山田" };

		Map<String, Integer> nameCounter = new LinkedHashMap<>();

		for (String n: names) {
			if (nameCounter.containsKey(n)) {
				nameCounter.put(n, nameCounter.get(n) + 1);
			} else {
				nameCounter.put(n, 1);
			}
		}

		for (String n: nameCounter.keySet()) {
			System.out.println(n + ":" + nameCounter.get(n) + "人");
		}


		System.out.println("---< for文 >---");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("---< 拡張for文 >---");
		for (String name: names) {
			System.out.println(name);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("名前: ");
		String name = sc.next();
		for (String n: names) {
			if (n.equals(name)) {
				System.out.println(name + "さんは存在します。");
				break;
			}
		}
		List<String> names2 = List.of("山田", "田中", "横山", "山田", "佐藤", "鈴木", "加藤", "田中");
		if (names2.contains(name)) {
			System.out.println(name + "さんは存在します。");
		}
		if (names2.indexOf(name) > -1) {
			System.out.println(name + "さんは存在します。");
		}

		int counter = 0;
		for (String n: names) {
			if (n.equals(name)) {
				counter++;
			}
		}
		System.out.println(name + "さんは" + counter + "人います。");
	}
}

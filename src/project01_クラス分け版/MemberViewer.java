package project01_クラス分け版;

import java.util.Map;

public class MemberViewer {
		
	public static void view(Map<Integer,Member> memberMap,int id) {
		System.out.println("名前: " + memberMap.get(id).getName());
		System.out.println("ID: " + id);
		System.out.println("郵便番号: " + memberMap.get(id).getPostCode());
		System.out.println("住所: " + memberMap.get(id).getAddress());
		System.out.println("生年月日: " + memberMap.get(id).getBirthDay());
	}
}

package project01_クラス分け版;

import java.util.Map;

public class MemberSearch {
	
	public static void searchMember(Map<Integer,Member> memberMap,int targetId) {
		if(memberMap.containsKey(targetId)) {
			System.out.println("検索した会員が見つかりました");
			Member memberTarget = memberMap.get(targetId);
			System.out.println("名前:" + memberTarget.getName());
			System.out.println("id:" + memberTarget.getId());
			System.out.println("郵便番号:" + memberTarget.getPostCode());
			System.out.println("住所:" + memberTarget.getAddress());
			System.out.println("生年月日:" + memberTarget.getBirthDay());		
		}else {
			System.out.println("検索した会員情報は見つかりませんでした");
		}		
	}
}

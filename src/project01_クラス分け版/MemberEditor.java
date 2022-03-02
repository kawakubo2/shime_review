package project01_クラス分け版;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberEditor {
	Map<Integer, String> menuMap = new HashMap<>();
	{
		menuMap.put(1, "name");
		menuMap.put(2, "address");
		menuMap.put(3, "postCode");
		menuMap.put(4, "birthDay");
	}
	Map<String, String> promptMap = new HashMap<>();
	{
		promptMap.put("name", "名前");
		promptMap.put("address", "住所");
		promptMap.put("postCode", "郵便番号");
		promptMap.put("birthDay", "誕生日");
	}
	Map<String, String> fieldTypeMap = new HashMap<>();
	{
		fieldTypeMap.put("name", "String");
		fieldTypeMap.put("address", "String");
		fieldTypeMap.put("postCode", "String");
		fieldTypeMap.put("birthDay", "String");
	}
	public void editMemberValue(Map<Integer,Member> memberMap,int idEdit, int editNum)
		throws IllegalArgumentException {
		String fieldName = menuMap.get(editNum);
		if (!promptMap.containsKey(fieldName)) {
			throw new IllegalArgumentException("フィールド名が不正です。");
		}
		Scanner sc = new Scanner(System.in);

		if(memberMap.containsKey(idEdit)) {
				System.out.printf("%1$sを編集します、変更したい%1$sを入力してください: ", promptMap.get(fieldName));
				String newValue = sc.nextLine();//sc.nextLine()で書いたら上手く機能しなかったけどsc.next()なら大丈夫だった
				Member member =  memberMap.get(idEdit);

				//編集内容の確認
				int replyEditName;
				do {
					System.out.println("編集は下記の通りでよろしいですか？　yes...1 no...9");
					System.out.println("編集前:" + getCurrentValue(member, fieldName) + "\t編集後:" + newValue);
					replyEditName = sc.nextInt();
					if(replyEditName==9) {
						System.out.println("編集を中止します");
						break;
					}
					if(replyEditName == 1) {
						setNewValue(member, fieldName, newValue);
						memberMap.put(idEdit, member);
						System.out.printf("%sを編集しました 編集後の会員情報は下記のとおりです\n", promptMap.get(fieldName));
						MemberViewer.view(memberMap,idEdit);

						//File入力作業
						MemberCollectionFileFactory.writeMembers(memberMap);
					}
				}while(replyEditName != 1 && replyEditName != 9);
		}else {
			System.out.println("指定したidの会員は存在しません");
		}
	}
	private String getCurrentValue(Member member, String fieldName) {
		String result = "";
		switch (fieldName) {
		case "name":
			result = member.getName();
			break;
		case "address":
			result = member.getAddress();
			break;
		case "postCode":
			result = member.getPostCode();
			break;
		case "birthDay":
			result = member.getBirthDay();
			break;
		}
		return result;
	}
	private void setNewValue(Member member, String fieldName, String value) {
		switch (fieldName) {
		case "name":
			member.setName(value);
			break;
		case "address":
			member.setAddress(value);
			break;
		case "postCode":
			member.setPostCode(value);
			break;
		case "birthDay":
			member.setBirthDay(value);
			break;
		}
	}
}

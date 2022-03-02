package project01_クラス分け版;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MemberEdit {
	static Set<Integer> editNumSet = new HashSet<>();
	static {
		editNumSet.add(1);
		editNumSet.add(2);
		editNumSet.add(3);
		editNumSet.add(4);
		editNumSet.add(9);
	}

	public static void editMember(Map<Integer,Member> memberMap,int idEdit,int editNum) {
			MemberEditor editor = new MemberEditor();
			if(memberMap.containsKey(idEdit)) {
				if (!editNumSet.contains(editNum)) {
					System.out.println("1, 2, 3, 4, 9から選択してください。");
				} else {
					editor.editMemberValue(memberMap, idEdit, editNum);
				}
			}else {
				System.out.println("入力したidの会員情報はありませんでした、やり直してください");
			}
	}
}



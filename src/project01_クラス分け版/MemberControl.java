package project01_クラス分け版;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberControl {

	public static void main(String[] args) {
		Map<Integer,Member> memberMap = new LinkedHashMap<Integer,Member>();
		
		Scanner sc = new Scanner(System.in);
		String answer = null;
		int count = 0;
		
		memberMap = MemberCollectionFileFactory.readMembers();
		
		outer:
		while(true) {
			System.out.println("数字を選んでください");
			System.out.println("1.追加 2.検索　3.編集　9.終了");
			answer = sc.nextLine();
			if(answer.equals("9")) {
				System.out.println("終了します");
				break;
			}

			switch(answer) {
			case "1":
					//会員登録
					Member memberRegister = MemberRegister.register(memberMap);					
					System.out.println("登録を完了しました");
					memberMap.put(memberRegister.getId(), memberRegister);
					MemberViewer.view(memberMap,memberRegister.getId());
					
					//File入力作業				
					MemberCollectionFileFactory.writeMembers(memberMap);
					break;
				
			case "2":
					System.out.println("検索を始めます");
					System.out.println("検索したい会員のidを入力してください");
					int targetId = sc.nextInt();
					//検索処理
					MemberSearch.searchMember(memberMap, targetId);				
					
					break;
			case "3":
					System.out.println("編集を始めます");
					
					System.out.println("編集したい番号を選んでください");
					System.out.println("1.名前 2.住所 3.郵便番号 4.生年月日 9.取り消し");
					int editNum = sc.nextInt();
					if(editNum == 9) {
						System.out.println("編集を注します");
						break;
					}
					
					System.out.println("編集したい会員のid番号を入力してください");
					int idEdit = sc.nextInt();
					
					MemberEdit.editMember(memberMap, idEdit, editNum);
					break;
			}			
		}
	}
	/**
	 * 
	 * 
	 * case "3":
					System.out.println("編集を始めます");
					System.out.println("編集したい会員のid番号を入力してください");
					int idEdit = sc.nextInt();
					
					//MemberEdit02.edit(memberMap,idEdit,editMenuMap)
					
					if(memberMap.containsKey(idEdit)) {
						System.out.println("編集したい番号を選んでください");
						System.out.println("1.名前 2.住所 3.郵便番号 4.生年月日 9.取り消し");
						int editNum = sc.nextInt();
						if(editNum == 1) {
							//名前変更
							MemberEdit.editMemberName(memberMap, idEdit);		
						}else if(editNum == 2) {
							//住所変更
							MemberEdit.editMemberAddress(memberMap, idEdit);		
						}else if(editNum == 3) {
							//郵便番号変更
							MemberEdit.editMemberPostCode(memberMap, idEdit);
						}else if(editNum == 4) {
							//誕生日変更
							MemberEdit.editMemberBirthDay(memberMap, idEdit);
						}else if(editNum == 9) {
							System.out.println("編集作業を取り消します");
							continue outer;
						}
					}else {
						System.out.println("入力したidの会員情報はありませんでした、やり直してください");
						continue outer;
					}
					break;
			}			
		}
	 * 
	 * 
					System.out.println("編集したい会員のid番号を入力してください");
					int idEdit = sc.nextInt();
					
					if(memberMap.containsKey(idEdit)) {
						System.out.println("編集したい番号を選んでください");
						System.out.println("1.名前 2.住所 3.郵便番号 4.生年月日 9.取り消し");
						int editNum = sc.nextInt();
						if(editNum == 1) {
							//名前変更
							MemberEdit.editMemberName(memberMap, idEdit);		
						}else if(editNum == 2) {
							//住所変更
							MemberEdit.editMemberAddress(memberMap, idEdit);		
						}else if(editNum == 3) {
							//郵便番号変更
							MemberEdit.editMemberPostCode(memberMap, idEdit);
						}else if(editNum == 4) {
							//誕生日変更
							MemberEdit.editMemberBirthDay(memberMap, idEdit);
						}else if(editNum == 9) {
							System.out.println("編集作業を取り消します");
							continue outer;
						}
					}else {
						System.out.println("入力したidの会員情報はありませんでした、やり直してください");
						continue outer;
					}
					break;
	 * 
	 */
}

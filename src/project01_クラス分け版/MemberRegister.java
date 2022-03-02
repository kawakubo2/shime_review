package project01_クラス分け版;

import java.util.Map;
import java.util.Scanner;

public class MemberRegister {
		
	public static Member register(Map<Integer,Member> memberMap) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("会員を追加します");
		Member member = new Member();
		
		outer:
		while(true) {
			//名前追加
			String name;
			System.out.println("名前を入力してください");
			name = sc.nextLine();
			
			//住所追加
			String address;
			System.out.println("住所を入力してください");
			address = sc.nextLine();
			
			//郵便番号追加
			String postCode;
			System.out.println("郵便番号を入力してください");
			postCode = sc.nextLine();
			
			//生年月日追加
			String birthDay;
			System.out.println("生年月日を入力してください");
			birthDay = sc.nextLine();				
			
			int reply;
			do {
				System.out.println("追加を下記の通りでよろしいですか？　yes...1 no...9");
				reply = sc.nextInt();
				if(reply==9) {
					System.out.println("会員登録をやり直します");
					continue outer;
				}
			}while(reply==9);
			
			int count = CountID.countID(memberMap);
			count ++;
			int id = count;
			Member memberRegister = new Member(name,id,birthDay,address,postCode);
			return memberRegister;
		}
	}
	
}

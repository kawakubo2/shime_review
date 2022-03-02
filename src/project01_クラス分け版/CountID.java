package project01_クラス分け版;

import java.util.Map;

public class CountID {
	public static int countID(Map<Integer,Member> memberMap) {
		int count = memberMap.size();
		return count;
	}
}

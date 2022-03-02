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


public class MemberCollectionFileFactory {
	
	public static Map<Integer,Member> readMembers(){
		Map<Integer,Member> memberMap = new LinkedHashMap<Integer, Member>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("member.txt"))){
			String s;
			while((s = br.readLine()) != null){
				String[] str = s.split(",");
				memberMap.put(Integer.parseInt(str[1]), new Member(str[0],Integer.parseInt(str[1]),str[2],str[3],str[4]));
			}
		}catch(FileNotFoundException e) {
			System.out.println("fileを開けませんでした");
		}catch(IOException e) {
			e.printStackTrace();
		}
		return memberMap;
	}
	
	public static void writeMembers(Map<Integer, Member> memberMap) {
		
		try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("member.txt")))){
			for(Integer pwid : memberMap.keySet()) {
				pw.println((memberMap.get(pwid)).getName() + "," + pwid + "," + (memberMap.get(pwid)).getBirthDay() + "," + (memberMap.get(pwid)).getAddress() + "," + (memberMap.get(pwid)).getPostCode());
				
			}			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}

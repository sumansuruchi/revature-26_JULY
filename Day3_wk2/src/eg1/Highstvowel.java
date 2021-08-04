package eg1;
import java.util.*;



public class Highstvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
		System.out.println("\nTask1\n");
		System.out.println("Map with vowel count : " +arrangeTheVowels(s));
		System.out.println("\nTask2\n");
		System.out.println("Map with vowel count : " +arrangeUniqueVowels(s));
	}
	
	
	public static String arrangeTheVowels(String s) {
		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

		String[] str = s.split(" ");
		
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			count = 0;
			for (int j = 0; j < str[i].length(); j++) {
				if(str[i].charAt(j)=='a' || str[i].charAt(j)=='e' || str[i].charAt(j)=='i'|| str[i].charAt(j)=='o' || str[i].charAt(j)=='e') {
					count++;
				}
			}
			if(map.containsKey(count)) {
				String temp = map.get(count);
				String rev = new StringBuilder(str[i]).reverse().toString();
				temp = temp + " " + rev;
				map.put(count, temp);
			} else {
				map.put(count, str[i]);
			}
		}
		
		System.out.println("Map with vowel count : "+map);
		
		StringBuilder sb = new StringBuilder();
		for(String e: map.values()) {
			sb.append(e).append(" ");
		}
		
		return sb.toString();
	}
	
	public static String arrangeUniqueVowels(String s) {
		Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		Set<Character> set = new HashSet<>();
		
		String[] str = s.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			set.clear();
			for (int j = 0; j < str[i].length(); j++) {
				if(str[i].charAt(j)=='a' || str[i].charAt(j)=='e' || str[i].charAt(j)=='i'|| str[i].charAt(j)=='o' || str[i].charAt(j)=='e') {
					set.add(str[i].charAt(j));
				} 
			}
			if(map.containsKey(set.size())) {
				String temp = map.get(set.size());
				temp = temp + " " + str[i];
				map.put(set.size(), temp);
			} else {
				map.put(set.size(), str[i]);
			}
		}
		
		System.out.println("Map with vowel count :  "+map);
		StringBuilder sb = new StringBuilder();
		for(String e: map.values()) {
			sb.append(e).append(" ");
		}
		return sb.toString();
	}



	}



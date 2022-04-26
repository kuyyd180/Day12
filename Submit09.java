package dallhyun.submit09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

public class Submit09 {

	public static void main(String[] args) {
		System.out.println("\n================1-1번 문제==============\n");
		// 1번 문제
		
		ArrayList<Integer> intList = new ArrayList<>();
		for(int i = 1; i <= 10; i++) {
			int randInt = (int)(Math.random()* 20) +10;
			intList.add(randInt);
		}
		
		System.out.println("\n================1-2번 문제==============\n");
		// 2번 문제
		System.out.println(intList);
		
		System.out.println("\n================1-3번 문제==============\n");
		// 3번 문제

		
		HashSet<Integer> temp = new HashSet(intList);       // List를 Set으로 변경
        ArrayList<Integer> result = new ArrayList<>(temp);  // Set을 다시 List로 변경
        System.out.println(result);

		System.out.println("\n================1-4번 문제==============\n");
		// 4번 문제
		TreeSet<Integer> intListRe = new TreeSet<Integer>(intList);
		System.out.println(intListRe);
		
		System.out.println("\n================1-5번 문제==============\n");
		// 5번 문제
		
		Collections.sort(result,Collections.reverseOrder());
		System.out.println(result);
		
		System.out.println("\n================2-1번 문제==============\n");
		
		ArrayList<String> Wife = new ArrayList<String>();
		Wife.add("냉장고");
		Wife.add("세탁기");
		Wife.add("에어컨");
		System.out.println(Wife);
		
		ArrayList<String> Husband = new ArrayList<String>();
		Husband.add("노트북");
		Husband.add("TV");
		Husband.add("에어컨");
		System.out.println(Husband);
		
//		String[] Wife = {"냉장고", "세탁기", "에어컨"};
//		System.out.println(Arrays.toString(Wife));
//		
//		String[] Husband = {"노트북", "TV", "에어컨"};
//		System.out.println(Arrays.toString(Husband));
		
		System.out.println("\n================2-2번 문제==============\n");
		
		// 합집합
		Wife.addAll(Husband);
//		System.out.println(Wife.toString());
		
		//arrayList 중복제거
		HashSet<String>hash1 = new HashSet<String>();
		hash1.addAll(Wife);
		
		//HashSet 출력
		Iterator iterator = hash1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}




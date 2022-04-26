package ch08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

public class CollectionList {

	public static void main(String[] args) {
		// 리스트(ArrayList)의 선언
		// 1.
		ArrayList<String> students = new ArrayList<String>();
		
		// 2.
		ArrayList<Integer> intList = new ArrayList<>();
		
		// Wrapper class는 기본 타입의 데이터를 객체(참조타입 변수)로 사용해야 하는
		// 경우 사용한다.
		
		int intVal = 12;
		
		// 기본 타입의 데이터를(intVal)
		// Wrapper 클래스의 인스턴스로 변환
		// (= Wrapper 객체로 만들기) 
		// 박싱(boxing)
		Integer num = new Integer(12);
		
		// 오토 박싱(auto boxing)
		Integer autoNum = intVal;
		System.out.println(autoNum);
		
		// Wrapper 클래스 객체에 저장된 값을
		// 기본 타입의 데이터로 꺼내기
		// 언박싱(Unboxing)
		int temp = autoNum.intValue();
		System.out.println(temp);
		
		// 오토 언박싱
		int temp2 = autoNum;
		
		// 한줄 요약
		// 오토 박싱과 언박싱이 되므로, Wrapper Class를 사용하는데 불편함은 없다.
		
		System.out.println("\n======================\n");
		
		
		// ArrayList에 값 담기
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		System.out.println(intList);
		
		students.add("송나겸");
		students.add("남궁혜연");
		students.add("박설리");
		students.add("박승주");
		students.add("가나혜");
		students.add("최윤정");
		
		// 제너릭 <> 타입과 일치하는 데이터만 추가가능
//		students.add(13);
		
		System.out.println(students);
		
		System.out.println("\n===============================\n");
		
		// .size()
		// 리스트의 길이를 리턴
		System.out.println(students.size());
		
		// 값이 들어있지 않으면 size는 0
		ArrayList<String> tempList = new ArrayList<>();
		System.out.println(tempList.size());
		
		// .set(인덱스, 값)
		// 해당 인덱스의 값을 괄호 안 값으로 교체
		students.set(2, "임동성");
		System.out.println(students);
		
		// .contains(값)
		// 리스트 안에 해당 값이 존재하는지 체크
		// 존재하면 true, 없으면 false
		System.out.println(students.contains("송나겸"));
		
		// indexOf(값)
		// 리스트 안에 해당 값이 어디에 존재하는지 체크
		// 존재하면 해당 인덱스 리턴, 없으면 -1 리턴
		System.out.println(students.indexOf("최윤정"));
		System.out.println(students.indexOf("찬웅"));
		// -1 리턴 여부로 contains처럼 사용가능
		
		// .get(인덱스)
		// 해당 인덱스의 값을 리턴
		System.out.println(students.get(2));
		
		// .isEmpty()
		// 리스트가 비어있는지 체크
		// 비어있다면 true, 아니라면 false 리턴
		// .size() == 0와 같다.
		System.out.println(students.isEmpty());
		System.out.println(tempList.isEmpty());
		
		// .remove(인덱스)
		// 해당 인덱스의 데이터를 삭제
		students.remove(2);
		System.out.println(students);
		
		// .remove(값)
		// 리스트에 해당 값이 있으면 삭제
		// 없으면 삭제 안함
		students.remove("송나겸");
		System.out.println(students);
		students.remove("아무말");
		System.out.println(students);
		
		// .clear()
		// 해당 리스트를 비움(size가 0이 됨)
		students.clear();
		System.out.println(students);
		
		// 초기화해도 됨
		intVal = 0;
		students.add("김달현");
		students = new ArrayList<String>();
		System.out.println(students);
		
		System.out.println("\n=====================================\n");
		
		// for문으로 ArrayList 제어
		students.add("송나겸");
		students.add("남궁혜연");
		students.add("박설리");
		students.add("박승주");
		students.add("가나혜");
		students.add("최윤정");
		
		for(int i = 0; i < students.size(); i++) {
			students.set(i, (i+1) + ". " + students.get(i));
		}
		System.out.println(students);
		
		System.out.println("\n=============================\n");
		
		// 리스트 복사
		ArrayList<String> copyList = new ArrayList<String>();
		
		for(int i = 0; i < students.size(); i++) {
			copyList.add(students.get(i));
		}
		System.out.println(copyList);
		
		
		// 리스트 복사 2
		ArrayList<String> copyList2 = new ArrayList<>();
		copyList2.addAll(students);
		System.out.println(copyList2);
		
		
		// 리스트 복사 3
		ArrayList<String> copyList3 = new ArrayList<String>(students);
		System.out.println(copyList3);
		
		System.out.println("\n========================================\n");
		
		// 향산된 for문 
		// (= foreach문)
		for(String stu : students) {
			System.out.println(stu);
		}
		// 인덱스가 존재하는 ArrayList에서는
		// 큰 메리트가 있지는 않다.
		
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		System.out.println("\n========================\n");
		
		// forEach 문
		students.forEach(new Consumer<String>() {
			@Override
			public void accept(String stu) {
				System.out.println(stu);
			}
		});
		
		// 람다식
		students.forEach(stu -> System.out.println(stu));
		students.forEach(stu -> {
			System.out.println(stu);
			System.out.println(stu);
		});
		
		System.out.println("\n==============================\n");
		
		// 값을 주면서 리스트 선언
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(30, 23, 1, 66, 34, 143));
		numbers.add(25);
		numbers.add(51);
		numbers.add(55);
		numbers.add(45);
		numbers.add(35);

		// 정렬
		// 알고리즘 
		for(int k = 0; k < numbers.size(); k++) {
			for(int i = 0; i < numbers.size()-1-k; i++) {
				// i > i+1 하면 오름차순
				// i < i+1 하면 내림차순
				if(numbers.get(i) < numbers.get(i+1)) {
					int tmp = numbers.get(i);
					numbers.set(i, numbers.get(i+1));
					numbers.set(i+1, tmp);
				}
			}
			
		}
		System.out.println(numbers);
		
		// 제공되는 메소드로 정렬하기
		// 오름차순
		Collections.sort(numbers);
		
		// 내림차순
		Collections.sort(numbers,Collections.reverseOrder());
		System.out.println(numbers);
		
		// 주의사항
		// 버블정렬 또한 필수로 사용할 수 있도록
		// 하세요
		
		
		
		
		
		
		
	}

}

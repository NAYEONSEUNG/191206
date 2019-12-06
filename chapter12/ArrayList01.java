package chapter12;

import java.util.ArrayList;

public class ArrayList01 {
	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<>();
		list.add("수박"	);//값 입력   0번자리
		list.add("바나나");//값 입력  1번자리
		list.add("포도"	);//값 입력   2번자리  add는 값을 넣어라, 넣고 옆으로 한칸식 밀어브러
		list.add(1,"망고");//(index,value)를 넣은것
		list.set(3, "오렌지");
			
		
		int[] array = new int[5];
		array[0] = 3;
		
		//출력
		for(int i = 0 ; i<list.size(); i++) {
			System.out.println(list.get(i));// get은 값을 꺼내와라
		//	System.out.println(array[i]);//위에랑 동작하는건 똑같다
		}
		
		
   }//메인
}//클라스

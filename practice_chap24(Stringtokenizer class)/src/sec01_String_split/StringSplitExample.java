package sec01_String_split;

public class StringSplitExample {

	public static void main(String[] args) {
		
		
		String text = "홍길동&이수홍,박연수,김자바-최영호/이윤수";
		//구분자를 정규표현식으로 여러개를 지정할 수 있다.
		String[] names = text.split("&|,|-|/");
		
		//향상된 for문
		for(String name : names) //각 배열의 항목을 name으로 지정
			System.out.println(name);
			//즉 for문 name 은 names[i] 출력하는거랑 같음
		
	}

}

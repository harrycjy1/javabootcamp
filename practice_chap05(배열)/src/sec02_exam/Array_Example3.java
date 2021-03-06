package sec02_exam;

import java.util.Scanner;

public class Array_Example3 {

	public static void main(String[] args) {
		
		String[][] words = new String[][] {
			{"chair"	,"의자"},
			{"computer"	,"컴퓨터"},
			{"integer"	,"정수"}
		};
		
		//프로그램을 코딩할 때, 리소스(Resource)라고 칭하는 것은
		//모니터, 키보드, 마우스, 파일 등
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			//%s는 문자열을 나타내는 형식지정자이다.
			System.out.printf("Q%d, %s의 뜻은?", i+1, words[i][0]);
			//nextLine()메서드는 사용자가 엔터를 칠때까지 입력받는다.
			//next() 공백이 생기면 거기까지만 값을 받는다.
			
			String tmp = scan.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			}
			else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
			}
		
		
		}

		scan.close();
	}

}

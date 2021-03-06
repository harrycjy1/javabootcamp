package sec01_exam_objects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

class Member implements Comparable<Member>{

	
	int score;
	String name;
	
	//생성자
	public Member(int score, String name) {
		this.score=score;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return this.score +", "+this.name;
	}
	
	//아래와 같이 객체의 정렬 기준을 제공해주면 Arrays.sort메서드에서는
	//그 정렬 기준을 받아와서 정렬을 한다. 그게 Comparable이든 Comparator이든..
	
	@Override
	public int compareTo(Member o) {
		
		/*if(o.score < this.score) 
			return -1;
		else if(o.score==this.score)
			return 0;
		else 
			return 1;*/
		
		System.out.println(this.score + " : "+o.score);
		return this.score-o.score;			//오름차순
		//return o.score-this.score;		//내림차순
		//return (this.score-o.score)*-1;	//내림차순
		
	}

	
	

}

class NameAsceding implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		//return o1.name.compareTo(o2.name); //문자열을 사전순으로 오름차순한다.
		
		return o2.name.compareTo(o1.name); //문자열을 사전순으로 내림차순 한다.
		//return o2.score - o1.score;
	}
}

	/*결론은 Comparable은 기본 정렬기준을 구현하는데 사용을 한다(compareTo()메서드 재정의)
	하지만 Comparator는 기본 정렬기준말고 다른 기준으로 정렬하고자 할 때 사용한다.
	(compare()메서드 재정의)*/

public class ComparableVsComparator{
	
	public static void main(String[] args) {
		//객체배열 선언
		Member[] mem = {
								new Member(100,"abc"),new Member(300,"aaa"),
								new Member(400,"ccc"),new Member(200,"bbb")
				
		};
		
		
		//정렬을 함.
		Member m1 = new Member(3,"김우진");
		Member m2 = new Member(2,"김강진");
		Member[] mem1 = {m1,m2};
		
		Arrays.sort(mem1); 	//Arrays.sort()메서드는 매개값에 배열값이 기본형 타입이면 기본적으로 오름차순 정렬이 이루어짐
							//매개값이 Comparable<>인터페이스를 구현했다면 compareTo()의 리턴값으로 정렬을 선택한다.
		
		System.out.println(Arrays.toString(mem1));
		
		
		System.out.println("Objects.compare()직접 호출 : "+Objects.compare(m1, m2, new NameAsceding()));
		
		
		
		
		//출력을 하는데 ClassCastException 이 발생함 이유는 Comparable 인터페이스를
		//Member클래스가 미구현했기 때문에 발생하는 것이다.
		Arrays.sort(mem);
		System.out.println(Arrays.toString(mem));
		
		//직접 비교자인 NameAsceding인스턴스를 제공하고 있다.
		Arrays.sort(mem, new NameAsceding());
		System.out.println(Arrays.toString(mem));

	}
	
	
}
	
	
package sec02_exam;

public class TvTestExample1 {

	public static void main(String[] args) {
		
		
		Tv t = new Tv(); //Tv인스턴스를 참조하기위한 변수 t선언 TV인스턴스 생성
		t.channel = 7;	 //Tv인스턴스의 멤버 변수 channel의 값을 7로 한다.
		t.channeldown();	//Tv인스턴스의 메서드 channeldown()을 호출한다.
		System.out.println("현재 채널은 "+t.channel+"입니다.");

	}

}

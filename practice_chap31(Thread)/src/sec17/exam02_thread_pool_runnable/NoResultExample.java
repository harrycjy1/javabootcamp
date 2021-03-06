package sec17.exam02_thread_pool_runnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class NoResultExample {

	public static void main(String[] args) {
		
		//해당 PC CPU의 코어수를 최대스레드수로 준다
		ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		
		//Runnable 익명 구현객체 생성(작업객체) --> 리턴값이 없다
		System.out.println("[작업 처리 요청]");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum =0;
				for(int i=1; i<=10; i++) 
					sum +=i;
					
					System.out.println("[작업 처리 결과] : "+sum);
			}
		};

		Thread thread = new Thread(runnable);
		//thread.start();
		
		//작업큐에 작업을 넣는다. 리턴값이 없다. 하여 Future<?> submit(Runnable task)를 선택하다.
		//작업이 완료될때까지 블로킹 즉 기다린다. Future는 지연완료객체이다
		Future<?> future = es.submit(runnable);
		
		try {
			Object obj = future.get(); //get()은 작업객체가 작업을 완료할 때까지 기다린다(블로킹)
			String str = (String) obj;
			System.out.println("[작업 처리 완료]");
			System.out.println("Future의 get()이 리턴한 값 : "+ str);
		} 
		catch(InterruptedException e) {e.printStackTrace();}
		catch(ExecutionException e) {e.printStackTrace();}
		
		
		es.shutdown();
		
		
		
	}

}

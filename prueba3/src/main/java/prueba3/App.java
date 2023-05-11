package prueba3;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class App {

	public static void main(String[] args) {
		
	// Creamos un objeto Observable que emite una serie de mensajes de texto
		Observable<String> observable = Observable.just("Hola", "Adios");
		
		Observer<String> observer1 = new Observer<String>() {

			public void onSubscribe(Disposable d) {
				System.out.println("Observer 1: Subcribed");				
			}

			public void onNext(String text) {
				System.out.println("Observer 1: " + text);				
			}

			public void onError(Throwable e) {
				System.out.println("Observer 1: " + e.getMessage());				
				
			}

			public void onComplete() {
				System.out.println("Observer 1: Completed");				
				
			}
			
			
		};
		Observer<String> observer2 = new Observer<String>() {

			public void onSubscribe(Disposable d) {
				System.out.println("Observer 2: Subcribed");				
				
			}

			public void onNext(String text) {
				System.out.println("Observer 2: " + text);				
				
			}

			public void onError(Throwable e) {
				System.out.println("Observer 2: " + e.getMessage());				
				
			}

			public void onComplete() {
				System.out.println("Observer 2: Completed");				
				
			}
			
		};
		
		observable.subscribe(observer1);
		observable.subscribe(observer2);


		
	}

}

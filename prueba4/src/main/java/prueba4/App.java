package prueba4;

import java.util.function.Consumer;

import reactor.core.publisher.Flux;

public class App {

	public static void main(String[] args) {
		Flux<String> publisher = Flux.just("Mensaje 1", "Mensaje 2");
		

		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Consumer 2 : " + t);
			}

		};
		Consumer<String> c2 = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("Consumer 2 : " + t);
			}

		};


		publisher.subscribe(c);
		publisher.subscribe(c2);

	}

}

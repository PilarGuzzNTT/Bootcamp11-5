package prueba2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Product> shopping = List.of(new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));


		BigDecimal  totalPrice = shopping.stream()
				.map(product -> product.price
						.multiply(new BigDecimal(product.tax.percent).divide(new BigDecimal(100))).add(product.price))
				.reduce(BigDecimal.ZERO, BigDecimal::add);


		System.out.println(totalPrice.setScale(0, RoundingMode.HALF_DOWN));

		shopping.stream().filter(product -> product.name.startsWith("C"))
				.forEachOrdered(product->System.out.print(product.name+", "));
		

	}

}

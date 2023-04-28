import java.text.NumberFormat;
import java.util.Locale;

public class Currency {

	public static void main(String[] args) {

		Locale locale=new Locale("en","US");
		NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
		System.out.println(nf.format(2000000));
	}

}

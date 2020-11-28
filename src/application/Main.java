package application;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale locale = new Locale("en", "US");
		if (args.length == 0) {
			System.err.println("Precisa de Argumentos");
			System.exit(0);
		}
		String resp = "ERROR";
		args[0] = args[0].toLowerCase();
		if (args[0].equals("--help")) {
			resp = "Programa: Cmd Math via args\n" + "Fun��es:\n\tsqrt x\n\tpow x y\n\tlog10 x\n"
					+ "Constantes:\n\tPI\n\tE\n\tPHI\n";
		} else if (args[0].equals("--author")) {
			resp = "Autor: Jesimar da Silva Arantes";
		} else if (args[0].equals("--version")) {
			resp = "Vers�o: 1.0";
		} else if (args[0].equals("sqrt")) {
			resp = Math.sqrt(Double.parseDouble(args[1])) + "";
		} else if (args[0].equals("pow")) {
			double x = Double.parseDouble(args[1]);
			double y = Double.parseDouble(args[2]);
			resp = Math.pow(x, y) + "";
		} else if (args[0].equals("log10")) {
			resp = Math.log10(Double.parseDouble(args[1])) + "";
		} else if (args[0].equals("pi")) {
			resp = Math.PI + "";
		} else if (args[0].equals("e")) {
			resp = Math.E + "";
		} else if (args[0].equals("phi")) {
			resp = 1.618033988749895 + "";
		}
		System.out.println(resp);
	}

}

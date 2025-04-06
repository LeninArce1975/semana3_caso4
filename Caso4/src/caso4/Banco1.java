package caso4;

public class Banco1 {
private static double tasaInteres=5.9;

public Banco1() {
	
}

/*public static double getTasaInteres() {
	return tasaInteres;
}

public static void setTasaInteres(double tasaInteres) {
	Banco1.tasaInteres = tasaInteres;
}*/

public static double actualizarTasa(double nuevaTasa) {
	tasaInteres=nuevaTasa;
	return tasaInteres;
}
}

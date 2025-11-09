package h3;

public class H3_main {
	public static void main(String[] args) {
		 // Deklaration der Variablen
        float celsiusFloat, fahrenheitFloat;
        double celsiusDouble, fahrenheitDouble;

        // Initialisierung mit beliebigen Werten
        celsiusFloat = 14.2f;
        fahrenheitFloat = 77.8f;

        celsiusDouble = 14.2;
        fahrenheitDouble = 77.9;
        
        
        //Programm:
        
        fahrenheitFloat = celsiusFloat * (9f / 5f) + 32f;
        fahrenheitDouble = celsiusDouble * (9.0 / 5.0) + 32.0;
        
        //System.out.println("Double: " + fahrenheitDouble + "\nFloat: " + fahrenheitFloat);
	}
}

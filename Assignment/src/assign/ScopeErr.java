package assign;

//This program will not compile
class ScopeErr {
	public static void main(String[] args) {
		int bar = 1;
		{ // creates a new scope
			int bar2 = 2; // Compile time error -- bar already defined!
		}
	}
}
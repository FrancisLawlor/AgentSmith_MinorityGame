

public class MinorityGameInputMapper {
	private static final int NUMBER_OF_OPTIONS = 2;
	
	public static int mapInput(int input) {
		int filteredInput = input % NUMBER_OF_OPTIONS;
		
		return filteredInput == 0 ? -1 : 1;
	}
}



import java.util.Map;

public class MinorityGameRequirementsChecker {
	public static boolean rulesAreNotBroken(Map<String, Integer> playerGuesses) {
		if (playerGuesses == null) {
			return false;
		}
		
		if (playerGuesses.size() % 2 == 0) {
			return false;
		}
		
		return true;
	}
}

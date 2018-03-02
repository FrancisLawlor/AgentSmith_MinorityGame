package games.core;

import java.io.IOException;
import java.util.Map;

public interface IGame {
	public abstract Map<String, Float> play(Map<String, Integer> playerGuesses);
	public abstract int getWinningChoice(Map<String, Integer> playerGuesses);
	public abstract int getNumberOfOptions();
	public abstract Map<String, Integer> getUpdateStrategyData(Map<String, Integer> input);
	public String getGameName();
	public String[] getAdditionalParameterNames();
	public byte[] getIconAsBytes() throws IOException;
}


import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int matchingentires = 0;
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (hashmap1.containsKey(hashmap2) && hashmap1.containsValue(hashmap2)) {
					matchingentires+=1;
				}
			}
			
		}
		return matchingentires;
	}

}

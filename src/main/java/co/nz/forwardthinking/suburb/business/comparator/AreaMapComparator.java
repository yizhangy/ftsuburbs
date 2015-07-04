
package co.nz.forwardthinking.suburb.business.comparator;

import java.util.Comparator;
import java.util.Map;

public class AreaMapComparator implements Comparator<Integer> {
	 
	private Map<Integer, String> map;

	public AreaMapComparator(Map<Integer, String> map){
		this.map = map;
	}

	@Override
	public int compare(Integer keyA, Integer keyB){
		String valueA = map.get(keyA);
		String valueB = map.get(keyB);
		return valueA.compareTo(valueB);
	}
}

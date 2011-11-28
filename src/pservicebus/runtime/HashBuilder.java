package pservicebus.runtime;

import java.util.*;

public class HashBuilder {
	private final Map<String, Object> _map = new HashMap<String, Object>();
	public static HashBuilder create(){
		return new HashBuilder();
	}
	public HashBuilder add(String key, Object value){
		_map.put(key, value);
		return this;
	}

	public Map<String, Object> getHash(){
		return _map;
	}
}

package utilities;

import java.util.HashMap;
import java.util.Map;
//import java.util.Map;

public class Test_Context {
	private Map<String,Object> hm1;
	
	public Test_Context() {
		hm1=new HashMap<>();
		
	}
	public void set(String key, Object value){
		hm1.put(key, value);
	}
	
	public Object get(String key) {
		return hm1.get(key);
	}
}

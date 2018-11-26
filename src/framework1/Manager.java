package framework1;

import java.util.*;

public class Manager {
	HashMap hm = new HashMap();
	public void register(String name, Product proto) {
		hm.put(name, proto);
	}
	public Product create(String protoname) {
		Product p = (Product)hm.get(protoname);
		return p.createClone();
	}
}

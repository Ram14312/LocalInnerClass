package org.studySpring.shop;

public class Door {
	
	public Boolean isLocked(String key) {
		class Lock{
			public Boolean isLocked(String key) {
				if(key.equals("query")){
					return false;
				}else {
					return true;
				}
			}
		}
		return new Lock().isLocked(key);
		
	}

}

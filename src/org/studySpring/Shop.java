package org.studySpring;

import org.studySpring.shop.Door;

public class Shop {

	public static void main(String[] args) {
		 Door d = new Door();
		 
//		System.out.println( d.isLocked("query"));
		 if(d.isLocked(args[0])) {
			 System.out.println("door is Locked");
		 }else {
			 System.out.println("door is open ");
		 }

	}

}

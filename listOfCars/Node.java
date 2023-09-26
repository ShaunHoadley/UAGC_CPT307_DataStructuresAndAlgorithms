/* 
 * Node.java
 * Shaun Hoadley
 * CPT-307 Data Structures and Algorithms
 * Professor Pete Limon
 * August 1, 2020 
 */

/*
* Copyright (C) 2007-2014 by Brett Alistair Kromkamp <brett@perfectlearn.com>.
*/

package listOfCars; // changed from original -> com.quesucede.tree;
	
	import java.util.ArrayList;

	public class Node {
		private String identifier;
		private ArrayList<String> children;
		
		// Constructor
		public Node(String identifier) {
			this.identifier = identifier;
			children = new ArrayList<String>();
		}
		// Properties
		public String getIdentifier() {
			return identifier;
		}
		public ArrayList<String> getChildren() {
			return children;
		}	
		// Public interface
		public void addChild(String identifier) {
			children.add(identifier);
		}
	}
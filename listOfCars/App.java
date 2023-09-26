/* 
 * App.java
 * Shaun Hoadley
 * CPT-307 Data Structures and Algorithms
 * Professor Pete Limon
 * August 1, 2020 
 */

/*
* Copyright (C) 2007-2014 by Brett Alistair Kromkamp <brett@perfectlearn.com>.
*/

package listOfCars; // changed from original -> package com.quesucede.tree;

	import java.util.Iterator;
	
	public class App {
			public static void main(String[] args) {
				Tree tree = new Tree();
				
				/*
				* The second parameter for the addNode method is the identifier
				* for the node's parent. In the case of the root node, either
				* null is provided or no second parameter is provided.
				*/
				
				/*	
				 * 	The node data contained below has been modified from Kromkamp's 
				 * 	original code. It has been changed from names to car makes and models.
				 * 	Additionally, a few more nodes were added.
				 */
				
				tree.addNode("GM");
				tree.addNode("Chevrolet", "GM");
				tree.addNode("GMC", "GM");
				tree.addNode("Pontiac", "GM");
				tree.addNode("Cadillac", "GM");
				tree.addNode("Camarro", "Chevrolet");
				tree.addNode("HHR", "Chevrolet");
				tree.addNode("Acadia", "GMC");
				tree.addNode("Canyon", "GMC");
				tree.addNode("2500", "Acadia");
				tree.addNode("Crew Cab", "Canyon");
				tree.addNode("Extended Cab", "Canyon");
				tree.addNode("Spark", "Chevrolet");
				tree.addNode("Savana", "GMC");
				tree.addNode("Sunfire", "Pontiac");
				tree.addNode("Firebird", "Pontiac");
				tree.addNode("Grand Prix", "Pontiac");
				tree.addNode("Seville", "Cadillac");
				
				// displays the tree
				tree.display("GM"); 
				
				// Prints header
				System.out.println("");
				System.out.println("\n***** DEPTH-FIRST ITERATION *****"); 
				
				// Default traversal strategy is 'depth-first'
				Iterator<Node> depthIterator = tree.iterator("GM");
				
				// Iterates over the nodes of the tree (references Node class)
				while (depthIterator.hasNext()) {
					Node node = depthIterator.next();
					System.out.println(node.getIdentifier());
				}
				
				//Prints header
		        System.out.println("");
				System.out.println("\n***** BREADTH-FIRST ITERATION *****");
				
				 /* Iterates over nodes in the tree 
		         * (references TraversalStrategy,
		         * Tree, and BreadthFirstIterator classes)
		        */
				Iterator<Node> breadthIterator = tree.iterator("GM", TraversalStrategy.BREADTH_FIRST);
				while (breadthIterator.hasNext()) {
					Node node = breadthIterator.next();
					System.out.println(node.getIdentifier());
				}
			}
	}

package coreJava.casting;

public class CastingExample {
	
public static void main(String[] args) {
	
	
//	up casting 
	Plant plant = new Tree();
	plant.shead();
	
//	down casing 
	
	/*
	 * Tree tree = (Tree) new Plant(); tree.shead();
	 */
	
	
//	possible down cast
	Plant plant2 = new Tree();
	Tree tree1 = (Tree) plant2;
	tree1.shead();
	
	
//	again doing downCasting 
	Object obj = new Plant();
	
	if(obj instanceof Plant) {
	Plant plant3 = (Plant)obj;
	plant3.shead();
	}
	if(obj instanceof Tree) {
		Tree tree2 = (Tree)obj;
		tree2.shead();
	}
	
	
}


}


class Plant{
	
	public void shead() {
		System.out.println("plant leaf sheading");
	}
}

class Tree extends Plant{
	
	@Override
	public void shead() {
		System.out.println("Tree leaf Sheading");
	}
	
}
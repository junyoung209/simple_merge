package junit.test.merge;

import java.util.Vector;

public class merge {
	
	
	public merge() {
		// TODO Auto-generated constructor stub
	}

	public void transfer(Vector<String> vec1, Vector<String> vec2, Vector<Integer> block){
		
		for (int i = 0; i < block.size(); i++) {
			 vec2.setElementAt(vec1.get(block.get(i)), block.get(i));
	      }
		
	}
	public void eraseline(Vector<String> vec1, Vector<String> vec2, Vector<Integer> block){
	
		
		for (int i = block.lastElement(); i >= block.firstElement(); i--) {
			if (vec1.get(i).compareTo("\t\r") == 0) {
				vec1.remove(i);
				vec2.remove(i);
			}
		}
	  
	}
	public void erasecarriage(Vector<String> vec1, Vector<String> vec2, Vector<Integer> block){
		for(int i=0;i<vec1.size()-1;i++)
		 {
			 vec1.setElementAt(vec1.get(i).substring(0,vec1.get(i).length()-1), i);
			 vec2.setElementAt(vec2.get(i).substring(0,vec2.get(i).length()-1), i);
		 }
	}	
	
//	   public void merge(Vector<String> vec1, Vector<String> vec2, Vector<Integer> block) {
//			 
//			
//			
//
//	   }
//	   
	   


	
}

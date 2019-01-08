
public class TreeStudent {
	private StDNode root;
	TreeStudent () { 
		
	}
	public StDNode find (int key) {
		StDNode current = getRoot();
		while(current.ID != key)
		{
			if (key < current.ID)
				current = current.leftchild;
			else
				current = current.rightchild;
			if(current ==null)
				return null;
		}
		return current;
		
		
		
	}
	
	public void insert(int ID,String name,String subCode,String sub,String grade,String teacher,String first,String last) {
		StDNode newStDNode = new StDNode(); // make new node
		newStDNode.ID = ID; // insert data
		newStDNode.name = name;
		newStDNode.subCode = subCode;
		newStDNode.sub = sub;
		newStDNode.grade = grade;  
		newStDNode.teacher = teacher;
		newStDNode.first = first;
		newStDNode.last = last;// insert data
		if(getRoot()==null) // no node in root
			setRoot(newStDNode);
		else // root occupied
		{
			StDNode current = getRoot(); //start at root
			StDNode parent;
			while(true) //(exits internally)
			{
				parent = current;
				if(ID < current.ID) { // go left ?
					current = current.leftchild;
				  if(current.name != null) {
					  
					  
				  }
				  else {
				   
				   if(current.subCode != null && current.grade != null) {
					   current = current.rightgrandChild;
				   }
				   else {
					   return;
				   }
				   // leftgreatchild, rightgreatchild 
				  }
					if(current == null) {// if end of the line insert on left
 						parent.leftchild = newStDNode;
						return;
					} // end if go left
					
				}
				else // or go right
				{
					current = current.rightchild;
					if(current==null){ //if end of the line , insert on right
						parent.rightchild = newStDNode;
						return;
					}//end else go right
				}// end while
			}//end else not root
			
		}//end insert()
		
		
		}
	public void delete() {
		
	}
	public StDNode getRoot() {
		return root;
	}

	public void setRoot(StDNode root) {
		this.root = root;
	}
	
   
// various other methods
} // end class TreeStudent

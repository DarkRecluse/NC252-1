
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
	
	public void insert(int ID,String name,String sub,String grade) {
		StDNode newStDNode = new StDNode(); // make new node
		newStDNode.ID = ID; // insert data
		newStDNode.name = name;
		
		newStDNode.sub = sub;
		newStDNode.grade = grade;  
		
		// insert data
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
					  current = current.leftgrandChild;
				  }
				  else {
				   
				   if(current.sub != null && current.grade != null) {
					   current = current.rightgrandChild;
				   }
				   
				   else {
					   return;
				   }
				
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
	private void inOrder(StDNode localRoot,StDNode leftlastRoot,StDNode rightlastRoot) {
		;
		if(localRoot !=null) {
			inOrder(localRoot.leftchild,leftlastRoot.leftgrandChild,rightlastRoot.rightgrandChild);
			
			}
		System.out.println("================================");
		System.out.println("Name :" + localRoot.name);
		System.out.println("ID " + leftlastRoot.ID);
		System.out.println("Subject " + rightlastRoot.sub + "Grade" + rightlastRoot.grade);
		System.out.println("================================");
		inOrder(localRoot.rightchild,leftlastRoot.leftgrandChild,rightlastRoot.rightgrandChild);
	}
	public boolean delete(int key) {
        StDNode current = getRoot();
        StDNode parent = getRoot();
        boolean isleftChild = true;
        
        while(current.ID != key) {
        	parent = current;
        	if(key < current.ID) {
        		isleftChild = true;
        		current = current.leftchild;
        	}
        	else {
        		isleftChild = false;
        		current = current.rightchild;
        	}
        	if(current == null) {
        		return false;
        	}
        }
         parent = parent.leftchild; //no node in parent
        if(parent.leftgrandChild ==null && parent.rightgrandChild == null) {
        	if(parent == getRoot())
        		parent = null ;
        	else if(isleftChild)
			       parent.leftgrandChild = null;
        	else
        		parent.rightgrandChild = null;
		}// continues
        if(parent == null) {
        	parent = parent.leftgrandChild;
        	
        	
        		
        }
        
        
		return false;
		
	}
	
	
	public StDNode getRoot() {
		return root;
	}

	public void setRoot(StDNode root) {
		this.root = root;
	}
	
   
// various other methods
} // end class TreeStudent

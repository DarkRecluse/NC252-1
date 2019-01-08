
public class StDNode {
	int ID;
	String name,sub,grade,subCode,teacher,first,last;
	StDNode leftchild;
	StDNode rightchild;
	StDNode leftgrandChild;
	StDNode rightgrandChild;
	
	
	public void displayNode() {
		System.out.println("                 ID:" + this.ID);
		System.out.println("               //  \\ ");
		System.out.println("            Name" + "subCode Grade" + this.grade);
		System.out.println("         //    \\      //      \\" );
		System.out.println( this.first+ this.last+ this.sub + this.teacher    );
		
		
		
		
	}

}

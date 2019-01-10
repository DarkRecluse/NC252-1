
public class Main {
	public static void main (String args[]) {
		LinkList std = new LinkList();
		
		std.addFirst("A001","Somsri jaidee", "NC123","A");
		std.addFirst("A002","Somsuk rukrian", "NC120","C");
		std.addFirst("A004","Sompong wongree", "NC103","D");
		
		std.displayList();
		
		std.addAfter("A004", "A003", "sudsuey aodaom","NC360","D");
		std.displayList();
		
		std.addLast("A000","meetung banruey","NC310","B+");
		std.displayList();
		
		std.find("A001");
		
		std.updateName("A000", "meetang podee");
		std.displayList();
		
	}
}
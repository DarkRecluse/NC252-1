
public class stdRecord {

		public String stdID ,stdName,subject,grade;
		public stdRecord next,prev;
		
		public stdRecord (String stdID,String stdName,String subject,String grade) {
			this.stdID = stdID ;
			this.stdName = stdName;
			this.subject = subject;
			this.grade = grade;
		}
		

		@Override
		public String toString() {
			return "ID: "+ this.stdID +"\nNAME: "+ this.stdName +"\nSUBJECT: "+ this.subject +"\nGRADE: "+this.grade+"\n-----------------------";
		}
		
		
	                       
}

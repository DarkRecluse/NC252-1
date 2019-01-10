
public class LinkList {
	private stdRecord first, last;

	public LinkList() {
		this.first = null;
		this.last = null;
	}

	public void addFirst(String ID, String name, String subject, String grade) {
		stdRecord std = new stdRecord(ID, name, subject, grade);
		std.next = this.first;
		if (std.next == null) {
			last = std;
		} else {
			first.prev = std;
		}
		first = std;
	}

	public void addAfter(String key, String ID, String name, String subject, String grade) {
		stdRecord current = this.first;
		while (!current.stdID.equals(key)) {
			if (current.next == null) {
				System.out.println("ID:"+key + " NOT FOUND CAN'T INSERTAFTER");
				break;
			} else {
				current = current.next;
			}
		}
		stdRecord std = new stdRecord(ID, name, subject, grade);
		std.next = current.next;
		std.prev = current;
		current.next = std;
		System.out.println("Insert Student ID:" + std.stdID + " After ID:" + current.stdID + " Complete !");
	}

	public void addLast(String ID, String name, String subject, String grade) {
		stdRecord std = new stdRecord(ID, name, subject, grade);
		std.next = last.next;
		std.prev = last;
		last.next = std;
		this.last = std;
		System.out.println("INSERT Student ID:" + std.stdID + " At Last Complete !");
	}

	public stdRecord search(String key) {

		stdRecord current = this.first;
		while (!current.stdID.equals(key)) {
			if (current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}
	
	public void find(String key) {
		stdRecord result = search(key);
		if(result != null) {
			System.out.println("######"+" Found data ! "+"######");
			System.out.println(result);
		} else {
			System.out.println("######"+" Data not found !"+"######");
		}
	}

	public stdRecord delete(String key) {

		stdRecord current = this.first;
		while (!current.stdID.equals(key)) {
			if (current.next == null)
				return null;
			else {
				current = current.next;
			}
		}
		if (current == this.first) {
			this.first = first.next;
			first.prev = null;
		} else {
			System.out.println("DELETE Student ID:" + current.stdID + " Complete !");
			current.prev.next = current.next;
			if (current.next != null)
				current.next.prev = current.prev;
			current = current.next;
		}
		return current;

	}

	public void displayList() {
		System.out.println("=======================\n" + "List\n[first to last]" + "\n=======================");
		stdRecord current = first;
		while (current != null) {
			System.out.println(current);
			current = current.next;
		}
	}

	public stdRecord updateName(String key, String name) {

		stdRecord current = this.first;
		while (!current.stdID.equals(key)) {
			if (current.next == null)
				return null;
			else {
				current = current.next;
			}
		}
		System.out.println("UPDATE \"" + name + "\" From \"" + current.stdName + "\" Complete !");
		current.stdName = name;
		return current;

	}

	public stdRecord updateSubject(String key, String subject) {

		stdRecord current = this.first;
		while (!current.stdID.equals(key)) {
			if (current.next == null)
				return null;
			else {
				current = current.next;
			}
		}
		System.out.println("UPDATE :" + subject + " From " + current.subject + " Complete !");
		current.subject = subject;
		return current;

	}

	public stdRecord updateGrade(String key, String grade) {
		stdRecord current = this.first;
		while (!current.stdID.equals(key)) {
			if (current.next == null)
				return null;
			else {
				current = current.next;
			}
		}
		System.out.println("UPDATE :" + grade + " From " + current.grade + " Complete !");
		current.grade = grade;

		return current;

	}

	public stdRecord updateID(String key, String id) {
		stdRecord current = this.first;
		while (!current.stdID.equals(key)) {
			if (current.next == null)
				return null;
			else {
				current = current.next;
			}
		}
		System.out.println("UPDATE :" + id + " From " + current.stdID + " Complete !");
		current.stdID = id;
		return current;

	}

}

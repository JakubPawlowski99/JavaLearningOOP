
public class Friend {

		String name;
		static int numberOfFriends;
		
		Friend(String name){
			this.name = name;
			numberOfFriends++;
		}
		
		static void displayFriends() {
			if(numberOfFriends != 1) {
				System.out.println("You have " + numberOfFriends + " friends");
			}
			else {
				System.out.println("You have " + numberOfFriends + " friend");
			}
		}
}

package newSoftware;

import java.util.ArrayList;

public class clientt {
		
		
		public static ArrayList<clientt> clients =new ArrayList<clientt>() ;
		public String name;
		public String password;
		//public String city;
		//public String role;
		//public String address;
		//public String email;
		//public String id;
		
		
		public int checkpass(String string) {

			if(string.equals("adminAhmad")) {
				return 1;
			}
			
			return 0;
		}

		
		public int checkname(String string) {

			if(string.equals("ahmad")) {
				return 1;
			}
			
			return 0;
		}

	
	
}

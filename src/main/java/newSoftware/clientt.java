package newSoftware;

import java.util.ArrayList;

public class clientt {
	
	
		
		
		public static ArrayList<clientt> clients =new ArrayList<clientt>() ;
		public static ArrayList<appointment> app =new ArrayList<appointment>() ;
		
		public static ArrayList <services> srvs=new ArrayList<services>();
		public String id;
		public String name;
		public String email;
		public String address;
		public String password;
		public String role;
		
		
		
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

package newSoftware;

import java.util.ArrayList;
import java.util.Calendar;

import io.cucumber.datatable.DataTable;
public class appointment {
	

	public String Section;
   public String time;
   clientt  c =new clientt();
 
 public int month= Calendar.MONTH;
 public int day= Calendar.DAY_OF_WEEK;
 public int week =Calendar.WEEK_OF_MONTH;
 
 public String username =c.name;

public static ArrayList<appointment> userBooking= new ArrayList <appointment>();
public String uid=c.id;
public static boolean donevisit=false;
public static boolean writenote=false;

}

package newSoftware;

import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class booking {
	
//boolean isReg=false;
clientt c1;
appointment a1;
public static boolean isbooked=false;
boolean isEmpty=false;
public booking(clientt c, appointment a)
{
	c1=c;
	a1=a;
	
}



@Given("the user with id {string} is registered")
public void the_user_with_id_is_registered(String string) {
	for(clientt c :clientt.clients) {
    	if(c.id.equals(string)) {
    		registrTest.registerr=true;
    	}
    	else
    		registrTest.registerr=false;
    	
 }

}

@When("the user book an appointment")
public void the_user_book_an_appointment(io.cucumber.datatable.DataTable dataTable) {

	for(int i=0;i<2;i++) {
		String co1= dataTable.cell(i, 0);	
		String co2= dataTable.cell(i, 1);	
		int  co3= Integer.parseInt(dataTable.cell(i, 2));	
		int co4= Integer.parseInt(dataTable.cell(i, 3));
		int co5= Integer.parseInt(dataTable.cell(i, 4));
         a1.Section=co1;
         a1.time=co2;
         a1.day=co3;
         a1.week=co4;
         a1.month=co5;
		
		appointment.userBooking.add(a1);
	}
	
	
	
	
	
}

@Then("the user booked an appointment with section {string},time{string}, day {int} ,week {int}, month {int}")
public void the_user_booked_an_appointment_with_section_time_day_week_month
(String string, String time, Integer int3, Integer int4, Integer int5) {
  
	for( appointment b :appointment.userBooking) {
    	if(b.Section.equals(string)&& b.time.equals(time)&& b.day==int3 &&b.week==int4 && b.month== int5){
    		clientt.app.add(b);
    		appointment.userBooking.remove(b);
    		isbooked=true;
    	}
   
    	
 }
     if (isbooked==true)
	 assertTrue(isbooked);
     
}

@When("the appointment with section {string},time {string}, day {int} ,week {int}, month {int} is not founded")
public void the_appointment_with_section_time_day_week_month_is_not_founded
(String string, String string2, Integer int1, Integer int2, Integer int3) {
	for( appointment b :appointment.userBooking) {
    	if(b.Section.equals(string)&& b.time.equals(string2)&& b.day==int1 &&b.week==int2 && b.month== int3){
    		
    		isbooked=true;
    	}
    	else 
   isbooked=false;

	
	
	}
}

@Then("the user does not book this appointment")
public void the_user_does_not_book_this_appointment() {
	 if ( isbooked=false)
	    	assertTrue(isbooked);
    
}


@Given("the user with id {string} is not registered")
public void the_user_with_id_is_not_registered(String string) {
	
	for(clientt t : clientt.clients) {
		if (t.id.equals(string))
			registrTest.registerr=true;
		else 
			registrTest.registerr=false;
   
	}
}
@Then("the user can not book any appointment")
public void the_user_can_not_book_any_appointment() {
	
	
	if (registrTest.registerr==true) {
		assertTrue(!registrTest.registerr);
}
	
	

	
}


@When("all appointments are booked")
public void all_appointments_are_booked() {
 
	if (appointment.userBooking.isEmpty()) {
		 isEmpty=true;
		
	}
	
	
	
	
}

@Then("there is no appointments to booked")
public void there_is_no_appointments_to_booked() {
    if( isEmpty==true)
    	assertTrue( isEmpty);
}





	




}

	
	
	
	
	
	
	
	
	
	
	



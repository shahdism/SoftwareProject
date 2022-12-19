package newSoftware;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class visitt {
	

	@Given("the user with id {string} is arrived at the clinic on the specific time")
	public void the_user_with_id_is_arrived_at_the_clinic_on_the_specific_time(String string) {
	    // Write code here that turns the phrase above into concrete actions
    for(appointment p:clientt.app ) {
    	if (p.uid==(string)) 
    		booking.isbooked=true;
    	else
    		booking.isbooked=false;
    		
    }
	
}

	@When("the user come to the appointment with section {string},time {string}, day {int} ,week {int}, month {int}")
	public void the_user_come_to_the_appointment_with_section_time_day_week_month(String string, String string2, Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions

	for (appointment p: clientt.app) {
		   if(p.Section.equals(string)&& p.time.equals(string2)&& p.day==int1 &&p.week==int2 && p.month == int3) 
		   appointment.donevisit=true;
		   else
			   appointment.donevisit=false;
		   
	}
}

@Then("the appointment converted to visit")
public void the_appointment_converted_to_visit() {
   if ( appointment.donevisit==true) 
	  
	   assertTrue(appointment.donevisit && booking.isbooked);

}
@Given("the user with id {string} not arrived at the clinic on the specific time")
public void the_user_with_id_not_arrived_at_the_clinic_on_the_specific_time(String string) {
	for(appointment p:clientt.app ) {
    	if (p.uid==(string)) 
    		booking.isbooked=true;
    	else
    		booking.isbooked=false;
    		
    }
}

@When("the user  did not come to the appointment with section {string},time {string}, day {int} ,week {int}, month {int}")
public void the_user_did_not_come_to_the_appointment_with_section_time_day_week_month(String string, String string2, Integer int1, Integer int2, Integer int3) {
	for (appointment p: clientt.app) {
		   if(p.Section.equals(string)&& p.time.equals(string2)&& p.day==int1 &&p.week==int2 && p.month == int3) 
		   appointment.donevisit=true;
		   else
			   appointment.donevisit=false;
		   
	}
}

@Then("the appointment not converted to visit")
public void the_appointment_not_converted_to_visit() {
	 if ( appointment.donevisit==false) 
		  
		   assertTrue(!(appointment.donevisit && booking.isbooked));

}
@Given("the user with id {string} arrived at the clinic on the specific time")
public void the_user_with_id_arrived_at_the_clinic_on_the_specific_time(String string) {
	for(appointment p:clientt.app ) {
    	if (p.uid==(string)) 
    		booking.isbooked=true;
    	else
    		booking.isbooked=false;
	}
}

@When("the user come to the second appointment with  section {string}, time {string}, day {int},week {int},month {int}")
public void the_user_come_to_the_second_appointment_with_section_time_day_week_month(String string, String string2, Integer int1, Integer int2, Integer int3) {
	for (appointment p: clientt.app) {
		   if(p.Section.equals(string)&& p.time.equals(string2)&& p.day==int1 &&p.week==int2 && p.month == int3) 
		   appointment.donevisit=true;
		   else
			   appointment.donevisit=false;
		   
	}
}

@When("the user write a note the service was good")
public void the_user_write_a_note_the_service_was_good() {
   if (appointment.donevisit==true)
	   appointment.writenote=true;
   else 
	   appointment.writenote=false;
}
@Then("the appointment converted to visit successfully and the user write a note")
public void the_appointment_converted_to_visit_successfully_and_the_user_write_a_note() {
	if ( appointment.donevisit==true && appointment.writenote==true ) 
		  
		   assertTrue(appointment.donevisit && booking.isbooked);

}





}

package newSoftware;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( plugin= {"html:target/login.html"},features="use_cases",glue="newSoftware")



public class clincTest {

	
}
	
	
	
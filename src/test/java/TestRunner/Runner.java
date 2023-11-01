package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		   features ="D:\\EclipseWorkpace\\CucumberLearning\\src\\test\\resource\\Featuer\\LoginFile.feature",
		   glue="stepdefination",
		   plugin={
					"html:target/MyReports/report.html",
					},
		   tags="@IndividualNegativeTesting @EmptyTest"
		   
		    
		
		)


public class Runner {

}

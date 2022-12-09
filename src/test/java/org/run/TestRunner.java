package org.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\KOMALA S\\eclipse-workspace\\HotelCucumber\\src\\test\\resources\\Hotel.feature",glue="org.script",
plugin="html:C:\\Users\\KOMALA S\\eclipse-workspace\\HotelCucumber\\target")
public class TestRunner {

}

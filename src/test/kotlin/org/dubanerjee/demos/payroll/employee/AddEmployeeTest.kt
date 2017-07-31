package org.dubanerjee.demos.payroll.employee

import org.junit.runner.RunWith
import cucumber.api.junit.Cucumber
import cucumber.api.CucumberOptions

@RunWith(Cucumber::class)
@CucumberOptions(plugin = arrayOf("pretty", "html:reports/cucumber"))
class AddEmployeeTest {
}
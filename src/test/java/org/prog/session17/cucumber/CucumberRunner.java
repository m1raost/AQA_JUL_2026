package org.prog.session17.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = "org.prog.session17.cucumber",
        features = "src/test/resources/features"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}

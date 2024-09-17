package com.smartBear.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/smartBear", //path to feature file
        glue = "com/smartBear/stepDef", //path to stepdef
        dryRun = false
)




public class runner {
}

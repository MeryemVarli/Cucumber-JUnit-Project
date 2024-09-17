package com.lambda.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/lambda",
        glue = "com/lambda/stepDef",
        dryRun = false




)




public class runner {
}

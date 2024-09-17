package com.tumblr.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/tumblr",
        glue = "com/tumblr/stepDef",
        tags = "@test",
        dryRun = false



)




public class runner {
}

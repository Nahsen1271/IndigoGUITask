package com.Indigo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json", // Fancy rapor için pom'da plugin ister. Maven Verify'da çalışır.
                "html:target/default-html-reports",// default  rapor için herhangi bir plugine gerek yok. Cukesta çalıştırman gerekiyor.
                "rerun:target/rerun.txt"},
        features =  "src/test/resources/features",
        glue = "com/Indigo/stepDefinitions",
        dryRun = false,
        tags = "@nahsen"

)
public class CukesRunner {
}

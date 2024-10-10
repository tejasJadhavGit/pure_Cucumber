package com.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
glue= {"stepdefinition","myHooks"},
tags=("@addingItem"),
plugin = {"pretty", "html:target/cucumber-reports","json:target/cucumber.json"},
monochrome = false,
dryRun = false
)

public class TestRunner {

}

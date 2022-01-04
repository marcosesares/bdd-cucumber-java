package br.edu.mcesar;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class StepDateDefinitions {

    private LocalDate myBirthDate;
    private LocalDate compareDate;

    @ParameterType("\\d{2}/\\d{2}/\\d{4}")
    public LocalDate myDate(String dateString) {
        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Given("my date of birth is {myDate}")
    public void my_date_of_birth_is(LocalDate myDate) {
        myBirthDate = myDate;
    }
    @When("I get the date {myDate}")
    public void i_get_the_date(LocalDate myDate) {
        compareDate = myDate;
    }

    @Then("difference in days must be {int}")
    public void dateDifferenceMustBe(Integer days) {
        Period dateDiff = myBirthDate.until(compareDate);
        Assertions.assertEquals(dateDiff.getDays(), days);
    }

    @Then("difference in months must be {int}")
    public void monthDifferenceMustBe(Integer months) {
        Period dateDiff = myBirthDate.until(compareDate);
        Assertions.assertEquals(dateDiff.getMonths(), months);
    }

    @Then("difference in years must be {int}")
    public void yearDifferenceMustBe(Integer years) {
        Period dateDiff = myBirthDate.until(compareDate);
        Assertions.assertEquals(dateDiff.getYears(), years);
    }
}

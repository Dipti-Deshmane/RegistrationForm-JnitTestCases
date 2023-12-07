package TestCasesToValidate;

import Assignment20.RegistrationForm;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class TestCasesToValidateRegistrationForm {

//Happy Test cases
    @Test public void testValidFirstName() {
        String firstName = "Dipti";
        boolean isValidFirstName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}", firstName);
        Assert.assertTrue(isValidFirstName); }

    @Test
    public void testValidLastName()
    {
        String lastName = "Borke";
        boolean isValidLastName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}", lastName);
        Assert.assertTrue(isValidLastName);
    }

    @Test
    public void testValidEmailId()
    {
        String emailId = "dipti@gmail.com";
        boolean isValidEmailId = Pattern.matches("^(.+)@(.+)$", emailId);
        Assert.assertTrue(isValidEmailId);
    }

    @Test public void testValidMobileNumber()
    {
        String mobileNumber = "91 1234567890";
        boolean isValidMobileNumber = Pattern.matches("^[0-9]{2}\s[0-9]{10}", mobileNumber);
        Assert.assertTrue(isValidMobileNumber);
    }

    @Test
    public void testValidPassword()
    {
        String password = "Pass@123";
        boolean isValidPassword = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", password);
        Assert.assertTrue(isValidPassword);
    }

//Sad test case
    @Test
    public void testInvalidFirstName()
    {
         String firstName = "dipti";
         boolean isValidFirstName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}", firstName);
         Assert.assertTrue(isValidFirstName);
    }
    @Test
    public void testInvalidLastName()
    {
        String lastName = "borke";
        boolean isValidLastName = Pattern.matches("^[A-Z]{1}[a-z]{0,20}",lastName);
        Assert.assertTrue(isValidLastName);
    }
    @Test public void testInvalidEmailId()
    {
        String emailId = "dipti17gmail.com";
        boolean isValidEmailId = Pattern.matches("^(.+)@(.+)$", emailId);
        Assert.assertTrue(isValidEmailId);
    }
    @Test
    public void testInvalidMobileNumber()
    {
        String mobileNumber = "9012345678";
        boolean isValidMobileNumber = Pattern.matches("^[0-9]{2}\s[0-9]{10}", mobileNumber);
        Assert.assertTrue(isValidMobileNumber);
    }

    @Test
    public void testInvalidPassword()
    {
        String password = "pass123";
        boolean isValidPassword = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", password);
        Assert.assertTrue(isValidPassword);
   }
}





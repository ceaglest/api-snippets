// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.rest.Twilio;
import com.twilio.rest.resource.ResourceSet;
import com.twilio.rest.resource.api.v2010.account.Address;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    ResourceSet<Address> addresses = Address.read().execute();

    // Loop over addresses and print out a property for each one.
    for (Address address : addresses) {
      System.out.println(address.getFriendlyName());
    }
  }
}
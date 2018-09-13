package login;

import pages.EntryPage;
import pages.LandingPage;
import pages.LoginPage;
import pages.ProfilePage;

public class LoginTest {


    public void checkProfileTest(){
        EntryPage entrypage = new EntryPage();
        entrypage.navtologin();

        LoginPage loginpage = new LoginPage();
        loginpage.email= "test@yahoo.com";
        loginpage.pass = "blabla";
        loginpage.dologin();

        LandingPage landingpage = new LandingPage();
        landingpage.navigatetoprofile();

        ProfilePage profilepage = new ProfilePage();
        String usernamedinpagina = profilepage.username;

        assert usernamedinpagina == "roxana";

    }

}

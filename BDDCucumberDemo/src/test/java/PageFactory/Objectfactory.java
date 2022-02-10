package PageFactory;

import Pages.HomePage;
import Pages.LoginPage;
import junit.framework.TestCase;

public class Objectfactory {


//    public TestCase Assert;
        private LoginPage logObj;
        private HomePage homeObj;

        public LoginPage getlogin()
        {
            if (logObj == null)
            {
                logObj = new LoginPage();
            }
            return logObj;
        }
        public HomePage gethomepage()
        {
            if (homeObj == null)
            {
                homeObj = new HomePage();
            }
            return homeObj;
        }
    }


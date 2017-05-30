package nl.hsac.fitnesse.fixture.slim;

import nl.hsac.fitnesse.fixture.util.ImapHelper;

public class ImapFixture extends SlimFixture {
    private ImapHelper imaphelper = new ImapHelper();

    public boolean setHostUserPassword(String host, String user, String password) {
        getImaphelper().setHost(host);
        getImaphelper().setUser(user);
        getImaphelper().setPassword(password);
        return true;
    }

    protected ImapHelper getImaphelper() {
        return imaphelper;
    }
}

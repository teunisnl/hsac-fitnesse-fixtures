package nl.hsac.fitnesse.fixture.util;

import javax.mail.*;

public class ImapHelper {
    private String host;
    private String port;
    private String user;
    private String pass;

    public boolean setHost(final String host) {
        String[] tmp = host.split(":");
        this.host = tmp[0];
        if (tmp.length > 1) {
            this.port = tmp[1];
        }
        return true;
    }

    public  boolean setUser(final String user) {
        this.user = user;
        return true;
    }

    public boolean setPassword(final String password) {
        this.pass = password;
        return true;
    }

    private void x() {
        Folder inbox;
        SearchTerm st = Term

        inbox.search(st);
    }
}

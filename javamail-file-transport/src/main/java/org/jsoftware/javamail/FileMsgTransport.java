package org.jsoftware.javamail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.URLName;
import java.io.IOException;
import java.io.OutputStream;

/**
 * {@link Transport} Saves entire email as msg file (mbox format)
 * @author szalik
 */
public class FileMsgTransport extends AbstractFileTransport {

	public FileMsgTransport(Session session, URLName urlname) {
		super(session, urlname);
	}


    @Override
    protected void writeMessage(Message message, OutputStream os) throws IOException, MessagingException {
        message.writeTo(os);
    }


    @Override
    protected String getFilenameExtension() {
        return "msg";
    }
}

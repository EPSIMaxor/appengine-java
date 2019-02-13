package com.zenika.zencontact.resource;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import com.zenika.zencontact.email.EmailService;
import java.io.IOException;

@WebServlet(name="EmailReceivedResource", value="/_ah/mail/*")
public class EmailReceivedResource extends HttpServlet {
    protected void doPost(HttpServletRequest request,
    HttpServletResponse response) throws IOException {
        EmailService.getInstance().logEmail(request);
    }

    
}
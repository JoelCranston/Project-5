package edu.pdx.cs410J.jcrans2.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import edu.pdx.cs410J.AbstractAirline;
import edu.pdx.cs410J.jcrans2.client.TestAirline;
import edu.pdx.cs410J.jcrans2.client.TestFlight;
import edu.pdx.cs410J.jcrans2.client.PingService;

/**
 * The server-side implementation of the Airline service
 */
public class PingServiceImpl extends RemoteServiceServlet implements PingService
{
    @Override
    public AbstractAirline ping()
    {
        TestAirline airline = new TestAirline();
        airline.addFlight( new TestFlight() );
        return airline;
    }
}

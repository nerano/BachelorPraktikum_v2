package mm.net;

//<<<<<<< HEAD
import org.json.JSONObject;
import org.json.XML;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;

import java.io.IOException;

//>>>>>>> branch 'master' of https://github.com/nerano/BachelorPraktikum
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
//<<<<<<< HEAD
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/*import org.snmp4j.PDU;
import org.snmp4j.ScopedPDU;
import org.snmp4j.Snmp;
import org.snmp4j.TransportMapping;
import org.snmp4j.UserTarget;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.security.AuthMD5;
import org.snmp4j.security.PrivDES;
import org.snmp4j.security.SecurityLevel;
import org.snmp4j.security.SecurityModels;
import org.snmp4j.security.SecurityProtocols;
import org.snmp4j.security.USM;
import org.snmp4j.security.UsmUser;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;*/
//>>>>>>> branch 'master' of https://github.com/nerano/BachelorPraktikum

@Path("/netmain")
public class NetMain {

//<<<<<<< HEAD
  @GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})

  public Response sayTest1() {

    int indent = 4;
    String xmlString = 
        "<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>"; 
    JSONObject jsob = XML.toJSONObject(xmlString);

    String responseString = jsob.toString(indent);
    
    Response response = Response.ok(responseString).build();

    return response; }  
  /**
   * test.
   * @return test string
   * @throws IOException if fail. 
   */
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayTest() throws IOException {
   
   /** Address targetAddress = GenericAddress.parse("udp:192.168.178.94/161");

    TransportMapping transportUdp = new DefaultUdpTransportMapping();
    //TransportMapping transportTCP = new DefaultTcpTransportMapping();

    Snmp snmp = new Snmp(transportUdp);

    USM usm = new USM(SecurityProtocols.getInstance(),
        new OctetString(MPv3.createLocalEngineID()), 0);

    SecurityModels.getInstance().addSecurityModel(usm);
    transportUdp.listen();


    // Adding new User to USM
    snmp.getUSM().addUser(new OctetString("admin"),
        new UsmUser(new OctetString("admin"),
            AuthMD5.ID,
            new OctetString("password"),
            PrivDES.ID,
            new OctetString("password")));

    //UsmUser admin = new UsmUser(new OctetString("admin"), AuthMD5.ID,
      //new OctetString("password"), PrivDES.ID, new OctetString("password"));

    // snmp.getUSM().addUser(admin);

    // Creating Target (Switch)

    UserTarget target = new UserTarget();
    target.setAddress(targetAddress);
    target.setRetries(1);
    target.setTimeout(5000);
    target.setVersion(SnmpConstants.version3);
    target.setSecurityLevel(SecurityLevel.AUTH_PRIV);
    target.setSecurityName(new OctetString("admin"));

    // Creating PDU

    PDU pdu = new ScopedPDU();
    pdu.add(new VariableBinding(new OID(".1.3.6.1.4.1.4526.10.1.1.1.3")));
    pdu.setType(pdu.GET);

    // send PDU to router
    ResponseEvent response = snmp.get(pdu, target);
    //extract the response

    PDU responsePdu = response.getResponse();
    PDU requestPdu = response.getRequest();

    // extract the address used by the agent used to send the response 
    Address peerAddress = response.getPeerAddress();

    System.out.println(peerAddress);
    System.out.println(responsePdu.toString());
    System.out.println(requestPdu.toString());**/
    return "NETtest";
//>>>>>>> branch 'master' of https://github.com/nerano/BachelorPraktikum
  }
}

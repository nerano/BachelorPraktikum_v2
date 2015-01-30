package mm.net;

import xml.parser.XmlParser;

import javax.xml.transform.TransformerException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


@Path("/netxml")
public class NetXml {

  @GET
  @Produces(MediaType.APPLICATION_XML)
  
  public Response getXml() throws TransformerException {
    XmlParser parser = new XmlParser();
    String file = "E:/9.Semester/Bachelor-Praktikum/Projekt/XML_Dateien/NodeExample.xml";
    // hier xmlString aus der Testdatei
    parser.parseXml(file);
    //String xmlString = 
    //    "<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>";    
    String responseString = parser.getDomString();
    
    Response response = Response.ok(responseString, MediaType.APPLICATION_XML).build();
    
    return response;
    
  }
  
}

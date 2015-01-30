package mm.net;

import org.json.JSONObject;

import xml.parser.XmlParser;

import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/netjson")
public class NetJson {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response getJson() throws Exception {
    XmlParser parser = new XmlParser();
    String file = "E:/9.Semester/Bachelor-Praktikum/Projekt/XML_Dateien/NodeExample.xml";
    
    int indent = 4;
    // hier das JSONObject einfügen
    parser.parseXml(file);
    //String xmlString = 
    //    "<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>"; 
    JSONObject jsob = parser.getJsonString(file);    
    String responseString = jsob.toString(indent);
    
    Response response = Response.ok(responseString, MediaType.APPLICATION_JSON).build();
    
    return response;
    
  }
  
  
  
}

package xml.parser.test;

import java.util.HashMap;

import org.json.JSONObject;

import xml.parser.NodeObjects;
import xml.parser.XmlParser;

public class ParserTest {
  
  private XmlParser parser = new XmlParser();
  private String file = 
      "E:/9.Semester/Bachelor-Praktikum/Projekt/BP4_workspace/BachelorPraktikum_own/test.xml";
  //private String file = "E:/9.Semester/Bachelor-Praktikum/Projekt/XML_Dateien/NodeExample.xml";
  
  /**
   * Testet alles außer die parseAndSave Methode.
   * 
   * @throws Exception wegen domToSting und getJsonString
   */
  public void test1() throws Exception {
    JSONObject job = new JSONObject();
    //System.out.println(parser.parseXml(file));
    this.parser.parseXml(file);
    //job = parser.getJsonString(file);
    System.out.println(parser.getDomString());
    System.out.println(parser.getDoc().getChildNodes().toString());
    System.out.println(parser.getDoc().getLastChild().getLastChild().toString());
    
    /*HashMap<String, NodeObjects> map = parser.getNodeObjects();
    for (String key : map.keySet()) {
      System.out.println("Key: " + key + " - " + map.get(key).getNodeType() + ", " + map.get(key).getComponents().toString()
          + ", " + map.get(key).getLatitude()+", "+map.get(key).getLongitude()+", "+map.get(key).getBuilding()+", "+map.get(key).getRoom());
    }*/
  }
  
  /**
   * Main Methode die den Tester anwirft (mega hässlich aber geht).
   * 
   * @param args gehört halt rein.
   */
  public static void main(String[] args) {
    ParserTest pt = new ParserTest();
    try {
      pt.test1();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

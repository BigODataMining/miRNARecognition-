import java.io.File;
import java.util.List;
import java.util.Iterator;
import java.io.FileWriter;
import java.io.IOException;
import org.dom4j.Attribute;
import org.dom4j.CDATA;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.Node;
import org.dom4j.io.XMLWriter;
import org.dom4j.io.SAXReader;


   
public class XMl2 {
	public static void main(String[] argv) throws IOException{
	try {
		  File inputFile = new File("140041.xml");
		  SAXReader reader = new SAXReader();
	      Document document = reader.read( inputFile );
	      Element classElement = document.getRootElement();//取根結點
	      List<Node> nodes = document.selectNodes("/collection/document" );//讀整個黨
	      List<Node> nodes2 = document.selectNodes("/collection/document/passage" );
	      List<Node> nodes3 = document.selectNodes("/collection/document/passage/annotation" );
	      String sourcedata_d = null;  String ids =null;  String doi = null;  String pmc=null; String figure = null;  
	      String sourcedata_f=null;String text=null;String type=null;String sourcedata_fid=null;String annotation=null;
	       String sourcedata_aid=null;String text2=null;String offset=null;String length=null;
	     
	      for (Node node : nodes) {
	       ids=(String)node.selectSingleNode("id").getText();
	       sourcedata_d=(String)node.selectSingleNode("infon").getText();
	      doi=(String)node.selectSingleNode("infon[2]").getText();
	      pmc=(String)node.selectSingleNode("infon[3]").getText();
	      figure=(String)node.selectSingleNode("infon[4]").getText();
	      sourcedata_f=(String)node.selectSingleNode("infon[5]").getText();
	      for (Node node1 : nodes2) 
	      {   
	    	  text=(String)node1.selectSingleNode("text").getText();
	    	  annotation=(String)((Element) node1.selectSingleNode("annotation")).attributeValue("id");
	  
	    	  
	      }
		  
		 }
	     
	     // Document doc = DocumentHelper.createDocument();
	         //Element root = doc.addElement("PTTCorpus");
	        // CDATA cdata = DocumentHelper.createCDATA(id+"\t"+sourcedata_d+"\t"+doi+"\t"+pmc+"\t"+figure+"\t"+sourcedata_f+"\t"+"text"+"\t"+concat+"\t"+type+"\t"+sourcedata_fid+"\t"+sourcedata_aid+"\t"
	         //+concat2+"\t"+ text2+"\t");
	         // root.add(cdata);
	        // FileWriter fw = new FileWriter("C:\123\456");
	        // OutputFormat of = OutputFormat.createPrettyPrint();
	        // of.setIndentSize(4); of.setNewlines(true);
	        // XMLWriter xw = new XMLWriter(fw, of);
	      //   xw.write(doc);
	         //xw.close();
	     
	 	   
	     
	      
	      
	}
	 catch (DocumentException e)
	 {
		 e.printStackTrace();
	 }

}
}

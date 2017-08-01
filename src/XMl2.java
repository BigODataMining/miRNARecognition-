import java.io.File;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;


   
public class XMl2 {
	public static void main(String[] argv) throws IOException{
	try {
		  File f = new File("caption_bioc"); 
          ArrayList<String> fileList = new ArrayList<String>();
          if(f.isDirectory())
          {String []s=f.list();
          for(int i=0;i<s.length-1;i++){fileList.add(s[i]);}} 
	      for(int i=0;i<fileList.size();i++) { 
		  File inputFile = new File("C:/Users/user/workspace/123/caption_bioc/"+fileList.get(i));
		  FileWriter  fw = new FileWriter("C:/123/456/Train_parse_"+fileList.get(i),true);
		  SAXReader reader = new SAXReader();
	      Document document = reader.read(inputFile);
	      Element classElement = document.getRootElement();//取根結點
	      List<Node> nodes = document.selectNodes("/collection/document");//讀整個黨 
	      String text=null,type=null,length=null,offset=null,text2=null;
	      for (Node node : nodes) {
	      List<Node> nodes2 =node.selectNodes("passage" ); int j=1;
	      for (Node node1 : nodes2) 
	      {   List<Node> nodes3 = node1.selectNodes("annotation");
	    	  text=(String)node1.selectSingleNode("text").getText();      
	    	  for (Node node2 : nodes3)
	    	  {   type=(String)node2.selectSingleNode("infon").getText();
	    		  offset=(String)((Element) node2.selectSingleNode("location")).attributeValue("offset");
	    		  length=(String)((Element) node2.selectSingleNode("location")).attributeValue("length");
	    		  text2=(String)node2.selectSingleNode("text").getText();
	    		  fw.write(text+"\t"+j+"\t"+type+"\t"+offset+"\t"+length+"\t"+text2+"\r\n");j++;}}}fw.close(); }}catch (DocumentException e){e.printStackTrace();}}} 




		     
	    	

  

	   

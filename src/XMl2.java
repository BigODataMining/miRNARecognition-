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
<<<<<<< HEAD
		  File f = new File("caption_bioc"); 
          ArrayList<String> fileList = new ArrayList<String>();
          if(f.isDirectory())
          {String []s=f.list();
          for(int i=0;i<s.length-1;i++){fileList.add(s[i]);}} 
=======
		  File f = new File("caption_bioc"); //讀取"00這個資料夾"，要記得將此資料夾放置同個java file裡面
          ArrayList<String> fileList = new ArrayList<String>(); //宣告一的動態陣列為String的型態，目的用來儲存檔名
          if(f.isDirectory()) //如果f讀到的是資料夾，就會執行
          {String []s=f.list(); //宣告一個list
          for(int i=0;i<s.length-1;i++){fileList.add(s[i]);}} //將檔名一一存到fileList動態陣列裡面 
<<<<<<< HEAD
>>>>>>> 1212ebca25ffa4e72d3f5c9fe3fff3f1391075bb
	      for(int i=0;i<fileList.size();i++){ 
		  File inputFile = new File("C:/Users/user/workspace/123/caption_bioc/"+fileList.get(i));
		  FileWriter  fw = new FileWriter("C:/123/456/Train_parse_"+fileList.get(i),true);
		  SAXReader reader = new SAXReader();
	      Document document = reader.read(inputFile);
	      Element classElement = document.getRootElement();
<<<<<<< HEAD
	      List<Node> nodes = document.selectNodes("/collection/document");
	      String offset=null,text2=null;  
	      String text=null,type=null,length=null;    
	      for (Node node : nodes) {
	      List<Node> nodes2 =node.selectNodes("passage");
	      for (Node node1 : nodes2) 
	      {   List<Node> nodes3 = node1.selectNodes("annotation");
	    	  text=(String)node1.selectSingleNode("text").getText();      
	    	  for (Node node2 : nodes3)
	    	  {   type=(String)node2.selectSingleNode("infon").getText();
	    		  offset=(String)((Element) node2.selectSingleNode("location")).attributeValue("offset");
	    		  length=(String)((Element) node2.selectSingleNode("location")).attributeValue("length");
	    		  text2=(String)node2.selectSingleNode("text").getText();
	    		  fw.write(text+"\t"+type+"\t"+offset+"\t"+length+"\t"+text2+"\r\n");}}}fw.close(); }}catch (DocumentException e){e.printStackTrace();}}} 
             



=======
	      List<Node> nodes = document.selectNodes("/collection/document");//讀整個黨
	      Document doc = DocumentHelper.createDocument();
	      String sourcedata_d = null,ids =null,doi = null,pmc=null,figure = null,offset=null,text2=null;  
	      String sourcedata_f=null,text=null,type=null,length=null;
	      for (Node node : nodes) {
	      List<Node> nodes2 =node.selectNodes("passage");
=======
	      int n=1;
	      for(int i=0;i<fileList.size();i++) { 
		  File inputFile = new File("C:/Users/user/workspace/123/caption_bioc/"+fileList.get(i));
		  SAXReader reader = new SAXReader();
	      Document document = reader.read(inputFile);
	      Element classElement = document.getRootElement();//取根結點
	      List<Node> nodes = document.selectNodes("/collection/document");//讀整個黨
	      Document doc = DocumentHelper.createDocument();
	      String sourcedata_d = null,ids =null,doi = null,pmc=null,figure = null;  
	      String sourcedata_f=null,text=null,type=null,sourcedata_fid=null,length=null;
	      String sourcedata_aid=null;String text2=null;String offset=null;
	      Element root = doc.addElement("");XMLWriter xw = null;FileWriter fw =null;
	      for (Node node : nodes) {
	      List<Node> nodes2 =node.selectNodes("passage" ); int afterConvert=1;
>>>>>>> 38f1ea7c9ca1c9ef37f2d3cafea13b6d0673ad69
	      ids=(String)node.selectSingleNode("id").getText();
	      sourcedata_d=(String)node.selectSingleNode("infon").getText();
	      doi=(String)node.selectSingleNode("infon[2]").getText();
	      pmc=(String)node.selectSingleNode("infon[3]").getText();
	      figure=(String)node.selectSingleNode("infon[4]").getText();
	      sourcedata_f=(String)node.selectSingleNode("infon[5]").getText();
	      for (Node node1 : nodes2) 
<<<<<<< HEAD
	      {   List<Node> nodes3 = node1.selectNodes("annotation");
	    	  text=(String)node1.selectSingleNode("text").getText();      
	    	  for (Node node2 : nodes3)
	    	  {   
	    		  type=(String)node2.selectSingleNode("infon").getText();
	    		  offset=(String)((Element) node2.selectSingleNode("location")).attributeValue("offset");
	    		  length=(String)((Element) node2.selectSingleNode("location")).attributeValue("length");
	    		  text2=(String)node2.selectSingleNode("text").getText();
	    		  fw.write( ids+"\t"+sourcedata_d+"\t"+doi+"\t"+pmc+"\t"+figure+"\t"+sourcedata_f+"\t"+text+"\t"+type+"\t"+offset+"\t"+length+"\t"+text2+"\r\n");
             }}}fw.close(); }}catch (DocumentException e){e.printStackTrace();}}} 



=======
	      {   List<Node> nodes3 = node1.selectNodes("annotation" );
	    	  text=(String)node1.selectSingleNode("text").getText();
	       for (Node node2 : nodes3)
	       {   type=(String)node2.selectSingleNode("infon").getText();
	    	   sourcedata_fid=(String)node2.selectSingleNode("infon[2]").getText();
	    	   sourcedata_aid=(String)node2.selectSingleNode("infon[3]").getText();
	    	   offset=(String)((Element) node2.selectSingleNode("location")).attributeValue("offset");
	    	   length=(String)((Element) node2.selectSingleNode("location")).attributeValue("length");
	    	   text2=(String)node2.selectSingleNode("text").getText();
	    	   CDATA cdata = DocumentHelper.createCDATA(ids+"\t"+sourcedata_d+"\t"+doi+"\t"+pmc+"\t"+figure+"\t"+sourcedata_f+"\t"+text+"\t"+afterConvert+"\t"+type+"\t"+sourcedata_fid+"\t"+sourcedata_aid+"\t"
	    	   +"\t"+offset+"\t"+length+"\t"+text2+"\r\n"); 
	    	   root.add(cdata);	
		       fw = new FileWriter("C:/123/456/Train_parse."+n+".xml");
		       OutputFormat of = OutputFormat.createPrettyPrint();  
		       of.setIndentSize(5); of.setNewlines(true);
	           xw = new XMLWriter(fw, of); xw.write(doc);
	    	   afterConvert++;}}}n++; xw.close();fw.close();}}catch (DocumentException e){e.printStackTrace();}}} 

  
>>>>>>> 38f1ea7c9ca1c9ef37f2d3cafea13b6d0673ad69
>>>>>>> 1212ebca25ffa4e72d3f5c9fe3fff3f1391075bb
	   

package com.aspose.diagram.examples.Pages;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.examples.Utils;

public class GetVisioPagebyID {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:GetVisioPagebyID
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetVisioPagebyID.class); 
        // Call the diagram constructor to load diagram from a VDX file
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // Set page id
        int pageid = 2;
        // Get page object by id
        Page page2 = diagram.getPages().getPage(pageid);      
        //ExEnd:GetVisioPagebyID
	}

}

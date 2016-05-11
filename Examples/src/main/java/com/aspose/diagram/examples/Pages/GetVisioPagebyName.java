package com.aspose.diagram.examples.Pages;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.examples.Utils;

public class GetVisioPagebyName {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:GetVisioPagebyName
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetVisioPagebyName.class);     
        // Call the diagram constructor to load diagram from a VSDX file
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // Set page name
        String pageName = "Flow 2";
        // Get page object by name
        Page page2 = diagram.getPages().getPage(pageName);
        //ExEnd:GetVisioPagebyName
	}

}

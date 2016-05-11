package com.aspose.diagram.examples.Introduction;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.examples.Utils;
import com.aspose.diagram.examples.TechnicalArticles.AddConnectShapes;

public class GetLibraryVersion {

	public static void main(String[] args)throws Exception
    {
    	//ExStart:GetLibraryVersion
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetLibraryVersion.class);
        // build path of an existing diagram
        String path = dataDir + "Drawing1.vsdx";

        //Call the diagram constructor to load diagram from a VDX file
        Diagram diagram = new Diagram(path);

        //Display Visio version and document modification time at different stages
        System.out.println("Visio Instance Version : " + diagram.getVersion());
        System.out.println("Full Build Number Created : " + diagram.getDocumentProps().getBuildNumberCreated());
        System.out.println("Full Build Number Edited : " + diagram.getDocumentProps().getBuildNumberEdited());
        System.out.println("Date Created : " + diagram.getDocumentProps().getTimeCreated());
        System.out.println("Date Last Edited : " + diagram.getDocumentProps().getTimeEdited());
        System.out.println("Date Last Printed : " + diagram.getDocumentProps().getTimePrinted());
        System.out.println("Date Last Saved : " + diagram.getDocumentProps().getTimeSaved());
        //ExEnd:GetLibraryVersion
	}

}

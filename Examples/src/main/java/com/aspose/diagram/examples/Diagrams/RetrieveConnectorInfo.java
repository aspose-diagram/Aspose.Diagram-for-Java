/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.diagram.examples.Diagrams;

import com.aspose.diagram.*;
import com.aspose.diagram.examples.Utils;

public class RetrieveConnectorInfo
{
    public static void main(String[] args) throws Exception
    {
    	//ExStart:RetrieveConnectorInfo
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RetrieveConnectorInfo.class);
        
        //Call the diagram constructor to load diagram from a VSD file
        Diagram diagram = new Diagram(dataDir + "RetrieveConnectorInfo.vsd");        
        for(Connect connector : (Iterable<Connect>) diagram.getPages().getPage(0).getConnects())
        {
            // Display information about the Connectors
            System.out.println("\nFrom Shape ID : " + connector.getFromSheet());
            System.out.println("To Shape ID : " + connector.getToSheet());
         }

        System.out.println("Process Completed Successfully");
        //ExEnd:RetrieveConnectorInfo
    }
}





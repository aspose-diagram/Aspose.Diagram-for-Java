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

public class RetrievePageInfo
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RetrievePageInfo.class);

        //Call the diagram constructor to load diagram
        Diagram diagram = new Diagram(dataDir+ "drawing.vdx");

        for (Page page : (Iterable<Page>) diagram.getPages())
        {
            //Checks if current page is a background page
            if (page.getBackground() == com.aspose.diagram.BOOL.TRUE)
            {
                //Display information about the background page
                System.out.println("Background Page ID : " + page.getID());
                System.out.println("Background Page Name : " + page.getName());
            }
            else
            {
                //Display information about the foreground page
                System.out.println("\nPage ID : " + page.getID());
                System.out.println("Universal Name : " + page.getNameU());
                System.out.println("ID of the Background Page : " + page.getBackPage());
            }
        }

        System.out.println("Process Completed Successfully");
    }
}





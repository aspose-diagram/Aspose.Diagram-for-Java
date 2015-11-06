/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.diagram.examples.Diagrams1;

import com.aspose.diagram.*;
import com.aspose.diagram.examples.Utils;

public class RetrieveMasterInfo
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RetrieveMasterInfo.class);


        //Call the diagram constructor to load diagram from a VDX file
        Diagram diagram = new Diagram(dataDir+ "drawing.vdx");

        for (Master master : (Iterable<Master>) diagram.getMasters())
        {
            //Display information about the masters
            System.out.println("\nMaster ID : " + master.getID());
            System.out.println("Master Name : " + master.getName());
        }

        System.out.println("Process Completed Successfully");
    }
}





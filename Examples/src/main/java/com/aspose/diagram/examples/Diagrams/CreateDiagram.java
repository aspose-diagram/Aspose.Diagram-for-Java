/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.diagram.examples.Diagrams;

import java.io.File;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class CreateDiagram
{
    public static void main(String[] args) throws Exception
    {
    	//ExStart:CreateDiagram
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CreateDiagram.class);
        // Create directory if it is not already present.
        File file = new File(dataDir);
        if (!file.exists())
        	file.mkdir();
        // initialize a new Diagram
        Diagram diagram = new Diagram();
        // save in the VSDX format
        diagram.save(dataDir + "CreateDiagram_Out.vsdx", SaveFileFormat.VSDX);
    	//ExEnd:CreateDiagram
    }
}





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

public class ExportToSWFWithoutViewer
{
    public static void main(String[] args) throws Exception
    {
    	//ExStart:ExportToSWFWithoutViewer
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExportToSWFWithoutViewer.class);

        // Call the diagram constructor to load diagram from a VSD file
        Diagram diagram = new Diagram(dataDir + "ExportToSWFWithoutViewer.vsd");

        SWFSaveOptions options = new SWFSaveOptions();
        options.setSaveFormat(SaveFileFormat.SWF);

        // Exclude the embedded viewer
        options.setViewerIncluded(false);
        diagram.save(dataDir+ "ExportToSWFWithoutViewer_Out.swf", SaveFileFormat.SWF);
    	//ExEnd:ExportToSWFWithoutViewer
    }
}





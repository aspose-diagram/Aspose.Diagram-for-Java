/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithdiagrams.exportdiagramtoswfwithoutviewer.java;

import com.aspose.diagram.*;

public class ExportDiagramToSWFWithoutViewer
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithdiagrams/exportdiagramtoswfwithoutviewer/data/";


        // Call the diagram constructor to load diagram from a VSD file
        Diagram diagram = new Diagram(dataDir+ "drawing.vsd");

        SWFSaveOptions options = new SWFSaveOptions();
        options.setSaveFormat(SaveFileFormat.SWF);

        // Exclude the embedded viewer
        options.setViewerIncluded(false);
        diagram.save(dataDir+ "Output.swf", SaveFileFormat.SWF);

        System.out.println("Process Completed Successfully");
    }
}





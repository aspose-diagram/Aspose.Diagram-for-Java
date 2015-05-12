/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithdiagrams.exportdiagramtoswf.java;

import com.aspose.diagram.*;

public class ExportDiagramToSWF
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithdiagrams/exportdiagramtoswf/data/";

        // Call the diagram constructor to load diagram from a VSD file
        Diagram diagram = new Diagram(dataDir+ "drawing.vsd");

        // Save as SWF
        diagram.save(dataDir+ "Output.swf", SaveFileFormat.SWF);

        System.out.println("Process Completed Successfully");
    }
}





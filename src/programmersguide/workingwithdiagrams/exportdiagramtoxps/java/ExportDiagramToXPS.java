/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithdiagrams.exportdiagramtoxps.java;

import com.aspose.diagram.*;

public class ExportDiagramToXPS
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithdiagrams/exportdiagramtoxps/data/";

        // Call the diagram constructor to load diagram from a VSD file
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

        // Save as XPS
        diagram.save(dataDir+ "Output.xps", SaveFileFormat.XPS);

        System.out.println("Process Completed Successfully");
    }
}





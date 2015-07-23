/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithdiagrams.protectandunprotectdiagrams.java;

import com.aspose.diagram.*;

public class ProtectAndUnprotectDiagrams
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithdiagrams/protectandunprotectdiagrams/data/";


        //Load diagram
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

        diagram.getDocumentSettings().setProtectBkgnds(BOOL.TRUE);
        diagram.getDocumentSettings().setProtectMasters(BOOL.TRUE);
        diagram.getDocumentSettings().setProtectShapes(BOOL.TRUE);
        diagram.getDocumentSettings().setProtectStyles(BOOL.TRUE);

        // save diagram
        diagram.save(dataDir+ "output.vdx", SaveFileFormat.VDX);

        System.out.println("Process Completed Successfully");

    }
}





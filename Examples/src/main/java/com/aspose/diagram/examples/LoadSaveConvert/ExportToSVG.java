/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.diagram.examples.LoadSaveConvert;

import com.aspose.diagram.*;
import com.aspose.diagram.examples.Utils;

public class ExportToSVG
{
    public static void main(String[] args) throws Exception
    {
    	//ExStart:ExportToSVG
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExportToSVG.class);

        // call the diagram constructor to load diagram from a VSD file
        Diagram diagram = new Diagram(dataDir + "ExportToSVG.vsd");

        // Save as SVG
        diagram.save(dataDir+ "ExportToSVG_Out.svg", SaveFileFormat.SVG);
        //ExEnd:ExportToSVG
    }
}





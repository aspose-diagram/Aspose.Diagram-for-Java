/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.diagram.examples.Shapes1;

import com.aspose.diagram.*;
import com.aspose.diagram.examples.Utils;

public class RotateShape
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RotateShape.class);


        // Load diagram
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

        // Add a shape and set the angle
          diagram.getPages().getPage(0).getShapes().getShape(1).setAngle(190);

        // Save diagram
        diagram.save(dataDir+ "Output.vdx", SaveFileFormat.VDX);
        System.out.println("Process Completed Successfully");

    }
}





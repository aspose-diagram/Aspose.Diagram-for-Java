/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithshapes.rotateashape.java;

import com.aspose.diagram.*;

public class RotateAShape
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/rotateashape/data/";


        // Load diagram
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

        // Add a shape and set the angle
          diagram.getPages().getPage(0).getShapes().getShape(1).setAngle(190);

        // Save diagram
        diagram.save(dataDir+ "Output.vdx", SaveFileFormat.VDX);
        System.out.println("Process Completed Successfully");

    }
}





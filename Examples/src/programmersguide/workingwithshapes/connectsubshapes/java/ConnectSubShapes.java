/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithshapes.connectsubshapes.java;

import com.aspose.diagram.*;

public class ConnectSubShapes
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/connectsubshapes/data/";


        // Set sub shape ids
        long shapeFromId = 6;
        long shapeToId = 5;

        // Load diagram
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");
        // access a particular page
        Page page = diagram.getPages().getPage(0);

        // Initialize connector shape
        Shape shape = new Shape();
        shape.getLine().getEndArrow().setValue(5);
        shape.getLine().getLineWeight().setValue(0.01388);

        // Add shape
        long connecter1Id = diagram.addShape(shape, "Dynamic connector", page.getID());
        // Connect sub-shapes
        page.connectShapesViaConnector(shapeFromId, ConnectionPointPlace.RIGHT, shapeToId, ConnectionPointPlace.LEFT, connecter1Id);
        // Save Visio drawing
        diagram.save(dataDir+ "Output.vdx", SaveFileFormat.VDX);
        System.out.println("Process Completed Successfully");
    }
}





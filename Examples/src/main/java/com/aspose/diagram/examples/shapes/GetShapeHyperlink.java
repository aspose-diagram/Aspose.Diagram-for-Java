/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.diagram.examples.shapes;

import com.aspose.diagram.*;
import com.aspose.diagram.examples.Utils;

public class GetShapeHyperlink
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetShapeHyperlink.class);




        // Call the diagram constructor to load diagram
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vdx");

        // Get a particular shape
        Shape shape = diagram.getPages().getPage(0).getShapes().getShape(1);

        for (Hyperlink hyperlink : (Iterable<Hyperlink>) shape.getHyperlinks())
        {
            System.out.println("Address: " + hyperlink.getAddress().getValue());
            System.out.println("Sub Address: " + hyperlink.getSubAddress().getValue());
            System.out.println("Description: " + hyperlink.getDescription().getValue());
        }
        System.out.println("Process Completed Successfully");
    }
}





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

public class ReadShapeData
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadShapeData.class);



        //Load diagram
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

        for (com.aspose.diagram.Shape shape : (Iterable<Shape>) diagram.getPages().getPage(0).getShapes())
        {
            if (shape.getName() == "Process1")
            {
                for (Prop property : (Iterable<Prop>) shape.getProps())
                {
                    System.out.println(property.getLabel().getValue() + ": " + property.getValue().getVal());
                }
                break;
            }
        }
        System.out.println("Process Completed Successfully");
    }
}





/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.*;
import com.aspose.diagram.examples.Utils;

public class SetFillData
{
    public static void main(String[] args) throws Exception
    {
    	//ExStart:SetFillData
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SetFillData.class);


        //Call the diagram constructor to load diagram from a VDX file
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

        //Find a particular shape and update its XForm
        for (com.aspose.diagram.Shape shape : (Iterable<Shape>) diagram.getPages().get(0).getShapes())
        {
            if (shape.getNameU().toLowerCase() == "rectangle" && shape.getID() == 1)
            {
                shape.getFill().getFillBkgnd().setValue(diagram.getPages().getPage(0).getShapes().getShape(0).getFill().getFillBkgnd().getValue());
                shape.getFill().getFillForegnd().setValue("#ebf8df");
            }
        }
        // save diagram
        diagram.save(dataDir+ "SetFillData_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:SetFillData
    }
}





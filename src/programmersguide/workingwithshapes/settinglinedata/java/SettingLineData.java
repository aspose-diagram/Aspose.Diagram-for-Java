/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithshapes.settinglinedata.java;

import com.aspose.diagram.*;

public class SettingLineData
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/settinglinedata/data/";



        //Call the diagram constructor to load diagram from a VDX file
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

//Find a particular shape and update its XForm
        for (com.aspose.diagram.Shape shape : (Iterable<Shape>) diagram.getPages().getPage(0).getShapes())
        {
            if (shape.getNameU().toLowerCase() == "rectangle" && shape.getID() == 1)
            {
                shape.getLine().getLineColor().setValue(diagram.getPages().getPage(0).getShapes().getShape(1).getFill().getFillForegnd().getValue());
                shape.getLine().getLineWeight().setValue(0.07041666666666667);
                shape.getLine().getRounding().setValue(0.1);
            }
        }
        diagram.save(dataDir+ "output.vdx", SaveFileFormat.VDX);

        System.out.println("Process Completed Successfully");
    }
}





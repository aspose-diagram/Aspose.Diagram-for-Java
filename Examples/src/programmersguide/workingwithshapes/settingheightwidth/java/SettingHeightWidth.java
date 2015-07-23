/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithshapes.settingheightwidth.java;

import com.aspose.diagram.*;

public class SettingHeightWidth
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/settingheightwidth/data/";


        //Call the diagram constructor to load diagram
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

        //Find a particular shape and update its XForm
        for (Shape shape : (Iterable<Shape>) diagram.getPages().getPage(0).getShapes())
        {
            if (shape.getNameU().toLowerCase() == "process" && shape.getID() == 1)
            {
                shape.setWidth(2 * shape.getXForm().getWidth().getValue());
                shape.setHeight(2 * shape.getXForm().getHeight().getValue());
            }
        }
        diagram.save(dataDir+ "output.vdx", SaveFileFormat.VDX);

        System.out.println("Process Completed Successfully");
    }
}





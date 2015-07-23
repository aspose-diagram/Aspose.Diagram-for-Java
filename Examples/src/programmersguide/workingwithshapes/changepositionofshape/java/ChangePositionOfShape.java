/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithshapes.changepositionofshape.java;

import com.aspose.diagram.*;

public class ChangePositionOfShape
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/changepositionofshape/data/";


        //Call the diagram constructor to load diagram from a VDX file
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

        //Find a particular shape and move its position
        for (Shape shape : (Iterable<Shape>) diagram.getPages().getPage(0).getShapes())
        {

            if (shape.getNameU().toLowerCase() == "process" && shape.getID() == 1) {
                shape.move(1, 1);
            }
        }
        diagram.save(dataDir+ "output.vdx", SaveFileFormat.VDX);

        System.out.println("Process Completed Successfully");
    }
}





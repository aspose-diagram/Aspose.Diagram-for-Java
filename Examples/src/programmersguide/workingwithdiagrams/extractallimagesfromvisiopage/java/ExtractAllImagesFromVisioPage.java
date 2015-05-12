/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithdiagrams.extractallimagesfromvisiopage.java;

import com.aspose.diagram.*;

import java.io.FileOutputStream;

public class ExtractAllImagesFromVisioPage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithdiagrams/extractallimagesfromvisiopage/data/";
        // Call the diagram constructor to load diagram
        Diagram diagram = new Diagram(dataDir+ "drawing.vsd");

        // Enter page index i.e. 0 for first one
        for (Shape shape : (Iterable<Shape>) diagram.getPages().getPage(0).getShapes())
        {
            // Filter shapes by type Foreign
            if (shape.getType() == TypeValue.FOREIGN)
            {
                shape.getForeign().toString();
                FileOutputStream fos = new FileOutputStream(dataDir+ "Image" + shape.getID() + ".bmp");
                fos.write(shape.getForeignData().getValue());
                fos.close();
            }
        }

        System.out.println("Process Completed Successfully");
    }
}





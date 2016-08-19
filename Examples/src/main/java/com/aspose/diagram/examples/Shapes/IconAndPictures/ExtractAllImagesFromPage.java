/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.diagram.examples.Shapes.IconAndPictures;

import com.aspose.diagram.*;
import com.aspose.diagram.examples.Utils;

import java.io.FileOutputStream;

public class ExtractAllImagesFromPage
{
    public static void main(String[] args) throws Exception
    {
    	//ExStart:ExtractAllImagesFromPage
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExtractAllImagesFromPage.class);
        // call a Diagram class constructor to load a VSD diagram
        Diagram diagram = new Diagram(dataDir + "ExtractAllImagesFromPage.vsd");

        // Enter page index i.e. 0 for first one
        for (Shape shape : (Iterable<Shape>) diagram.getPages().getPage(0).getShapes())
        {
            // Filter shapes by type Foreign
            if (shape.getType() == TypeValue.FOREIGN)
            {
                FileOutputStream fos = new FileOutputStream(dataDir+ "ExtractAllImages" + shape.getID() + "_Out.bmp");
                fos.write(shape.getForeignData().getValue());
                fos.close();
            }
        }
    	//ExEnd:ExtractAllImagesFromPage
    }
}





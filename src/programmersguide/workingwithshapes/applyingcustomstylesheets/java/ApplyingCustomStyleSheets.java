/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithshapes.applyingcustomstylesheets.java;

import com.aspose.diagram.*;

public class ApplyingCustomStyleSheets
{
    public static void main(String[] args) throws Exception

    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/applyingcustomstylesheets/data/";


        //Load diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsd");

        Shape sourceShape = null;

//Find the shape that you want to apply style to
        for (com.aspose.diagram.Shape shape : (Iterable<Shape>) diagram.getPages().getPage(0).getShapes())
        {
            if (shape.getName() == "Process") {
                sourceShape = shape;
                break;
            }
        }

        StyleSheet customStyleSheet = null;

//Find the required style sheet
        for (StyleSheet styleSheet : (Iterable<StyleSheet>) diagram.getStyleSheets())
        {
            if (styleSheet.getName() == "CustomStyle1")
            {
                customStyleSheet = styleSheet;
                break;
            }
        }

        if (sourceShape != null && customStyleSheet != null)
        {
            //Apply text style
            sourceShape.setTextStyle(customStyleSheet);
            //Apply fill style
            sourceShape.setFillStyle(customStyleSheet);
            //Apply line style
            sourceShape.setLineStyle(customStyleSheet);
        }

         //Save the changed diagram as VDX
        diagram.save(dataDir+ "output.vdx", SaveFileFormat.VDX);

        System.out.println("Process Completed Successfully");
    }
}





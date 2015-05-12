/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithshapes.addhyperlinkvisioshape.java;

import com.aspose.diagram.*;

public class AddHyperlinkVisioShape
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/addhyperlinkvisioshape/data/";


        // Load diagram
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

        // Initialize Hyperlink object
        Hyperlink hyperlink = new Hyperlink();
        // Set address value
        hyperlink.getAddress().setValue("http://www.google.com/");
        // Set sub address value
        hyperlink.getSubAddress().setValue("Sub address here");
        // Set description value
        hyperlink.getDescription().setValue("Description here");
        // Set name
        hyperlink.setName("MyHyperLink");

        // Add hyperlink to the shape
        diagram.getPages().getPage(0).getShapes().getShape(1).getHyperlinks().add(hyperlink);
        // Save diagram to local space
        diagram.save(dataDir+ "Output.vdx", SaveFileFormat.VDX);
        System.out.println("Process Completed Successfully");
    }
}





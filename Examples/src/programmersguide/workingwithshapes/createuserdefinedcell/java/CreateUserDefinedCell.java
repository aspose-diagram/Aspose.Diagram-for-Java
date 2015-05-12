/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithshapes.createuserdefinedcell.java;

import com.aspose.diagram.*;

public class CreateUserDefinedCell
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/createuserdefinedcell/data/";


        // Set shape name
        String shapeName = "Rectangle";

    // Load diagram
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

    // Iterate through pages
        for (Page page : (Iterable<Page>) diagram.getPages())
        {
            // Iterate through shapes
            for (Shape shape : (Iterable<Shape>) page.getShapes())
            {
                // Find out shape
                if (shape.getNameU() == shapeName)
                {
                    // Initialize user object
                    User user = new User();
                    user.setName("UserDefineCell");
                    user.getValue().setVal("800");

                    // Add user-defined cell
                    shape.getUsers().add(user);
                }
            }
        }
        diagram.save(dataDir+ "Output.vdx", SaveFileFormat.VDX);
        System.out.println("Process Completed Successfully");

    }
}





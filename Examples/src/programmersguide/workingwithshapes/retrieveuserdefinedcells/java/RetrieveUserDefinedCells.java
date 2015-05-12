/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithshapes.retrieveuserdefinedcells.java;

import com.aspose.diagram.*;

public class RetrieveUserDefinedCells
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithshapes/retrieveuserdefinedcells/data/";


        int count = 0;

        // Load diagram
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

            // Iterate through pages
        for(Page page : (Iterable<Page>) diagram.getPages())
        {
            // Iterate through shapes
            for(Shape shape : (Iterable<Shape>) page.getShapes())
            {
                System.out.println(shape.getNameU());
                // Iterate through user-defined cells
                for(User userField : (Iterable<User>) shape.getUsers())
                {
                    count++;
                    System.out.println(count + " - Name: " + userField.getNameU() + " Value: " + userField.getValue().getVal() + " Prompt: " + userField.getPrompt().getValue());
                }
            }
        }
        diagram.save(dataDir+ "Output.vdx", SaveFileFormat.VDX);
        System.out.println("Process Completed Successfully");
    }
}





/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithdiagrams.retrievingfontinformation.java;

import com.aspose.diagram.*;

public class RetrievingFontInformation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithdiagrams/retrievingfontinformation/data/";


        // Call the diagram constructor to load diagram
        Diagram diagram = new Diagram(dataDir+ "Drawing1.vsd");

        for(Font font : (Iterable<Font>) diagram.getFonts())
        {
            // Display information about the fonts
            System.out.println(font.getName());
        }

        System.out.println("Process Completed Successfully");
    }
}





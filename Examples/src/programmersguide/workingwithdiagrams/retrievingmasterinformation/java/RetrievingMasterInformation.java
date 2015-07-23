/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithdiagrams.retrievingmasterinformation.java;

import com.aspose.diagram.*;

public class RetrievingMasterInformation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithdiagrams/retrievingmasterinformation/data/";


        //Call the diagram constructor to load diagram from a VDX file
        Diagram diagram = new Diagram(dataDir+ "drawing.vdx");

        for (Master master : (Iterable<Master>) diagram.getMasters())
        {
            //Display information about the masters
            System.out.println("\nMaster ID : " + master.getID());
            System.out.println("Master Name : " + master.getName());
        }

        System.out.println("Process Completed Successfully");
    }
}





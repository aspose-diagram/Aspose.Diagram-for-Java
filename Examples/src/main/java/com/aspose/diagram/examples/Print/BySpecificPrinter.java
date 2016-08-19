package com.aspose.diagram.examples.Print;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.examples.Utils;

public class BySpecificPrinter {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:BySpecificPrinter
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(BySpecificPrinter.class); 
        // load source Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // call the print method to print whole Diagram using the printer name
        diagram.print("LaserJet1100");
        //ExEnd:BySpecificPrinter
	}

}

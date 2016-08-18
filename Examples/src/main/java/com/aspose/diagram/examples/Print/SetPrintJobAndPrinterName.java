package com.aspose.diagram.examples.Print;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.examples.Utils;

public class SetPrintJobAndPrinterName {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:SetPrintJobAndPrinterName
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SetPrintJobAndPrinterName.class);   
        // load a source Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // call the print method to print whole Diagram using the printer name and set document name in the print job
        diagram.print("LaserJet1100", "Job name while printing with Aspose.Diagram");
        //ExEnd:SetPrintJobAndPrinterName
	}

}

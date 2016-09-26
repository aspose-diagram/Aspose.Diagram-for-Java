package com.aspose.diagram.examples.Pages;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.PrintPageOrientationValue;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class SetVisioPageOrientation {

	public static void main(String[] args) throws Exception {
		// ExStart:SetVisioPageOrientation
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SetVisioPageOrientation.class) + "Pages/";
		// initialize the new visio diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

		// get Visio page
		Page page = diagram.getPages().getPage("Flow 1");
		// page orientation
		page.getPageSheet().getPrintProps().getPrintPageOrientation().setValue(PrintPageOrientationValue.LANDSCAPE);
		// save Visio
		diagram.save(dataDir + "SetPageOrientation_Out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:SetVisioPageOrientation
	}

}

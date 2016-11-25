package com.aspose.diagram.examples.Text;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class InsertTextShape {

	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(InsertTextShape.class) + "Text/";
		// create a new diagram
		Diagram diagram = new Diagram();
		// set parameters
		double PinX = 1, PinY = 1, Width = 1, Height = 1;
		String text = "Test text";
		// add text to a Visio page
		diagram.getPages().getPage(0).addText(PinX, PinY, Width, Height, text);
		// save diagram 
		diagram.save(dataDir + "InsertTextShape_out.vsdx", SaveFileFormat.VSDX);
	}
}

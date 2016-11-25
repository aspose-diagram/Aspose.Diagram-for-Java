package com.aspose.diagram.examples.VisioActiveXControls;

import com.aspose.diagram.CommandButtonActiveXControl;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class RetrieveActiveXControl {
	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(RetrieveActiveXControl.class) + "VisioActiveXControls/";
		// load a Visio diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsd");
		// get a Visio page by name
		Page page = diagram.getPages().getPage("Page-1");
		// get a shape by ID
		Shape shape = page.getShapes().getShape(1);
		// get an ActiveX control
		CommandButtonActiveXControl cbac = (CommandButtonActiveXControl)shape.getActiveXControl();
		// set width of the command button control
		cbac.setWidth(4);
		// set height of the command button control
		cbac.setHeight(4);
		// set caption of the command button control
		cbac.setCaption("Test Button");
		// save diagram
		diagram.save(dataDir + "RetrieveActiveXControl_out.vsdx", SaveFileFormat.VSDX);
	}
}

package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.ConFixedCodeValue;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class RerouteConnectors {

	public static void main(String[] args) throws Exception {
		// ExStart:RerouteConnectors
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(RerouteConnectors.class) + "Protection/";
		// call a Diagram class constructor to load the VSDX diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get page by name
		Page page = diagram.getPages().getPage("Page-3");

		// get a particular connector shape
		Shape shape = page.getShapes().getShape(18);
		// set reroute option
		shape.getLayout().getConFixedCode().setValue(ConFixedCodeValue.NEVER_REROUTE);

		// save Visio diagram
		diagram.save(dataDir + "RerouteConnectors_Out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:RerouteConnectors
	}

}

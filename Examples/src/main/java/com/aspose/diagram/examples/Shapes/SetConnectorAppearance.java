package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.ConnectorsTypeValue;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class SetConnectorAppearance {

	public static void main(String[] args) throws Exception {
		// ExStart:SetConnectorAppearance
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SetConnectorAppearance.class) + "Protection/";
		// call a Diagram class constructor to load the VSDX diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

		// get a particular page
		Page page = diagram.getPages().getPage("Page-3");
		// get a dynamic connector type shape by id
		Shape shape = page.getShapes().getShape(18);
		// set dynamic connector appearance
		shape.setConnectorsType(ConnectorsTypeValue.STRAIGHT_LINES);

		// saving Visio diagram
		diagram.save(dataDir + "SetConnectorAppearance_Out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:SetConnectorAppearance
	}

}

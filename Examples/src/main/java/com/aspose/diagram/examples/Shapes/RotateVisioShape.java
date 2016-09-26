package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class RotateVisioShape {

	public static void main(String[] args) throws Exception {
		// ExStart:RotateVisioShape
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(RotateVisioShape.class) + "Protection/";
		// call a Diagram class constructor to load the VSDX diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get page by name
		Page page = diagram.getPages().getPage("Page-3");
		// get shape by id
		Shape shape = page.getShapes().getShape(16);

		// Add a shape and set the angle
		shape.setAngle(190);

		// Save diagram
		diagram.save(dataDir + "RotateVisioShape_Out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:RotateVisioShape
	}

}

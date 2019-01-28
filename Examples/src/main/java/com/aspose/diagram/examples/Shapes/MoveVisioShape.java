package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class MoveVisioShape {

	public static void main(String[] args) throws Exception {
		// ExStart:MoveVisioShape
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(MoveVisioShape.class) + "Shapes/";
		// call a Diagram class constructor to load the VSDX diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get page by name
		Page page = diagram.getPages().getPage("Page-3");
		// get shape by id
		Shape shape = page.getShapes().getShape(16);
		// move shape from its position, it adds values in coordinates
		shape.move(1, 1);

		// save diagram
		diagram.save(dataDir + "MoveVisioShape_Out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:MoveVisioShape
	}

}

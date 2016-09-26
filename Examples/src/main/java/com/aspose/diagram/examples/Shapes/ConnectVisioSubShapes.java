package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.ConnectionPointPlace;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class ConnectVisioSubShapes {

	public static void main(String[] args) throws Exception {
		// ExStart:ConnectVisioSubShapes
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ConnectVisioSubShapes.class) + "Protection/";
		// set sub shape ids
		long shapeFromId = 2;
		long shapeToId = 4;

		// load diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// access a particular page
		Page page = diagram.getPages().getPage("Page-3");

		// initialize connector shape
		Shape shape = new Shape();
		shape.getLine().getEndArrow().setValue(4);
		shape.getLine().getLineWeight().setValue(0.01388);

		// add shape
		long connecter1Id = diagram.addShape(shape, "Dynamic connector", page.getID());
		// connect sub-shapes
		page.connectShapesViaConnector(shapeFromId, ConnectionPointPlace.RIGHT, shapeToId, ConnectionPointPlace.LEFT,
				connecter1Id);
		// save Visio drawing
		diagram.save(dataDir + "ConnectVisioSubShapes_Out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:ConnectVisioSubShapes
	}

}

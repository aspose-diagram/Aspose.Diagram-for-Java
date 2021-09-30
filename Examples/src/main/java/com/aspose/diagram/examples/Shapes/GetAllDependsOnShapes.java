package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class GetAllDependsOnShapes {
	public static void main(String[] args) throws Exception {
		// ExStart:GetAllDependsOnShapes
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(GetAllDependsOnShapes.class) + "Shapes/";
		// call a Diagram class constructor to load the VSDX diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get shape by id
		Shape shape = diagram.getPages().getPage("Page-3").getShapes().getShape(16);
		// get dependsOnShapes shapes
    long[] shapeids = shape.dependsOnShapes();    
    System.out.println(shape.getName() + " - " + shapeids[0]);
		// ExEnd:GetAllDependsOnShapes
	}
}

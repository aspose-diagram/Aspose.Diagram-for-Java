package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class RetrieveInheritedFillData {
	public static void main(String[] args) throws Exception {
		// ExStart:AddWindowElementInVisio
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(RetrieveInheritedFillData.class) + "Shapes/";

		// Call the diagram constructor to load a VSDX diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

		// Get page by ID
		Page page = diagram.getPages().getPage("Page-1");
		// Get shape by ID
		Shape shape = page.getShapes().getShape(1);
		// Get the fill formatting values
		System.out.println(shape.getInheritFill().getFillBkgnd().getValue());
		System.out.println(shape.getInheritFill().getFillForegnd().getValue());
		System.out.println(shape.getInheritFill().getFillPattern().getValue());
		System.out.println(shape.getInheritFill().getShapeShdwObliqueAngle().getValue());
		System.out.println(shape.getInheritFill().getShapeShdwOffsetX().getValue());
		System.out.println(shape.getInheritFill().getShapeShdwOffsetY().getValue());
		System.out.println(shape.getInheritFill().getShapeShdwScaleFactor().getValue());
		System.out.println(shape.getInheritFill().getShapeShdwType().getValue());
		System.out.println(shape.getInheritFill().getShdwBkgnd().getValue());
		System.out.println(shape.getInheritFill().getShdwBkgndTrans().getValue());
		System.out.println(shape.getInheritFill().getShdwForegnd().getValue());
		System.out.println(shape.getInheritFill().getShdwForegndTrans().getValue());
		System.out.println(shape.getInheritFill().getShdwPattern().getValue());
	}
}

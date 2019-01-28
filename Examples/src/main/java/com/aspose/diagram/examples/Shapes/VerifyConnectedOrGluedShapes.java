package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class VerifyConnectedOrGluedShapes {

	public static void main(String[] args) throws Exception {
		// ExStart:VerifyConnectedOrGluedShapes
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(VerifyConnectedOrGluedShapes.class) + "Shapes/";
		// call a Diagram class constructor to load the VSD diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// set two shape ids
		long ShapeIdOne = 15;
		long ShapeIdTwo = 16;

		// get Visio page by name
		Page page = diagram.getPages().getPage("Page-3");

		// get Visio shapes by ids
		Shape ShapedOne = page.getShapes().getShape(ShapeIdOne);
		Shape ShapedTwo = page.getShapes().getShape(ShapeIdTwo);

		// determine whether shapes are connected
		boolean connected = ShapedOne.isConnected(ShapedTwo);
		System.out.println("Shapes are connected: " + connected);

		// determine whether shapes are glued
		boolean glued = ShapedOne.isGlued(ShapedTwo);
		System.out.println("Shapes are Glued: " + glued);
		// ExEnd:VerifyConnectedOrGluedShapes
	}

}

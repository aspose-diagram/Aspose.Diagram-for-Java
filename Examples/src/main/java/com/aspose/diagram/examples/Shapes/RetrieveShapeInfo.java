/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.*;
import com.aspose.diagram.examples.Utils;

public class RetrieveShapeInfo {
	public static void main(String[] args) throws Exception {
		// ExStart:RetrieveShapeInfo
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(RetrieveShapeInfo.class) + "Protection/";

		// Load diagram
		Diagram diagram = new Diagram(dataDir + "RetrieveShapeInfo.vsd");

		for (com.aspose.diagram.Shape shape : (Iterable<Shape>) diagram.getPages().getPage(0).getShapes()) {
			// Display information about the shapes
			System.out.println("\nShape ID : " + shape.getID());
			System.out.println("Name : " + shape.getName());
			System.out.println("Master Shape : " + shape.getMaster().getName());
		}
		// ExEnd:RetrieveShapeInfo
	}
}

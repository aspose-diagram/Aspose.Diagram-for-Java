package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.Prop;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class ReadShapePropByName {

	public static void main(String[] args) throws Exception {
		// ExStart:ReadShapePropByName
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ReadShapePropByName.class) + "Protection/";
		// call a Diagram class constructor to load the VSDX diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get page by name
		Page page = diagram.getPages().getPage("Page-3");

		for (Shape shape : (Iterable<Shape>) page.getShapes()) {
			if (shape.getName() == "Process1") {
				Prop property = shape.getProps().getProp("Name1");
				System.out.println(property.getLabel().getValue() + ": " + property.getValue().getVal());
			}
		}
		// ExEnd:ReadShapePropByName
	}

}

package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class ChangeShapeSize {

	public static void main(String[] args) throws Exception {
		// ExStart:ChangeShapeSize
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ChangeShapeSize.class) + "Protection/";

		// call a Diagram class constructor to load the VSDX diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get page by name
		Page page = diagram.getPages().getPage("Page-1");
		// get shape by id
		Shape shape = page.getShapes().getShape(796);
		// alter the size of Shape
		shape.setWidth(2 * shape.getXForm().getWidth().getValue());
		shape.setHeight(2 * shape.getXForm().getHeight().getValue());
		// save diagram
		diagram.save(dataDir + "ChangeShapeSize_Out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:ChangeShapeSize
	}

}

package com.aspose.diagram.examples.Shapes.Glue;

import com.aspose.diagram.ConnectionPointPlace;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class GlueVisioShapes {

	public static void main(String[] args) throws Exception {
		// ExStart:GlueVisioShapes
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(GlueVisioShapes.class) + "Glue/";
		// Load diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

		// Get a particular page
		Page page = diagram.getPages().getPage("Page-1");
		// set shape id
		long shape1_ID = 7;
		long shape2_ID = 494;
		// Glue shapes
		page.glueShapes(shape1_ID, ConnectionPointPlace.CENTER, shape2_ID);

		// Save diagram
		diagram.save(dataDir + "GlueVisioShapes_Out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:GlueVisioShapes
	}

}

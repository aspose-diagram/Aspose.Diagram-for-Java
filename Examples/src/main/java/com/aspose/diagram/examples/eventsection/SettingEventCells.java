package com.aspose.diagram.examples.eventsection;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;
import com.aspose.diagram.examples.Diagrams.RetrieveFontInfo;

public class SettingEventCells {
	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SettingEventCells.class) + "eventsection/";
		// load diagram
		Diagram diagram = new Diagram(dataDir + "TestTemplate.vsdm");
		// get page
		Page page = diagram.getPages().get(0);
		// get shape id
		long shapeId = page.addShape(3.0, 3.0, 0.36, 0.36, "Square");
		// get shape
		Shape shape = page.getShapes().getShape(shapeId);

		// set event cells in the ShapeSheet
		shape.getEvent().getEventXFMod().getUfe().setF("CALLTHIS(\"ThisDocument.ShowAlert\")");
		shape.getEvent().getEventXFMod().getUfe().setF("CALLTHIS(\"ThisDocument.ShowAlert\")");
		shape.getEvent().getEventXFMod().getUfe().setF("CALLTHIS(\"ThisDocument.ShowAlert\")");
		shape.getEvent().getEventXFMod().getUfe().setF("CALLTHIS(\"ThisDocument.ShowAlert\")");
		shape.getEvent().getEventXFMod().getUfe().setF("CALLTHIS(\"ThisDocument.ShowAlert\")");
		shape.getEvent().getEventXFMod().getUfe().setF("CALLTHIS(\"ThisDocument.ShowAlert\")");

		// save diagram
		diagram.save(dataDir + "Output_Java.vsdm", SaveFileFormat.VSDM);
	}
}

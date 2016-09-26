package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Master;
import com.aspose.diagram.MasterCollection;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class CopyShape {

	public static void main(String[] args) throws Exception {
		// ExStart:CopyShape
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(CopyShape.class) + "Protection/";
		// load a source Visio
		Diagram srcVisio = new Diagram(dataDir + "Drawing1.vsdx");

		// initialize a new Visio
		Diagram newDiagram = new Diagram();

		// add all masters from the source Visio diagram
		MasterCollection originalMasters = srcVisio.getMasters();
		for (Master master : (Iterable<Master>) originalMasters)
			newDiagram.addMaster(srcVisio, master.getName());

		// get the page object from the original diagram
		Page SrcPage = srcVisio.getPages().getPage("Page-1");
		// copy themes from the source diagram
		newDiagram.copyTheme(srcVisio);
		// copy pagesheet of the source Visio page
		newDiagram.getPages().get(0).getPageSheet().copy(SrcPage.getPageSheet());

		// copy shapes from the source Visio page
		for (Shape shape : (Iterable<Shape>) SrcPage.getShapes()) {
			newDiagram.getPages().get(0).getShapes().add(shape);
		}
		// save the new Visio
		newDiagram.save(dataDir + "CopyShapes_Out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:CopyShape
	}

}

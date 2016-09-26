package com.aspose.diagram.examples.Layers;

import com.aspose.diagram.BOOL;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.Layer;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class AddLayer {

	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(AddLayer.class) + "Layers/";

		// load a source Visio diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get Visio page
		Page page = diagram.getPages().getPage("Page-1");

		// initialize a new Layer class object
		Layer layer = new Layer();
		// set Layer name
		layer.getName().setValue("Layer1");
		// set Layer Visibility
		layer.getVisible().setValue(BOOL.TRUE);
		// set the color checkbox of Layer
		layer.setColorChecked(BOOL.TRUE);
		// add Layer to the particular page sheet
		page.getPageSheet().getLayers().add(layer);

		// get shape by ID
		Shape shape = page.getShapes().getShape(3);
		// assign shape to this new Layer
		shape.getLayerMem().getLayerMember().setValue(Integer.toString(layer.getIX()));
		// save diagram
		diagram.save(dataDir + "AddLayer_Out.vsdx", SaveFileFormat.VSDX);
	}

}

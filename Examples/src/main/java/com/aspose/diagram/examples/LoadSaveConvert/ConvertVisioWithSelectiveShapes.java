package com.aspose.diagram.examples.LoadSaveConvert;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SVGSaveOptions;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.ShapeCollection;
import com.aspose.diagram.examples.Utils;

public class ConvertVisioWithSelectiveShapes {

	public static void main(String[] args) throws Exception 
	{
		// ExStart:ConvertVisioWithSelectiveShapes
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ConvertVisioWithSelectiveShapes.class) + "LoadSaveConvert\\";
		
		// call the diagram constructor to load diagram from a VSD file
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // create an instance SVG save options class
        SVGSaveOptions options = new SVGSaveOptions();
        ShapeCollection shapes = options.getShapes();

        // get shapes by page index and shape ID, and then add in the shape collection object
        shapes.add(diagram.getPages().get(0).getShapes().getShape(1));
        shapes.add(diagram.getPages().get(0).getShapes().getShape(2));

        // save Visio drawing
        diagram.save(dataDir + "SelectiveShapes_out.svg", options);
		// ExEnd:ConvertVisioWithSelectiveShapes
	}

}

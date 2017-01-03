package com.aspose.diagram.examples.ShapeGradientFill;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.GradientFill;
import com.aspose.diagram.GradientFillDir;
import com.aspose.diagram.GradientStop;
import com.aspose.diagram.GradientStopCollection;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;


public class ModifyShapeGradientFill {

	public static void main(String[] args) throws Exception 
	{
		String dataDir = Utils.getSharedDataDir(ModifyShapeGradientFill.class) + "ShapeGradientFill\\";

		// load a Visio drawing
		Diagram diagram = new Diagram(dataDir + "ShapewithGradientFill.vsdx");
		// get page by name
		Page page = diagram.getPages().getPage("Page-1");
		// get shape by ID
		Shape shape = page.getShapes().getShape(1);
		// get the gradient fill properties
		GradientFill gradientfill = shape.getFill().getGradientFill();
		// get the gradient stops
		GradientStopCollection stops = gradientfill.getGradientStops();
		// get the gradient stop by index
		GradientStop stop = stops.get(0);
		// set gradient stop properties
		stop.getColor().getUfe().setF("");
		stop.getPosition().setValue(0.5);
		gradientfill.getGradientDir().setValue(GradientFillDir.RECTANGLE_FROM_BOTTOM_RIGHT);
		gradientfill.getGradientAngle().setValue(0.7853981633974501);
		// save the Visio drawing
		diagram.save(dataDir + "ShapewithGradientFill_out.vsdx", SaveFileFormat.VSDX);


	}

}

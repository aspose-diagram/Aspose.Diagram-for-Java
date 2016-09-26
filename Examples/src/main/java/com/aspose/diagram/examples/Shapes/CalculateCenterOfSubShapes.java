package com.aspose.diagram.examples.Shapes;

import java.awt.geom.AffineTransform;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class CalculateCenterOfSubShapes {

	public static void main(String[] args) throws Exception {
		// ExStart:CalculateCenterOfSubShapes
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(CalculateCenterOfSubShapes.class) + "Protection/";

		// load Visio diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get group shape
		Shape shape = diagram.getPages().get(0).getShapes().getShape(138);
		// get sub-shape of the group shape
		Shape subShape = shape.getShapes().getShape(140);

		AffineTransform m = new AffineTransform();
		// apply the translation vector
		m.translate(-(float) subShape.getXForm().getLocPinX().getValue(),
				-(float) subShape.getXForm().getLocPinY().getValue());
		// set the elements of that matrix to a rotation
		m.rotate((float) subShape.getXForm().getAngle().getValue());
		// apply the translation vector
		m.translate((float) subShape.getXForm().getPinX().getValue(), (float) subShape.getXForm().getPinY().getValue());

		// get pinx and piny
		double pinx = m.getTranslateX();
		double piny = m.getTranslateY();

		// calculate the sub-shape pinx and piny
		double resultx = shape.getXForm().getPinX().getValue() - shape.getXForm().getLocPinX().getValue() - pinx;
		double resulty = shape.getXForm().getPinY().getValue() - shape.getXForm().getLocPinY().getValue() - piny;
		// ExEnd:CalculateCenterOfSubShapes
	}

}

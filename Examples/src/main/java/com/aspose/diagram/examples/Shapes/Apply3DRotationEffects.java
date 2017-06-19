package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.BOOL;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.RotationTypeValue;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class Apply3DRotationEffects {

	public static void main(String[] args)  throws Exception
	{
		 // The path to the documents directory.
	    String dataDir = Utils.getSharedDataDir(Apply3DRotationEffects.class) + "Shapes\\";
	    // load diagram
	    Diagram diagram = new Diagram(dataDir+"Drawing1.vsdx");
	    // get shape by ID and page name
	    Shape shape = diagram.getPages().getPage("Page-1").getShapes().getShape(796);
	            
	    // set 3D rotation properties
	    shape.getThreeDFormat().getRotationXAngle().setValue(2.61);
	    shape.getThreeDFormat().getRotationYAngle().setValue(2.61);
	    shape.getThreeDFormat().getRotationZAngle().setValue(3);
	    shape.getThreeDFormat().getRotationType().setValue(RotationTypeValue.PARALLEL);
	    shape.getThreeDFormat().getPerspective().setValue(0);
	    shape.getThreeDFormat().getDistanceFromGround().setValue(0);
	    shape.getThreeDFormat().getKeepTextFlat().setValue(BOOL.TRUE);
	    // save drawing
	    diagram.save(dataDir + "Apply3DRotationEffects_Out.vsdx", SaveFileFormat.VSDX);
	}

}

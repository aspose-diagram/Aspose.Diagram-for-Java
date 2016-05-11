package com.aspose.diagram.examples.TextBoxes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class SetShapeTextPositionAtRight {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:SetShapeTextPositionAtRight
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SetShapeTextPositionAtRight.class);  
        // load source Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // get shape
        long shapeid = 1;
        Shape shape = diagram.getPages().getPage("Page-1").getShapes().getShape(shapeid);

        // set text position at the right,
        // TxtLocPinX = "TxtWidth*0" and TxtPinX = "Width*1"
        shape.getTextXForm().getTxtLocPinX().setValue(0);
        shape.getTextXForm().getTxtPinX().setValue(shape.getXForm().getWidth().getValue());
        // set orientation angle
        double angleDeg = 0;
        double angleRad = (Math.PI / 180) * angleDeg;
        shape.getTextXForm().getTxtAngle().setValue(angleRad);
        
        // save Visio diagram in the local storage
        diagram.save(dataDir + "SetShapeTextPositionAtRight_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:SetShapeTextPositionAtRight
	}

}

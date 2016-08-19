package com.aspose.diagram.examples.TextBoxes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class SetShapeTextPositionAtTop {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:SetShapeTextPositionAtTop
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SetShapeTextPositionAtTop.class);   
        // load source Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        // get shape
        long shapeid = 1;
        Shape shape = diagram.getPages().getPage("Page-1").getShapes().getShape(shapeid);

	    // set text position at the top,
	    // TxtLocPinY = "TxtHeight*0" and TxtPinY = "Height*1"
	    shape.getTextXForm().getTxtLocPinY().setValue(0);
	    shape.getTextXForm().getTxtPinY().setValue(shape.getXForm().getHeight().getValue());
	
	    // set orientation angle
	    double angleDeg = 0;
	    double angleRad = (Math.PI / 180) * angleDeg;
	    shape.getTextXForm().getTxtAngle().setValue(angleRad);

        // save Visio diagram in the local storage
        diagram.save(dataDir + "SetShapeTextPositionAtTop_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:SetShapeTextPositionAtTop
	}

}

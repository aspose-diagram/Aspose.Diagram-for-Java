package com.aspose.diagram.examples.Shapes.Glue;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class GlueContainerShape {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:GlueContainerShape
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GlueContainerShape.class);   
        // Load diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // Get a particular page
        Page page = diagram.getPages().getPage("Page-1");

        // The ID of shape which is glue from Aspose.Diagram.Shape.
        long shapeFromId = 779;
        // The location on the first connection index where to glue
        int shapeToBeginConnectionIndex = 72;
        // The location on the end connection index where to glue
        int shapeToEndConnectionIndex = 73;
        // The ID of shape where to glue to Aspose.Diagram.Shape.
        long shapeToId = 743;

        // Glue shapes in container
        page.glueShapesInContainer(shapeFromId, shapeToBeginConnectionIndex, shapeToEndConnectionIndex, shapeToId);

        // Glue shapes in container using connection name
        // page.GlueShapesInContainer(fasId, "U05L", "U05R", cabinetId1);

        // Save diagram
        diagram.save(dataDir + "GlueContainerShape_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:GlueContainerShape
	}

}

package com.aspose.diagram.examples.Shapes;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class SetXFormdata {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:SetXFormdata
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SetXFormdata.class); 
        // call a Diagram class constructor to load the VSD diagram
        Diagram diagram = new Diagram(dataDir + "SetXFormdata.vsd");

        //Find a particular shape and update its XForm
        for(Shape shape :(Iterable<Shape>) diagram.getPages().get(0).getShapes())
        {
            if (shape.getNameU().toLowerCase() == "process" && shape.getID() == 1)
            {
                shape.getXForm().getPinX().setValue(5);
                shape.getXForm().getPinY().setValue(5);
            }
        }
        // save diagram
        diagram.save(dataDir + "SetXFormdata_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:SetXFormdata
	}

}

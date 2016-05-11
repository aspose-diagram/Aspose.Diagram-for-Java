package com.aspose.diagram.examples.Layers;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.LayerMem;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class ConfigureShapeLayers {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:ConfigureShapeLayers
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConfigureShapeLayers.class);
        
        //call the diagram constructor to load visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        
        // iterate through the shapes
        for (Shape shape : (Iterable<Shape>) diagram.getPages().getPage("Page-1").getShapes())
        {
            if (shape.getName().toLowerCase() == "shape1")
            {
                //Add shape1 in first two layers. Here "0;1" are indexes of the layers
                LayerMem layer = shape.getLayerMem();
                layer.getLayerMember().setValue("0;1");
            }
            else if (shape.getName().toLowerCase() == "shape2")
            {
                //Remove shape2 from all the layers
                LayerMem layer = shape.getLayerMem();
                layer.getLayerMember().setValue("");
            }
            else if (shape.getName().toLowerCase() == "shape3")
            {
                //Add shape3 in first layer. Here "0" is index of the first layer
                LayerMem layer = shape.getLayerMem();
                layer.getLayerMember().setValue("0");
            }
        }
        // save diagram
        diagram.save(dataDir + "ConfigureShapeLayers_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:ConfigureShapeLayers
	}

}

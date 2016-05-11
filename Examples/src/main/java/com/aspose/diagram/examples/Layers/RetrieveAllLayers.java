package com.aspose.diagram.examples.Layers;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Layer;
import com.aspose.diagram.Page;
import com.aspose.diagram.examples.Utils;

public class RetrieveAllLayers {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:RetrieveAllLayers
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RetrieveAllLayers.class);  
        // load Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        // get Visio page
        Page page = diagram.getPages().getPage("Page-1");

        // iterate through the layers
        for (Layer layer : (Iterable<Layer>) page.getPageSheet().getLayers())
        {
            System.out.println("Name: " + layer.getName().getValue());
            System.out.println("Visibility: " + layer.getVisible().getValue());
            System.out.println("Status: " + layer.getStatus().getValue());
        }
        //ExEnd:RetrieveAllLayers
	}

}

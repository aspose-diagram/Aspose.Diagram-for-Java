package com.aspose.diagram.examples.Hyperlinks;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Hyperlink;
import com.aspose.diagram.Page;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class GetHyperlinks {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:GetHyperlinks
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetHyperlinks.class);  
        // load source Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        // get page by name
        Page page = diagram.getPages().getPage("Page-1");
        // get shape by ID
        Shape shape = page.getShapes().getShape(1);
        // iterate through the hyperlinks
        for (Hyperlink hyperlink :(Iterable<Hyperlink>) shape.getHyperlinks())
        {
            System.out.println("Address: " + hyperlink.getAddress().getValue());
            System.out.println("Sub Address: " + hyperlink.getSubAddress().getValue());
            System.out.println("Description: " + hyperlink.getDescription().getValue());
        }       
        //ExEnd:GetHyperlinks
	}

}

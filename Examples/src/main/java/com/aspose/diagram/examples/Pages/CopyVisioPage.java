package com.aspose.diagram.examples.Pages;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Master;
import com.aspose.diagram.MasterCollection;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class CopyVisioPage {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:CopyVisioPage
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CopyVisioPage.class);
        
        // Call the diagram constructor to load diagram from a VSD file
        Diagram originalDiagram = new Diagram(dataDir + "Drawing1.vsd");

        // initialize the new visio diagram
        Diagram newDiagram = new Diagram();

        // add all masters from the source Visio diagram
        MasterCollection originalMasters = originalDiagram.getMasters();
        for (Master master : (Iterable<Master>) originalMasters) {
           newDiagram.addMaster(originalDiagram, master.getName());
        }

        // get the page object from the original diagram
        Page SrcPage = originalDiagram.getPages().getPage("Page-1");
        // set page name
        SrcPage.setName("new page");
        
     // it calculates max page id
        int max = 0;
        if (newDiagram.getPages().getCount() != 0)
            max = newDiagram.getPages().get(0).getID();

        for (int i = 1; i < newDiagram.getPages().getCount(); i++)
        {
            if (max < newDiagram.getPages().get(i).getID())
                max = newDiagram.getPages().get(i).getID();
        }
               
        int MaxPageId = max;
        // set page id
        SrcPage.setID(MaxPageId);
        // add reference of the original diagram page
        newDiagram.getPages().add(SrcPage);

        // remove first empty page
        newDiagram.getPages().remove(newDiagram.getPages().get(0));

        // save diagram in VDX format
        newDiagram.save(dataDir + "CopyVisioPage_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:CopyVisioPage
	}

}

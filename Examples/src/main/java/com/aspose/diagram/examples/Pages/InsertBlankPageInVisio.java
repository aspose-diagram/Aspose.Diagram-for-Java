package com.aspose.diagram.examples.Pages;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class InsertBlankPageInVisio {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:InsertBlankPageInVisio
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(InsertBlankPageInVisio.class);   
        // load diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        
        // it calculates max page id
        int max = 0;
        if (diagram.getPages().getCount() != 0)
            max = diagram.getPages().get(0).getID();

        for (int i = 1; i < diagram.getPages().getCount(); i++)
        {
            if (max < diagram.getPages().get(i).getID())
                max = diagram.getPages().get(i).getID();
        }
        
        // Initialize a new page object
        Page newPage = new Page();
        // Set name
        newPage.setName("new page");
        // Set page ID
        newPage.setID(max + 1);

        // Or try the Page constructor
        // Page newPage = new Page(MaxPageId + 1);

        // Add a new blank page
        diagram.getPages().add(newPage);

        // Save diagram
        diagram.save(dataDir + "InsertBlankPageInVisio_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:InsertBlankPageInVisio
	}

}

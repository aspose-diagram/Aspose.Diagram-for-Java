package com.aspose.diagram.examples.Window;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Window;
import com.aspose.diagram.examples.Utils;

public class RetrieveWindowElementsOfDiagram {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:RetrieveWindowElementsOfDiagram
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RetrieveWindowElementsOfDiagram.class);    
        // load source Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        // iterate through the window elements
        for (Window window :(Iterable<Window>) diagram.getWindows())
        {
            System.out.println("ID: " + window.getID());
            System.out.println("Type: " + window.getWindowType());
            System.out.println("Window height: " + window.getWindowHeight());
            System.out.println("Window width: " + window.getWindowWidth());
            System.out.println("Window state: " + window.getWindowState());
        }
        //ExEnd:RetrieveWindowElementsOfDiagram
	}

}

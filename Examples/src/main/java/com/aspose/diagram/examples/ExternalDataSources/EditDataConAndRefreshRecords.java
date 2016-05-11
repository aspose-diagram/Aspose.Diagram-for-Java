package com.aspose.diagram.examples.ExternalDataSources;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class EditDataConAndRefreshRecords {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:EditDataConAndRefreshRecords
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(EditDataConAndRefreshRecords.class);
        // load source Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsd");
        // set connecting string
        diagram.getDataConnections().get(0).setConnectionString("Data Source=MyServer;Initial Catalog=MyDB;Integrated Security=True");
        // set command
        diagram.getDataConnections().get(0).setCommand("SELECT * from Project with(nolock)");
        // save Visio diagram
        diagram.save(dataDir + "EditDataConAndRefreshRecords_Out.vdx", SaveFileFormat.VDX);
        //ExEnd:EditDataConAndRefreshRecords
	}

}

package com.aspose.diagram.examples.Shapes.TimeLine;

import com.aspose.diagram.DateTime;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.TimeLineHelper;
import com.aspose.diagram.examples.Utils;

public class ConfigureTimeLine {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:ConfigureTimeLine
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConfigureTimeLine.class); 
        // Load diagram
        Diagram diagram = new Diagram(dataDir + "DrawingTimeLine.vsdx");
        int shapeid = 1;
        // Get timeline shape
        Shape timeline = diagram.getPages().getPage("Page-1").getShapes().getShape(shapeid);

        // Initialize TimeLineHlper object
        TimeLineHelper timelineHelper = new TimeLineHelper(timeline);

        // Set start time
        timelineHelper.setTimePeriodStart(new DateTime(2014, 12, 21));
        // Set end time
        timelineHelper.setTimePeriodFinish(new DateTime(2015, 2, 19));

        // Set date format
        //timelineHelper.setDateFormatForBE(21);
        // Set date format for intm of timeline shape   
        //timelineHelper.setDateFormatForIntm(21);

        // Or

        // Set date format string for start and finish of timeline shape
        timelineHelper.setDateFormatStringForBE("yyyy-MM-dd");
        // Set date format string for intm of timeline shape
        timelineHelper.setDateFormatStringForIntm("yyyy-MM-dd");

        // Save to VDX format
        diagram.save(dataDir + "ConfigureTimeLine_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:ConfigureTimeLine
	}

}

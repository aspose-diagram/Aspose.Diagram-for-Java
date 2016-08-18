package com.aspose.diagram.examples.Shapes.TimeLine;

import com.aspose.diagram.DateTime;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.TimeLineHelper;
import com.aspose.diagram.examples.Utils;

public class RefreshTimeLine {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:RefreshTimeLine
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RefreshTimeLine.class);   
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
        timelineHelper.setDateFormatForBE(21);

        //revive milestones on the timeline
        timelineHelper.refreshTimeLine();

        // Save to VDX format
        diagram.save(dataDir + "RefreshTimeLine_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:RefreshTimeLine
	}
}

package com.aspose.diagram.examples.Diagrams;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.LayoutDirection;
import com.aspose.diagram.LayoutOptions;
import com.aspose.diagram.LayoutStyle;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class LayOutShapesInCompactTreeStyle {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:LayOutShapesInCompactTreeStyle
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(LayOutShapesInCompactTreeStyle.class);
        
        String fileName = "LayOutShapesInCompactTreeStyle.vdx";
        // load an existing Visio diagram
        Diagram diagram = new Diagram(dataDir + fileName);

        // set layout options 
        LayoutOptions compactTreeOptions = new LayoutOptions();
        compactTreeOptions.setLayoutStyle(LayoutStyle.COMPACT_TREE);
        compactTreeOptions.setEnlargePage(true);

        // set layout direction as DownThenRight and then save
        compactTreeOptions.setDirection(LayoutDirection.DOWN_THEN_RIGHT);
        diagram.layout(compactTreeOptions);
        diagram.save(dataDir + "sample_down_right.vdx", SaveFileFormat.VDX);

        // set layout direction as DownThenLeft and then save
        diagram = new Diagram(dataDir + fileName);
        compactTreeOptions.setDirection(LayoutDirection.DOWN_THEN_LEFT);
        diagram.layout(compactTreeOptions);
        diagram.save(dataDir + "sample_down_left.vdx", SaveFileFormat.VDX);

        // set layout direction as RightThenDown and then save
        diagram = new Diagram(dataDir + fileName);
        compactTreeOptions.setDirection(LayoutDirection.RIGHT_THEN_DOWN);
        diagram.layout(compactTreeOptions);
        diagram.save(dataDir + "sample_right_down.vdx", SaveFileFormat.VDX);

        // set layout direction as LeftThenDown and then save
        diagram = new Diagram(dataDir + fileName);
        compactTreeOptions.setDirection(LayoutDirection.LEFT_THEN_DOWN);
        diagram.layout(compactTreeOptions);
        diagram.save(dataDir + "sample_left_down.vdx", SaveFileFormat.VDX);
        //ExEnd:LayOutShapesInCompactTreeStyle
	}

}

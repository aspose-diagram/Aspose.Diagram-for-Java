package com.aspose.diagram.examples.Shapes.IconAndPictures;

import java.io.File;
import java.nio.file.Files;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.TypeValue;
import com.aspose.diagram.examples.Utils;

public class ReplaceShapePicture {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:ReplaceShapePicture
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReplaceShapePicture.class); 
        // call a Diagram class constructor to load the VSD diagram
        Diagram diagram = new Diagram(dataDir + "ExtractAllImagesFromPage.vsd");
        
        // convert image into bytes array       
        File fi = new File(dataDir + "Picture.png");
        byte[] fileContent = Files.readAllBytes(fi.toPath());
        		
        // Enter page index i.e. 0 for first one
        for (Shape shape : (Iterable<Shape>) diagram.getPages().getPage(0).getShapes())
        {
            // Filter shapes by type Foreign
            if (shape.getType() == TypeValue.FOREIGN)
            {
                //replace picture shape
            	shape.getForeignData().setValue(fileContent);
            }
        }

        // save diagram
        diagram.save(dataDir + "ReplaceShapePicture_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:ReplaceShapePicture
	}

}

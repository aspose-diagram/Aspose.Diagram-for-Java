package com.aspose.diagram.examples.Text;

import com.aspose.diagram.Char;
import com.aspose.diagram.Cp;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.StyleValue;
import com.aspose.diagram.Txt;
import com.aspose.diagram.examples.Utils;

public class ApplyFontOnText {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:ApplyFontOnText
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ApplyFontOnText.class);   
        
        // load diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        // get page by name
        Page page = diagram.getPages().getPage("Page-1");
        // get shape by ID
        Shape shape = page.getShapes().getShape(1);
        // clear shape text values and chars
        shape.getText().getValue().clear();
        shape.getChars().clear();

        // mark character run and add text
        shape.getText().getValue().add(new Cp(0));
        shape.getText().getValue().add(new Txt("TextStyle_Regular\n"));
        shape.getText().getValue().add(new Cp(1));
        shape.getText().getValue().add(new Txt("TextStyle_Bold_Italic\n"));
        shape.getText().getValue().add(new Cp(2));
        shape.getText().getValue().add(new Txt("TextStyle_Underline_Italic\n"));
        shape.getText().getValue().add(new Cp(3));
        shape.getText().getValue().add(new Txt("TextStyle_Bold_Italic_Underline"));

        // add formatting characters
        shape.getChars().add(new Char());
        shape.getChars().add(new Char());
        shape.getChars().add(new Char());
        shape.getChars().add(new Char());

        //set properties e.g. color, font, size and style etc.
        shape.getChars().get(0).setIX(0);
        shape.getChars().get(0).getColor().setValue("#FF0000");
        shape.getChars().get(0).getFont().setValue(4);
        shape.getChars().get(0).getSize().setValue(0.22);
        shape.getChars().get(0).getStyle().setValue(StyleValue.UNDEFINED);

        //set properties e.g. color, font, size and style etc.
        shape.getChars().get(1).setIX(1);
        shape.getChars().get(1).getColor().setValue("#FF00FF");
        shape.getChars().get(1).getFont().setValue(4);
        shape.getChars().get(1).getSize().setValue(0.22);
        shape.getChars().get(1).getStyle().setValue(StyleValue.BOLD | StyleValue.ITALIC);

        //set properties e.g. color, font, size and style etc.
        shape.getChars().get(2).setIX(2);
        shape.getChars().get(2).getColor().setValue("#00FF00");
        shape.getChars().get(2).getFont().setValue(4);
        shape.getChars().get(2).getSize().setValue(0.22);
        shape.getChars().get(2).getStyle().setValue(StyleValue.UNDERLINE | StyleValue.ITALIC);

        //set properties e.g. color, font, size and style etc.
        shape.getChars().get(3).setIX(3);
        shape.getChars().get(3).getColor().setValue("#3333FF");
        shape.getChars().get(3).getFont().setValue(4);
        shape.getChars().get(3).getSize().setValue(0.22);
        shape.getChars().get(3).getStyle().setValue(StyleValue.BOLD | StyleValue.ITALIC | StyleValue.UNDERLINE);
        // save diagram
        diagram.save(dataDir + "ApplyFontOnText_Out.vsdx", SaveFileFormat.VSDX);
        //ExEnd:ApplyFontOnText
	}

}

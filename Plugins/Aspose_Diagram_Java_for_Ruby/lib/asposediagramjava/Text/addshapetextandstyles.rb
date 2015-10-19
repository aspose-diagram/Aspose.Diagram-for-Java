module Asposediagramjava
  module AddShapeTextAndStyles
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # Get a particular shape
        shape = diagram.getPages().getPage("Flow 1").getShapes().getShape(1)
        
        # Clear shape text values and chars
        shape.getText().getValue().clear()
        shape.getChars().clear()

        # Mark character run and add text
        shape.getText().getValue().add(Rjb::import('com.aspose.diagram.Cp').new(0))
        shape.getText().getValue().add(Rjb::import('com.aspose.diagram.Txt').new("TextStyle_Regular"))
        shape.getText().getValue().add(Rjb::import('com.aspose.diagram.Cp').new(1))
        shape.getText().getValue().add(Rjb::import('com.aspose.diagram.Txt').new("TextStyle_Bold_Italic"))
        shape.getText().getValue().add(Rjb::import('com.aspose.diagram.Cp').new(2))
        shape.getText().getValue().add(Rjb::import('com.aspose.diagram.Txt').new("TextStyle_Underline_Italic"))
        shape.getText().getValue().add(Rjb::import('com.aspose.diagram.Cp').new(3))
        shape.getText().getValue().add(Rjb::import('com.aspose.diagram.Txt').new("TextStyle_Bold_Italic_Underline"))

        # Add formatting characters
        shape.getChars().add(Rjb::import('com.aspose.diagram.Char').new)
        shape.getChars().add(Rjb::import('com.aspose.diagram.Char').new)
        shape.getChars().add(Rjb::import('com.aspose.diagram.Char').new)
        shape.getChars().add(Rjb::import('com.aspose.diagram.Char').new)

        style_value = Rjb::import('com.aspose.diagram.StyleValue')

        # Set properties e.g. color, font, size and style etc.
        shape.getChars().getChar(0).setIX(0)
        shape.getChars().getChar(0).getColor().setValue("#FF0000")
        shape.getChars().getChar(0).getFont().setValue(4)
        shape.getChars().getChar(0).getSize().setValue(0.22)
        shape.getChars().getChar(0).getStyle().setValue(style_value.UNDEFINED)

        # Set properties e.g. color, font, size and style etc.
        shape.getChars().getChar(1).setIX(1)
        shape.getChars().getChar(1).getColor().setValue("#FF00FF")
        shape.getChars().getChar(1).getFont().setValue(4)
        shape.getChars().getChar(1).getSize().setValue(0.22)
        shape.getChars().getChar(1).getStyle().setValue(style_value.BOLD | style_value.ITALIC)

        # Set properties e.g. color, font, size and style etc.
        shape.getChars().getChar(2).setIX(2)
        shape.getChars().getChar(2).getColor().setValue("#00FF00")
        shape.getChars().getChar(2).getFont().setValue(4)
        shape.getChars().getChar(2).getSize().setValue(0.22)
        shape.getChars().getChar(2).getStyle().setValue(style_value.UNDERLINE | style_value.ITALIC)

        # Save diagram
        diagram.save(data_dir + "AddShapeTextAndStyles.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Added shape text and styles."
    end
  end
end

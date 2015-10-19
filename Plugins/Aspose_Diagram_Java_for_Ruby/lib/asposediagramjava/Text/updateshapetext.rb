module Asposediagramjava
  module UpdateShapeText
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        shapes = diagram.getPages().getPage(0).getShapes()
        
        i = 0
        while i < shapes.getCount()
            shape = shapes.get(i)
            if shape.getNameU() == "Process" && shape.getID() == 1
                shape.getText().getValue().clear()
                shape.getText().getValue().add(Rjb::import('com.aspose.diagram.Txt').new("New Text"))
            end
            i +=1
        end
        
        # Save diagram
        diagram.save(data_dir + "UpdateShapeText.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Updated shape text."
    end
  end
end

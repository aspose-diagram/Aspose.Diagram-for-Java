module Asposediagramjava
  module ChangeShapePosition
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        shapes = diagram.getPages().getPage(0).getShapes()
        
        i = 0
        while i < shapes.getCount()
            shape = shapes.get(i)
            if shape.getNameU() == "Process" && shape.getID() == 2
                shape.move(1, 1)
            end
            i +=1
        end
        
        # Save diagram
        diagram.save(data_dir + "ChangeShapePosition.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Changed postion of a shape."
    end
  end
end

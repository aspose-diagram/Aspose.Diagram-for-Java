module Asposediagramjava
  module SetShapeHeightAndWidth
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        shapes = diagram.getPages().getPage(0).getShapes()
        
        i = 0
        while i < shapes.getCount()
            shape = shapes.get(i)
            if shape.getNameU() == "Process" && shape.getID() == 1
                shape.setWidth(2 * shape.getXForm().getWidth().getValue())
                shape.setHeight(2 * shape.getXForm().getHeight().getValue())
            end
            i +=1
        end
        
        # Save diagram
        diagram.save(data_dir + "SetShapeHeightAndWidth.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Set height and width of shape."
    end
  end
end

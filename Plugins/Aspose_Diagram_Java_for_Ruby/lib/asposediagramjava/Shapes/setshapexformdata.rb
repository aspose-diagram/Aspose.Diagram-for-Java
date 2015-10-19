module Asposediagramjava
  module SetShapeXFormData
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        shapes = diagram.getPages().getPage(0).getShapes()
        
        i = 0
        while i < shapes.getCount()
            shape = shapes.get(i)
            if shape.getNameU() == "process" && shape.getID() == 1
                shape.getXForm().getPinX().setValue(5)
                shape.getXForm().getPinY().setValue(5)
            end
            i +=1
        end
        
        # Save diagram
        diagram.save(data_dir + "SetShapeXFormData.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Set visio shape's XForm data."
    end
  end
end
